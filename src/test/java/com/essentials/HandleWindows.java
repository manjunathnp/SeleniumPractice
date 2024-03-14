package com.essentials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HandleWindows{
    public WebDriver driver;
    ChromeOptions chromeOptions=new ChromeOptions();

    @Test
    public void switchWindows(){
        chromeOptions.addArguments("--ignore-notifications");
        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.way2automation.com/way2auto_jquery/frames-and-windows.php#load_box");

        String parentWindowID=driver.getWindowHandle();

        driver.findElement(By.xpath("//a[normalize-space()='Open Seprate New Window']")).click();
        WebElement iframe = driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[2]"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//a[normalize-space()='Open New Seprate Window']")).click();

        for(String windowHandle:driver.getWindowHandles()){
            if(!windowHandle.equals(parentWindowID)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        System.out.println("Child Window: "+driver.getTitle());
        driver.switchTo().window(parentWindowID);
        System.out.println("Parent Window: "+driver.getTitle());

    }

    @Test
    public void switchTabs(){
        chromeOptions.addArguments("--ignore-notifications");
        //chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.way2automation.com/way2auto_jquery/frames-and-windows.php#load_box");
        driver.findElement(By.xpath("//a[normalize-space()='Open New Window']")).click();

        WebElement iframe = driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[1]"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//a[normalize-space()='New Browser Tab']")).click();

        String parentWindowID = driver.getWindowHandle();

        for(String windowHandle: driver.getWindowHandles()){
            if(!windowHandle.equals(parentWindowID)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        System.out.println("Child Tab: "+driver.getTitle());
        driver.switchTo().window(parentWindowID);
        System.out.println("Parent Window: "+driver.getTitle());
    }

}
