package com.testNGPract;
import com.testNGPract.TestNGRetry.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTests {
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void test1() throws InterruptedException {
        Assert.fail();
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void test2() throws InterruptedException {
        Assert.fail();
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void test3(){
        System.out.println("test3()");
    }

}
