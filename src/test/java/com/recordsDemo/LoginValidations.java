package com.recordsDemo;

import com.base.TestBase;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class LoginValidations {
    public WebDriver driver;
    ObjectMapper mapper=new ObjectMapper();
    Creds creds;


    @Test
    public void loginTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ObjectMapper mapper=new ObjectMapper();
        Creds creds=mapper.readValue(new File("src/test/java/com/recordsDemo/creds.json"), Creds.class);

        driver.get(creds.url());
        driver.findElement(By.id("user-name")).sendKeys(creds.username());
        driver.findElement(By.id("password")).sendKeys(creds.password());

        driver.findElement(By.id("login-button")).click();
    }
}
