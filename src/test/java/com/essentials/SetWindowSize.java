package com.essentials;

import com.base.TestBase;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class SetWindowSize extends TestBase {
    @Test
    public void setWindowSize(){
        driver.get("https://askomdch.com");

        Dimension dimension=new Dimension(500, 800);
        driver.manage().window().setSize(dimension);
    }
}
