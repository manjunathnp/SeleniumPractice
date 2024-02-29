package com.practice;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Session3 extends TestBase {

    @Test
    public void implicitlyWaitDemo(){
        driver.get("https://demo.nopcommerce.com/");

        WebElement loginLink = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        loginLink.click();
    }

    @Test
    public void validateExplicitWait(){
        driver.get("https://demo.nopcommerce.com/");

        WebElement loginLink = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();


    }

    @Test
    public void validateFluentWait(){
        driver.get("https://demo.nopcommerce.com/");
        WebElement loginLink = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));

        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver).
                                withTimeout(Duration.ofSeconds(15)).
                                pollingEvery(Duration.ofSeconds(5)).
                                ignoring(NoSuchElementException.class);


        fluentWait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
    }
}
