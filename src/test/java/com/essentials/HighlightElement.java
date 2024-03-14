package com.essentials;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HighlightElement extends TestBase {

    @BeforeMethod
    public void launchApp(){
        driver.get("https://askomdch.com");
    }

    @Test
    public void highlighter() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement homePageText = driver.findElement(By.xpath("//h1[normalize-space()='Raining Offers for Hot Summer!']"));
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", homePageText);
        Thread.sleep(2000);

    }

    @Test
    public void highlighter2(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
       WebElement homePageDiscText = driver.findElement(By.xpath("//h3[normalize-space()='25% OFF On all products']"));
       js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid green;');", homePageDiscText);

    }
}
