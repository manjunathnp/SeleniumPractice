package com.testNGPract;

import org.testng.annotations.*;

public class AnnotationTest {

    @BeforeSuite
    public void beforeSuiteMethod(){
        System.out.println("Inside before suite method");
    }
    @AfterSuite
    public void afterSuiteMethod(){
        System.out.println("Inside after suite methods");
    }

    @BeforeTest
    public void beforeTestMethod(){
        System.out.println("Inside before test methods");
    }

    @AfterTest
    public void afterTestMethod(){
        System.out.println("Inside after test methods");
    }

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Inside before class methods");
    }
    @AfterClass
    public void afterClassMethod(){
        System.out.println("Inside after class methods");
    }

    @BeforeMethod
    public void beforeMethodMethod(){
        System.out.println("Inside before method methods");
    }
    @AfterMethod
    public void afterMethodMethod(){
        System.out.println("Inside after method methods");
    }

    @Test
    public void testMethod(){
        System.out.println("inside test method");
    }
}
