package com.practice.session1;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitsPractice extends TestBase {
    WebElement element = driver.findElement(By.id("test"));

    @Test
    public void implicitlyWaitTest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void explicitWaitTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    @Test
    public void fluentWaitTest(){
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver).
                                        pollingEvery(Duration.ofSeconds(10)).
                                        withTimeout(Duration.ofSeconds(20)).
                                        ignoring(NullPointerException.class, ElementClickInterceptedException.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
