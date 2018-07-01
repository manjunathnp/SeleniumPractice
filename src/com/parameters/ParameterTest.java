package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest 
{
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url","emailId"})
	public void yahooLoginTest(String browser, String url, String emailId)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		
		//Launch Yahoo
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(emailId); //Enter username
		driver.findElement(By.name("signin")).click(); //Click on next button
		
		
		
	}

}
