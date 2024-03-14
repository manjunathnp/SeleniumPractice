package com.essentials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BrokenLinkIdentifier {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");

        // Find all links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Print total number of links
        System.out.println("Total Links: " + links.size());

        // Check each link for validity
        for (WebElement link : links) {
            String url = link.getAttribute("href");

            // Skip null or empty URLs
            if (url == null || url.isEmpty()) {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            // Verify link status using a utility method
            int responseCode = getResponseCode(url);

            // Print the URL and its response code
            System.out.println("URL: " + url + " | Response Code: " + responseCode);

            // Check if the response code indicates a broken link (you may customize the condition)
            if (responseCode != 200) {
                System.out.println("Broken Link: " + url);
            }
        }

        // Close the WebDriver
        driver.quit();
    }

    // Utility method to get the HTTP response code
    private static int getResponseCode(String link) {
        int responseCode = 0;
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(link).openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            responseCode = httpURLConnection.getResponseCode();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseCode;
    }
}
