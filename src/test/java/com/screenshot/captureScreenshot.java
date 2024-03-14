package com.screenshot;

import com.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class captureScreenshot extends TestBase {

    @Test
    public void demoScreenshotCapture() throws IOException {
        driver.get("https://askomdch.com/account");

        /*TakesScreenshot ts = (TakesScreenshot)driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("ScreenshotsDir/"+driver.getTitle()+".png");
        FileUtils.copyFile(srcFile,destFile);*/

        //captureScreenshot(driver.getTitle());
        captureScreenshot(Test.class.getName());
    }

    @Test
    public void screenshotPractice() throws IOException {
        String dateTime = new SimpleDateFormat("dd-mm-YYYY_HH-mm").format(new Date());
        driver.get("https://demo.nopcommerce.com/");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("ScreenshotsDir"+File.separator+"test_"+dateTime+".png");
        FileUtils.copyFile(srcFile, destFile);
    }
}
