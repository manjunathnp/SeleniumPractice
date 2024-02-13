package com.practice;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PractSession1 extends TestBase {

    @BeforeClass
    public void launchApp(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Test
    public void pageTitleValidation(){
        String expectedTilte = "Swag Labs";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTilte);
    }

    @Test
    public void pageTextValidation(){
        String expectedText = "Products";
        String actualText = driver.findElement(By.xpath("//span[text()='Products']")).getText();

        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void imageValidation() throws InterruptedException {
        boolean backpackImagePresence =
                driver.findElement(By.cssSelector("img[alt='Sauce Labs Backpack']")).isDisplayed();
        Thread.sleep(2000);
        Assert.assertTrue(backpackImagePresence);


    }

    @Test
    public void imageAltValidation(){
            String expectedBackpackImageAlt = "Sauce Labs Backpack";
            String actualBackpackImageAlt=
                    driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']")).getAttribute("alt");

            Assert.assertEquals(actualBackpackImageAlt, expectedBackpackImageAlt);
    }

}
