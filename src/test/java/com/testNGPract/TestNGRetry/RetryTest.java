package com.testNGPract.TestNGRetry;

import com.base.TestBase;
import com.testNGPract.TestNGListeners.CustomTestListeners;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomTestListeners.class)
public class RetryTest extends TestBase {
    private static int attempt = 1;
    @Test(retryAnalyzer = RetryAnalyzer.class,enabled = false)
    public void testMethod() {
        if(attempt <= 2) {
            attempt++;
            Assert.fail("Failing the test intentionally");
        } else {
            Assert.assertTrue(true, "Test passed on the third attempt");
        }
    }

    @Test
    public void testSiteTitle(){
        driver.get("https://askomdch.com");
        Assert.assertEquals("Askomdch", driver.getTitle());
    }
}
