package com.testNGPract;

import org.testng.annotations.*;

public class AnnotateDemo {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Inside Before Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Inside Before Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Inside Before Class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Inside Before Method");
    }

    @Test
    public void testA(){
        System.out.println("Inside testA()");
    }

    @Test
    public void testB(){
        System.out.println("Inside testB()");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("Inside After Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Inside After Class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Inside After Test");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Inside After Suite");
    }
}
