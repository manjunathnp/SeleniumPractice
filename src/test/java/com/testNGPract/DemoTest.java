package com.testNGPract;

import org.testng.annotations.Test;

import java.io.IOException;

public class DemoTest {
    /*@Test(groups = {"sanity"})
    public void test1(){
        System.out.println("Inside test1");
    }

    @Test(groups = {"sanity"})
    public void test2(){
        System.out.println("Inside test2");
    }

    @Test(priority = -2, groups = {"regression"})
    public void test3(){
        System.out.println("Inside test3");
    }

    @Test(priority = -3, groups = {"regression"})
    public void test4(){
        System.out.println("Inside test4");
    }*/

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZeroException() {
        int result = 10 / 0;
    }

}
