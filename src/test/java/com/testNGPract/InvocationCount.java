package com.testNGPract;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class InvocationCount {

    @Test(invocationCount = 3, priority = 0)
    public void test(){
        System.out.println("testing...");
    }

    @Test(invocationCount = 9, priority = 1)
    public void runTest(){
        System.out.println("testing!");
    }
}
