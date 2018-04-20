package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googleTitleTest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Chrome Browser Launched Successfully!");
		driver.manage().window().maximize();
		driver.get("https://google.com");

	}
	
	@Test(priority = 1)
	public void googleTitleTtest()
	{
		String googleTitle = driver.getTitle();
		System.out.println("googleTitle = "+googleTitle);
	}
	
	@Test(priority = 3)
	public void googleImageTest()
	{
		boolean imageDisplay = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println("imageDisplay = "+imageDisplay);
	}
	
	@Test(priority = 2)
	public void googleSearchButtonTest()
	{
		boolean searchButtonDisplay = driver.findElement(By.xpath("//input[@value='Google Search']")).isDisplayed();
		System.out.println("searchButtonDisplay = "+searchButtonDisplay);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
