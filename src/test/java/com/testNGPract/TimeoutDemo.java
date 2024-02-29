package com.testNGPract;

import org.testng.annotations.Test;

public class TimeoutDemo {

    @Test(timeOut = 2000)
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("TIMEOUT!");
    }
}
