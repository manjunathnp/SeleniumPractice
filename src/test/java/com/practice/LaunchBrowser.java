package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    WebDriver driver;

    public void Launch(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/manjunathnp/Downloads/chromedriver-mac-arm64/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    public static void main(String[] args) {
        LaunchBrowser lb = new LaunchBrowser();
        lb.Launch();
    }

}

