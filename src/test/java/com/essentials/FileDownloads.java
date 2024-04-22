package com.essentials;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownloads{
    WebDriver driver;
    ChromeOptions chromeOptions=new ChromeOptions();
    @Test
    public void validateFileDownload(){
        chromeOptions.addArguments("download.default_directory=/Users/manjunathnp/Downloads");
        driver = new ChromeDriver(chromeOptions);

        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[normalize-space()='test-file.txt']")).click();

        String downloadPath = "/Users/manjunathnp/Downloads";
        File downloadedFile = new File(downloadPath + File.separator +"test-file.txt");
        Assert.assertTrue(downloadedFile.exists());
    }

}
