package com.testNGPract;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {

    @Test
    public void t1(){
        System.out.println("t1() starts");
        Assert.assertEquals(1, 2, "Failed");
        System.out.println("t1() ends"); // this statement is not executed

    }

    @Test
    public void t2(){
        SoftAssert softAssert=new SoftAssert();

        System.out.println("t2() starts");
        softAssert.assertEquals(1,2, "Failed");
        System.out.println("t2() ends"); // this statement is executed

        softAssert.assertAll(); // Required to throw the exception

    }
}
