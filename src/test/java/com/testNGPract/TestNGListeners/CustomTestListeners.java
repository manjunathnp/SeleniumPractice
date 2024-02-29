package com.testNGPract.TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        // This method is called before the start of each test
        if (!result.getMethod().getEnabled()) {
            // Test is marked as @Test(enabled=false)
            System.out.println("Test disabled: " + result.getName());
        } else {
            // Test is enabled
            System.out.println("Test started: " + result.getName());
        }
    }

    /*@Override
    public void onStart(ITestContext context) {
        // This method is called when any test starts
        System.out.println("Test execution started: " + context.getName());
    }*/

    @Override
    public void onFinish(ITestContext context) {
        // This method is called after all tests are executed
        System.out.println("Test execution finished: " + context.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // This method is called on the success of any test
        System.out.println("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // This method is called on the failure of any test
        System.out.println("Test failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // This method is called when a test is skipped
        System.out.println("Test skipped: " + result.getName());
    }

}
