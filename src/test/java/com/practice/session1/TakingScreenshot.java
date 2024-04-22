package com.practice.session1;

import com.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakingScreenshot extends TestBase {

    @Test
    public void captureScreenshotTest() throws IOException {
        driver.get("https://askomdch.com");

        TakesScreenshot ts=(TakesScreenshot) driver;
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("ScreenshotsDir"+File.separator+"2.png");
        FileUtils.copyFile(srcFile,destFile);
    }
}
