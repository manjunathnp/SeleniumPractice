package com.essentials;

import com.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LaunchBrowsers{
    public WebDriver driver;

    @Test
    public void launchGoogleChrome(){
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "path_to_driver");
        driver = new ChromeDriver();
        System.out.println("Launched Browser: "+
                ((RemoteWebDriver)driver).getCapabilities().getBrowserName()+
                " - "+((RemoteWebDriver)driver).getCapabilities().getBrowserVersion());
    }

    @Test
    public void launchMozillaFirefox(){
        WebDriverManager.firefoxdriver().setup();
        //System.setProperty("webdriver.chrome.driver", "path_to_driver");
        driver = new FirefoxDriver();
        System.out.println("Launched Browser: "+
                ((RemoteWebDriver)driver).getCapabilities().getBrowserName()+
                " - "+((RemoteWebDriver)driver).getCapabilities().getBrowserVersion());
    }

    @Test
    public void launchSafari(){
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();
        System.out.println("Launched Browser: "+
                ((RemoteWebDriver)driver).getCapabilities().getBrowserName()+
                " - "+((RemoteWebDriver)driver).getCapabilities().getBrowserVersion());
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
