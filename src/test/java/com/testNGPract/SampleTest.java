package com.testNGPract;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
    @Test
    public void test1(){
        System.out.println("Inside test1()");
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("Inside test2()");
        //Assert.fail();
    }

    @Test(dependsOnMethods = {"test1", "test2"})
    public void test3(){
        System.out.println("Inside test3()");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionByZeroTest(){
        int res = 10/0;
        System.out.println(res);
    }
}
