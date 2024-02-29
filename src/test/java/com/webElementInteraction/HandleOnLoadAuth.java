package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HandleOnLoadAuth extends TestBase{

    @Test
    public void validatePageOnLoadAuthPopup1(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


    }
}
