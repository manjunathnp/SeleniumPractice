package com.testNGPract.TestNGRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int count = 0;
    private static int maxTries = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (!result.isSuccess() && count < maxTries) { // Retry only if test fails and within retry limit
            count++;
            System.out.println("Retrying test: " + result.getName() + ", attempt: " + count); // Log retry attempt
            return true; // Retry the test
        }
        return false; // Don't retry
    }
}
