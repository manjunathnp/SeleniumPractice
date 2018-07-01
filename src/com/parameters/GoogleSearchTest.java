package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearchTest 
{
	WebDriver driver;
	@Test
	@Parameters({"browser", "url", "toSearch"})
	public void googleTestSearch(String browser, String url, String toSearch)
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
		
		driver.get(url);
		driver.findElement(By.id("lst-ib")).sendKeys(toSearch);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
	}

}
