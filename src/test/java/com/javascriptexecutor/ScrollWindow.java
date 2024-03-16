package com.javascriptexecutor;

import com.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScrollWindow extends TestBase {

    @Test
    public void scrollWindow() throws InterruptedException {
        driver.get("https://askomdch.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");//Scroll Down
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, -500)"); //Scroll Up
    }

}
