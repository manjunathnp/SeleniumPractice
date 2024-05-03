package com.important;

import com.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class ImportantTest extends TestBase {

    @Test
    public void waitsDemoTest(){
        driver.get("https://example.com");
        WebElement element = driver.findElement(By.id("id"));

        // Implicitly Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

        // Fluent Wait
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver).
                                            withTimeout(Duration.ofSeconds(30)).
                                            pollingEvery(Duration.ofSeconds(5)).
                                            ignoring(NullPointerException.class);
        fluentWait.until(ExpectedConditions.visibilityOf(element)).sendKeys("test");
    }

    @Test
    public void captureScreenshotDemo() throws IOException {
        // Capture Screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("ScreenshotDir"+File.separator+"test1.png");
        FileUtils.copyFile(srcFile, destFile);
    }

    @Test
    public void findBrokenLinks() throws IOException {
        driver.get("https://demosite.com");

        List<WebElement> links=driver.findElements(By.tagName("a"));
        for(WebElement link: links){
            String url=link.getAttribute("href");

            HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();

            int responseCode = connection.getResponseCode();
            if(responseCode >= 400){
                System.out.println(url+" is BROKEN - Status Code: "+responseCode);
            }
        }
    }

    @Test
    public void chromeOptionsDemo(){
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--ignore-certificate-errors");//
        chromeOptions.addArguments("--download.default_directory=/path/to/download");
        chromeOptions.addArguments("--window-size=500,800");//

        driver.get("http://admin:password@test.com");

        chromeOptions.addArguments("--auth-server-whitelist=*");
        chromeOptions.addArguments("--auth-negotiate-delegate-whitelist=*");
        chromeOptions.addArguments("--auth-basic-username=admin");
        chromeOptions.addArguments("--auth-basic-password=password");
    }

    @Test
    public void JSDemoTest(){
        WebElement element=driver.findElement(By.id("id"));
        String value="value";
        JavascriptExecutor js=(JavascriptExecutor) driver;

        //click on element
        js.executeScript("arguments[0].click();", element);

        //enter value
        js.executeScript("arguments[0].value=arguments[1];", element, value);

        //highlight element
        js.executeScript("arguments[0].setAttribute('background: yellow; border: 2px solid red;');", element);

        //find hidden element
        js.executeScript("arguments[0].style.visibility='visible';", element);

        //set attribute value
        js.executeScript("arguments[0].setAttribute('attributeName','newValue');", element);

        //scroll window
        js.executeScript("window.scrollBy(0, -500)"); //up
        js.executeScript("window.scrollBy(0, 500)"); //down

        //handle alert
        js.executeScript("window.alert = function(){ return true; }");
    }

    @Test
    public void fileDownloadValidation(){
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("download.default_directory=path/to/download");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://example.com");
        WebElement downloadLink = driver.findElement(By.id("downloadLink"));
        downloadLink.click();

        String downloadedPath = "/path/to/download";
        String downloadedFileName = "testFile";

        File downloadedFile = new File(downloadedPath+File.separator+downloadedFileName+"*.txt");
        Assert.assertTrue(downloadedFile.exists());
    }

    @Test
        public void fileDownloadValidationTest(){
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.linkText("SomeFile.txt")).click();

        String downloadedPath = "/Users/manjunathnp/Downloads/";
        String downloadedFileName = "SomeFile.txt";
        File downloadedFile = new File(downloadedPath+downloadedFileName);
        Assert.assertTrue(downloadedFile.exists(), "No Such File");
    }
}
