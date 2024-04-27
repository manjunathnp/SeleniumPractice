package com.advanced;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class MultiTabNavigationAndScreenshot extends TestBase {
    @Test
    public void multiTabNavigationAndScreenshotTest() throws IOException {
        String[] urls = {
                "http://example.com",
                "http://google.com",
                "http://facebook.com",
                "http://twitter.com",
                "http://reddit.com",
                "http://github.com",
                "http://stackoverflow.com",
                "http://medium.com",
                "http://wikipedia.org",
                "http://linkedin.com"
        };

        //open the first tab
        driver.get(urls[0]);

        //Open all the links
        for(int i=1; i<urls.length; i++){
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get(urls[i]);
        }

        //Capture Screenshots
        List<String> windowIds = new ArrayList<>(driver.getWindowHandles());
        for(int i=0; i<windowIds.size(); i++){
            driver.switchTo().window(windowIds.get(i));
            captureScreenshot(driver.getTitle()+"_");
        }

        //Close all the tabs except first
        for(int i=1; i<windowIds.size(); i++){
            driver.switchTo().window(windowIds.get(i));
            driver.close();
        }

        driver.switchTo().window(windowIds.get(0));
        System.out.println(driver.getTitle());
    }




    //@Test
    public void testMultiTabScreenshotWorkflow() throws IOException {
        String simpleDateTimeStamp = new SimpleDateFormat("dd-MMM-YYY_HH:MM:ss_a").format(new Date());
        for(int i=0; i<10; i++){
            driver.get("https://the-internet.herokuapp.com/windows");
            driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
            captureScreenshot("ParentWindow_"+simpleDateTimeStamp);
            String parentWindowID = driver.getWindowHandle();
            Set<String> allWindowHandles = driver.getWindowHandles();

            for(String windowID: allWindowHandles){
                if(!windowID.equals(parentWindowID)){
                    driver.switchTo().window(windowID);
                    captureScreenshot("ChildWindow_"+simpleDateTimeStamp);
                }
            }
            driver.switchTo().window(parentWindowID);
        }

    }

}
