package com.essentials;

import com.base.TestBase;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IdentifyBrowser extends TestBase {

    @BeforeMethod
    public void launchApplication(){
        driver.get("https://askomdch.com");
    }

    @Test
    public void getBrowserName(){
        String browserName = ((RemoteWebDriver)driver).getCapabilities().getBrowserName();
        String browserVersion = ((RemoteWebDriver)driver).getCapabilities().getBrowserVersion();
        System.out.println("Launched Browser: "+browserName);
        System.out.println("Current version of "+browserName+": "+browserVersion);
    }

    @Test
    public void getPlatformName(){
        String platformName = String.valueOf(((RemoteWebDriver)driver).getCapabilities().getPlatformName());
        System.out.println("Platform: "+platformName);
    }
}
