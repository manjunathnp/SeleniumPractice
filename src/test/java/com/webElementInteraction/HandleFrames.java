package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleFrames extends TestBase {

    @Test
    public void validateFrame() throws InterruptedException {
        driver.get("https://www.letskodeit.com/practice");

        driver.switchTo().frame("iframe-name");
        driver.findElement(By.xpath("//a[normalize-space()='INTERVIEW']")).click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();


    }
}
