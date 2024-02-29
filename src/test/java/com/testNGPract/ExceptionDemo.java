package com.testNGPract;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;


public class ExceptionDemo extends TestBase {

    @Test(expectedExceptions = ArithmeticException.class)
    public void test1(){
        int a = 10, b = 0, c;
        System.out.println(c=a/b);
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    public void test2(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("id")).click();
    }
}
