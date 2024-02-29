package com.testNGPract;

import org.testng.annotations.Test;

public class ParallelTest1 {

    @Test
    public void test1(){
        System.out.println("test1() of P1 executed");
    }
    @Test
    public void test2(){
        System.out.println("test2() of P1 executed");
    }
    @Test
    public void test3(){
        System.out.println("test3() of P1 executed");
    }
}
