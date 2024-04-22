package com.practice.session2;

import com.base.TestBase;
import com.essentials.ChromeOptionsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinksFinderTest{
    @Test
    public void brokenLinksFindersTest() throws IOException {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");

        List<WebElement> links=driver.findElements(By.tagName("a"));

        System.out.println("Total Links: "+links.size());
        int brokenLinkCounter=0;
        for(WebElement link: links){
            String url=link.getAttribute("href");

            HttpURLConnection connection= (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int responseCode=connection.getResponseCode();
            if(responseCode != 200){
                brokenLinkCounter++;
                System.out.println("Broken Link: "+url);
            }
        }
        System.out.println("Total Broken Links: "+brokenLinkCounter);
    }
}
