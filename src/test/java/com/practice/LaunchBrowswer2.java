package com.practice;

import com.base.TestBase;
import org.testng.annotations.Test;

public class LaunchBrowswer2 extends TestBase {

    @Test
    public void appLaunch(){
        driver.navigate().to("https://saucedemo.com/");
        System.out.println("Title of WebPage: "+driver.getTitle());

    }

}
