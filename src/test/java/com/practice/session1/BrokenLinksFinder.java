package com.practice.session1;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinksFinder extends TestBase {
    @Test
    public void brokenLinksFinder() throws IOException {
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");

        List<WebElement> links=driver.findElements(By.tagName("a"));

        for(WebElement link: links){
            String url=link.getAttribute("href");

            HttpURLConnection connection=(HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();

            int responseCode=connection.getResponseCode();
            if(responseCode!=200){
                System.out.println("Broken Link: "+url);
            }
        }
    }
}
