package com.essentials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeOptionsDemo {
    public WebDriver driver;
    ChromeOptions chromeOptions = new ChromeOptions();

    @Test
    public void headlessMode(){
        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);

        driver.get("https://askomdch.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://askomdch.com/");
    }

    @Test
    public void launchIncognito(){
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);

        driver.get("https://askomdch.com");
    }

    @Test
    public void ignoreCertificateErrors(){
        chromeOptions.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        //driver.get("https://expired.badssl.com/");
        driver.get("https://untrusted-root.badssl.com/");

    }

}
