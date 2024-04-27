package com.essentials;

import com.base.TestBase;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;
import java.util.List;

public class SwitchToNthWindow extends TestBase {

    @Test
    public void switchToNthWindow(){
        driver.get("https://example.com");

        //code to open 100 windows

        //code to switch to 50th window
        Set<String> allWindowHandles=driver.getWindowHandles();
        List<String> windowIDs = new ArrayList<>(allWindowHandles);

        driver.switchTo().window(windowIDs.get(49));

    }

}
