package com.waits;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumWaitsDemo extends TestBase {



    //@Test
    public void validateImplicitlyWait(){
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement loginLink = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));

        loginLink.click();

        String welcomeText = driver.findElement(By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']")).getText();
        Assert.assertEquals(welcomeText, "Welcome, Please Sign In!");

    }

    //@Test
    public void validateExplicitWait(){
        driver.get("https://demo.nopcommerce.com/");
        WebElement loginLink = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();

        String welcomeText = driver.findElement(By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']")).getText();
        Assert.assertEquals(welcomeText, "Welcome, Please Sign In!");

    }

    //@Test
    public void validateFluentWait(){
        driver.get("https://demo.nopcommerce.com/");
        WebElement loginLink = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));

        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver).
                                withTimeout(Duration.ofSeconds(15)).
                                pollingEvery(Duration.ofSeconds(5)).
                                ignoring(NullPointerException.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();

        String welcomeText = driver.findElement(By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']")).getText();
        Assert.assertEquals(welcomeText, "Welcome, Please Sign In!");

    }

    //@Test
    public void validateWaitUsingGenericExplicitMethod(){
        driver.get("https://demo.nopcommerce.com/");
        WebElement loginLink = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));

        elementClick(loginLink);

        String welcomeText = driver.findElement(By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']")).getText();
        Assert.assertEquals(welcomeText, "Welcome, Please Sign In!");
    }

    @Test
    public void validateWaitUsingGenericFluentWaitMethod(){
        driver.get("https://demo.nopcommerce.com/");
        WebElement loginLink = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));

        fluentElementClick(loginLink);

        String welcomeText = driver.findElement(By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']")).getText();
        Assert.assertEquals(welcomeText, "Welcome, Please Sign In!");
    }


}
