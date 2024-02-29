package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class HandleUpDownload extends TestBase {

    @Test
    public void validateFileUpload(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement uploadBtn = driver.findElement(By.id("file-upload"));
        WebElement uploadSubmitBtn = driver.findElement(By.id("file-submit"));

        uploadBtn.sendKeys("/Users/manjunathnp/Desktop/testFILE.rtf");
        uploadSubmitBtn.click();

        String actualConfMsg = driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!']")).getText();
        String expectedConfMsg = "File Uploaded!";

        Assert.assertEquals(actualConfMsg, expectedConfMsg);
    }

    @Test
    public void validateFileDownload() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        WebElement downloadableFile = driver.findElement(By.xpath("//a[normalize-space()='LambdaTest.txt']"));
        downloadableFile.click();
        Thread.sleep(3000);

        File downaloadedFile = new File("/Users/manjunathnp/Downloads/", "LambdaTest.txt");
        if(downaloadedFile.exists())
        {
            System.out.println("File download Successful!");
        }else{
            System.out.println("Re-validate the download");
        }
    }
}
