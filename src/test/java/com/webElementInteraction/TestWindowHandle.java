package com.webElementInteraction;

import com.base.TestBase;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestWindowHandle extends TestBase {

    @Test
    public void validateWindows(){
        driver.get("https://www.letskodeit.com/practice");
        WebElement openWindowBtn = driver.findElement(By.id("openwindow"));

        openWindowBtn.click();

        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowIDs = new ArrayList<>(windowHandles);
        String parentWindowId = windowIDs.get(0);
        String childWindowId = windowIDs.get(1);

        System.out.println("Child Window Title: "+driver.switchTo().window(childWindowId).getTitle());
        driver.switchTo().window(parentWindowId);
        System.out.println("Parent Window Title: "+driver.getTitle());

    }

    @Test
    public void validateTabs(){
        driver.get("https://www.letskodeit.com/practice");

        WebElement openTabBtn = driver.findElement(By.id("opentab"));
        openTabBtn.click();

        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowIDs = new ArrayList<>(windowHandles);
        String parentWindowId = windowIDs.get(0);
        String childTabId = windowIDs.get(1);

        System.out.println("Child Tab Title: "+driver.switchTo().window(childTabId).getTitle());
        driver.switchTo().window(parentWindowId);
        System.out.println("Parent Window Title: "+driver.getTitle());
    }
}
