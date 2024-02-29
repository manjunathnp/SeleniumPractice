package com.testNGPract;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailTestIntentionally {

    @Test
    public void demo1(){
        Assert.fail("demo1() intentionally failed");
    }

    @Test
    public void demo2(){
        Assert.assertEquals(1, 2, "demo2() intentionally failed");
    }

    @Test
    public void demo3() throws Exception {
        throw new Exception("demo3() intentionally failed");
    }
}
