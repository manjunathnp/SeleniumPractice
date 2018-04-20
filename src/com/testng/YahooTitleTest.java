package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooTitleTest 
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
		driver.get("https://yahoo.com");
	}
	
	@Test
	public void yahooTitleTest()
	{
		String yahooTitle = driver.getTitle();
		
		Assert.assertEquals(yahooTitle, "Yahoo", "Title Mismatch");
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
