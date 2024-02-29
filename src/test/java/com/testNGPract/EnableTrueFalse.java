package com.testNGPract;

import org.testng.annotations.Test;

public class EnableTrueFalse {
    @Test(enabled = false)
    public void test1(){
        System.out.println("Inside test1()");
    }

    @Test(enabled = false)
    public void test2(){
        System.out.println("Inside test2()");
    }

    @Test(enabled = true)
    public void test3(){
        System.out.println("Inside test3()");
    }
}
