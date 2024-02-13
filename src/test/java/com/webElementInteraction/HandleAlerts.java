package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleAlerts extends TestBase {

    @Test
    public void handlingAlerts(){
        driver.get("https://www.letskodeit.com/practice");

        WebElement alertBtn = driver.findElement(By.id("alertbtn"));
        WebElement confBtn = driver.findElement(By.id("confirmbtn"));
        WebElement nameTxtFld = driver.findElement(By.name("enter-name"));

        alertBtn.click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert button - ALERT TEXT: "+alert.getText());
        alert.accept();

        driver.switchTo().defaultContent();

        confBtn.click();
        System.out.println("Alert button - CONF TEXT: "+alert.getText());
        alert.dismiss();

        driver.switchTo().defaultContent();

        nameTxtFld.sendKeys("Tester");
        confBtn.click();
        System.out.println("Message: "+alert.getText());
        alert.accept();


    }
}
