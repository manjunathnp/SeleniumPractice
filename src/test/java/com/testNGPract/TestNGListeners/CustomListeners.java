package com.testNGPract.TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println(context.getName()+" START ");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test :"+result.getName()+" Started...");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test :"+result.getName()+" Successful...");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test :"+result.getName()+" Skipped...");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test :"+result.getName()+" Failed...");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println(context.getName()+" FINISH ");
    }
}
