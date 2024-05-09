package com.testNGPract;

import com.base.TestBase;
import org.testng.annotations.Test;

public class Test1 extends TestBase {
    @Test
    public void m1(){
        driver.get("https://askomdch.com");
        System.out.println(driver.getTitle());
    }

}
