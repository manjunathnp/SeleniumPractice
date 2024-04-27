package com.important.practice;

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
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class Test1 extends TestBase {

    String currentDateTime = new SimpleDateFormat("dd:MMM:YYYY_HH:MM_a").format(new Date());
    @Test
    public void waitTest(){
        driver.get("https://askomdch.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement element=driver.findElement(By.linkText("id"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

        FluentWait<WebDriver> fluentWait=new FluentWait<>(driver).
                                        withTimeout(Duration.ofSeconds(60)).
                                        pollingEvery(Duration.ofSeconds(10)).
                                        ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    @Test
    public void captureScreenshotTest() throws IOException {
        driver.get("https://askomdch.com");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("ScreenshotsDir"+File.separator+currentDateTime+".png");
        FileUtils.copyFile(srcFile, destFile);
    }

    @Test
    public void simpleDateTimeTest(){
        String currentDateTime = new SimpleDateFormat("dd-MMM-YYYY_hh:mm_a").format(new Date());
        System.out.println(currentDateTime);
    }

    @Test
    public void findBrokenLinks() throws IOException {
        driver.get("https://askomdch.com");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        for(WebElement link: links){
            String url = link.getAttribute("href");

            HttpURLConnection connection=(HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();

            int responseCode = connection.getResponseCode();
            if(responseCode>=400){
                System.out.println(url+" is Broken Link");
            }
        }
    }

    @Test
    public void chromeOptionsDemoTest(){
        //ChromeOptions chromeOptions=new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        //chromeOptions.addArguments("--auth-server-whitelist=*");
        //chromeOptions.addArguments("--auth-negotiate-delegate-whitelist=*");
        /*chromeOptions.addArguments("--auth-basic-username=admin");
        chromeOptions.addArguments("--auth-basic-password=admin");*/
        //chromeOptions.addArguments("download.default_directory=path/to/download");
        //chromeOptions.addArguments("--ignore-certificate-errors");
        //driver = new ChromeDriver(chromeOptions);


        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        WebElement webText=driver.findElement(By.xpath("//h3[normalize-space()='Basic Auth']"));
        System.out.println(webText.getText());


        /*chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("window.size=800,500");*/
    }

    @Test
    public void JSDemoTest(){
        driver.get("https://example.com");
        WebElement element=driver.findElement(By.id("id"));
        String value = "test";

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value=arguments[1];", element, value);
        js.executeScript("arguments[0].click();", element);
        js.executeScript("arguments[0].setAttribute('attribute', 'newValue');", element);
        js.executeScript("arguments[0].style.visibility='visible';", element);
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",element);
        js.executeScript("window.alert = function(){return true;};");
        js.executeScript("window.scrollBy(0,-500);");
        js.executeScript("window.scrollBy(0,500);");

    }

    @Test
    public void elementHighlighter() throws InterruptedException {
        driver.get("https://askomdch.com");
        WebElement shopNowButton = driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;')", shopNowButton);

        Thread.sleep(3000);
        Assert.assertTrue(shopNowButton.isDisplayed(), "Element Unidentified");
    }

}
