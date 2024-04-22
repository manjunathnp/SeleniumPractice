package com.testNGPract.TestNGRetry;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBrowser extends TestBase {

    @Test
    public void checkBrowserName(){
        String browserName = ((RemoteWebDriver)driver).getCapabilities().getBrowserName();

        Assert.assertEquals(browserName.equalsIgnoreCase("chrome"), true);

    }

    @Test
    public void customiseTest(){
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--download.default_directory=/path/to/download/");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("window-size=500,800");
        driver = new ChromeDriver(chromeOptions);

        String fontfamily=driver.findElement(By.id("id")).getCssValue("font-family");
    }
}
