package com.testNGPract;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.Alert.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SetBrowser {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    @Parameters({"browser"})
    public void setUp(String br){
        System.out.println("Inside setUp()");
        if(br.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().minimize();
        }else if(br.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

    }

    //@Test
    @Parameters({"browser"})
    public void browserSetup(String br){
        driver.get("https://askomdch.com");

        Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();

        String browserName = capabilities.getBrowserName();
        Assert.assertEquals(br.toLowerCase(), browserName.toLowerCase());
        System.out.println(br+" Browser setup successful!");

        Alert alert = driver.switchTo().alert();
        wait.until(ExpectedConditions.alertIsPresent());
        //alert.authenticateUsing(new UserAndPassword(username, password));




    }

    @Test
    public void poapTest(){
        // Assuming you have the WebDriver instance and the credentials
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--auth-server-whitelist=*");
        options.addArguments("--auth-negotiate-delegate-whitelist=*");
        options.addArguments("--auth-basic-username=username");
        options.addArguments("--auth-basic-password=password");
        driver = new ChromeDriver(options);*/

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
        System.out.println("Inside tearDown()");

    }



}
