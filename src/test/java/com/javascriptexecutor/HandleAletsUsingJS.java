package com.javascriptexecutor;

import com.base.TestBase;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class HandleAletsUsingJS extends TestBase {
    @Test(expectedExceptions = {UnhandledAlertException.class, NoSuchElementException.class})
    public void handlingAlerts() throws InterruptedException {
        driver.navigate().to("https://www.letskodeit.com/practice");

        WebElement alertBtn = driver.findElement(By.id("alertbtn"));
        WebElement confBtn = driver.findElement(By.id("confirmbtn"));
        WebElement nameTxtFld = driver.findElement(By.name("enter-name"));

        alertBtn.click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.alert = function() {return true;}");

        confBtn.click();
        Thread.sleep(3000);
        js.executeScript("window.alert = function() {return false;}");

    }
}
