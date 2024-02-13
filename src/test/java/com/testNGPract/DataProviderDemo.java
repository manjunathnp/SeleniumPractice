package com.testNGPract;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
    WebDriver driver;

    @BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


    }

    @Test(dataProvider = "loginTestData")
    public void loginTest(String username, String password){
        driver.get("https://askomdch.com/account/");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.name("login")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Logout']")).isDisplayed());

        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
    }


    @AfterClass
    public void tearDown(){
        driver.quit();

    }

    @DataProvider(name="loginTestData")
    String [][] loginData(){
        String data[][] = {
                            {"testertesting1", "testertesting1"},
                            {"testertesting2", "testertesting2"},
                            {"testertesting", "testertesting"}
                          };
        return data;
    }
}
