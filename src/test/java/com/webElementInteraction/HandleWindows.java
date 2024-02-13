package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HandleWindows extends TestBase {

    @Test
    public void validateMultiWindow() throws InterruptedException {
        driver.get("https://www.letskodeit.com/practice");

        WebElement openWindowBtn = driver.findElement(By.id("openwindow"));
        WebElement openTabBtn = driver.findElement(By.id("opentab"));

        openWindowBtn.click();
        /*Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowIDs = new ArrayList<>(windowHandles);

        String parentWindowID = windowIDs.get(0);
        String childWindowID = windowIDs.get(1);*/

        System.out.println("Child Window Title: "+driver.switchTo().window(childWindowIDGetter()).getTitle());
        System.out.println("Parent Window Title: "+driver.switchTo().window(parentWindowIDGetter()).getTitle());

        openTabBtn.click();
        /*Set<String> windowHandlesT = driver.getWindowHandles();
        List<String> windowIDsT = new ArrayList<>(windowHandlesT);
        String parentWindowIDT = windowIDsT.get(0);
        String childWindowIDT = windowIDsT.get(1);*/

        //System.out.println("Tabbed Window Title: "+driver.switchTo().window(childWindowIDT).getTitle());
        System.out.println("Tabbed Window Title: "+driver.switchTo().window(childWindowTabIDGetter()).getTitle());
    }


    public String parentWindowIDGetter(){
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowIDs = new ArrayList<>(windowHandles);

        String parentWindowID = windowIDs.get(0);
        String childWindowID = windowIDs.get(1);

        return parentWindowID;
    }

    public String childWindowIDGetter(){
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowIDs = new ArrayList<>(windowHandles);

        String parentWindowID = windowIDs.get(0);
        String childWindowID = windowIDs.get(1);

        return childWindowID;
    }


    public String childWindowTabIDGetter(){
        Set<String> windowHandlesT = driver.getWindowHandles();
        List<String> windowIDsT = new ArrayList<>(windowHandlesT);
        String parentWindowIDT = windowIDsT.get(0);
        String childWindowIDT = windowIDsT.get(1);

        return childWindowIDT;
    }

}
