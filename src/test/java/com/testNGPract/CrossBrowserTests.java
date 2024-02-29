package com.testNGPract;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTests {

    @Test
    @Parameters({"browser"})
    public void chromeBrowserTest(String browser) throws Exception {
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println(browser.toUpperCase()+" Browser Launched");
        }else if(browser.equalsIgnoreCase("firefox")){
            System.out.println(browser.toUpperCase()+" Browser Launched");
        }else {
            throw new Exception(browser.toUpperCase()+" Browser Unavailable");
        }
    }

}
