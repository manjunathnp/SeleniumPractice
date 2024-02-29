package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTipTest extends TestBase {

    @Test
    public void validateTooTip() throws InterruptedException {
        driver.get("https://demoqa.com/tool-tips/");
        WebElement hoverBtn = driver.findElement(By.id("toolTipButton"));
        String expectedToolTip = "You hovered over the Button";
        String actualToolTip = hoverBtn.getAttribute("title");

        Actions action = new Actions(driver);
        action.moveToElement(hoverBtn).build().perform();
        Thread.sleep(2500);

        //Assert.assertEquals(actualToolTip, expectedToolTip);
    }
}
