package com.practice;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WindowHandle extends TestBase {

    @Test
    public void handleMultipleWindowTest(){
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();

        String parentWindowID=driver.getWindowHandle();

        for(String windowID: driver.getWindowHandles()){
            if(!windowID.equals(parentWindowID)){
                driver.switchTo().window(windowID);
                break;
            }
        }
        System.out.println("Child Window Title: "+driver.getTitle());
        driver.switchTo().window(parentWindowID);
        System.out.println("Parent Window Title: "+driver.getTitle());
    }
}
