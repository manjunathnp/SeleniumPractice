package com.testNGPract;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class InvocationCount {

    WebDriver driver;

    @Test(invocationCount = 3)
    public void test(){
        System.out.println("testing...");
    }
}
