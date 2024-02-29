package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAuthDemo extends TestBase {

    @Test
    public void validateAuthPopup(){
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

        String expectedText = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText();
        String actualText = "Congratulations! You must have the proper credentials.";

        Assert.assertEquals(actualText, expectedText);
    }
}
