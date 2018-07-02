package com.seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrible 
{
	WebDriver driver;
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('lst-ib').value = 'search'");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int totalLinks = links.size();
		
		System.out.println("Total Links: "+totalLinks);
		
		for(int i=0; i<totalLinks; i++)
		{
			//System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}
		
	}

}
