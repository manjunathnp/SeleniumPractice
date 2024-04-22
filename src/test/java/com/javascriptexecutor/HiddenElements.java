package com.javascriptexecutor;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Scanner;

public class HiddenElements extends TestBase {
    @Test
    public void hiddenElementValidation() throws InterruptedException {
        driver.get("https://codenboxautomationlab.com/practice/#google_vignette");

        WebElement element=driver.findElement(By.name("show-hide"));
        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        //hideButton.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].style.visibility='visible';",element);
        element.sendKeys("testing");
        Thread.sleep(3000);
    }

}
