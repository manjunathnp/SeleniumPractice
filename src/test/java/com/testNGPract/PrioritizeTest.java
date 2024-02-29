package com.testNGPract;

import org.testng.annotations.Test;

public class PrioritizeTest {

    @Test(priority = 2)
    public void test1(){
        System.out.println("Inside test1()");
    }

    @Test(priority = 1)
    public void test2(){
        System.out.println("Inside test2()");
    }

    @Test(priority = 0)
    public void test3(){
        System.out.println("Inside test3()");
    }
}
