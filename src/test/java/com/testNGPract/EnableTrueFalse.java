package com.testNGPract;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class EnableTrueFalse {
    @Test(enabled = true)
    public void test1(){
        System.out.println("Inside test1()");
    }

    @Test(enabled = true)
    public void test2(){
        System.out.println("Inside test2()");
    }

    @Test(enabled = true)
    public void test3(){
        System.out.println("Inside test3()");
    }

    @Test(enabled = true)
    public void testToBeSkipped() {
        int a=100, b=10;
        if (a>b) {
            throw new SkipException("Skipping this test as per condition");
        }

        // Test steps (not executed if the test is skipped)
        System.out.println("This won't be printed if the test is skipped");
    }

}
