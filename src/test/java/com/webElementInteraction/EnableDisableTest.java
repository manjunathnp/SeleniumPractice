package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EnableDisableTest extends TestBase {
    @Test
    public void validateEnableDisableFunctionality() throws InterruptedException {
        driver.get("https://www.letskodeit.com/practice");

        WebElement enableBtn = driver.findElement(By.id("enabled-button"));
        WebElement disableBtn = driver.findElement(By.id("disabled-button"));
        WebElement textFld = driver.findElement(By.xpath("//input[@id='enabled-example-input']"));

        System.out.println("Is textFld enabled? "+textFld.isEnabled()); //true

        disableBtn.click();
        Thread.sleep(2000);
        System.out.println("Is textFld enabled? "+textFld.isEnabled()); //false

        enableBtn.click();
        System.out.println("Is textFld enabled? "+textFld.isEnabled()); //true

        System.out.println("Entering text in textFld: ");
        textFld.sendKeys("textFld enabled!");




    }
}
