package com.testNGPract;

import org.testng.annotations.Test;

public class GroupingsDemo {
    @Test(groups = {"smoke", "sanity"})
    public void testA(){
        System.out.println("smoke, sanity test");
    }

    @Test(groups = "sanity")
    public void testB(){
        System.out.println("sanity test");
    }

    @Test(groups = "integration")
    public void testC(){
        System.out.println("integration test");
    }

    @Test(groups = "regression")
    public void testD(){
        System.out.println("regression test");
    }

    @Test(groups = "regression")
    public void testE(){
        System.out.println("regression test");
    }
}
