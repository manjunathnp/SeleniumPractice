package com.seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCountPrint 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched Successfully!");
		
		driver.manage().window().maximize();
		
		//Launch Demo Automation Site
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//List of Links 
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total Links Present: "+linkList.size());
		
		for(int i=0; i<linkList.size(); i++)
		{
			System.out.println(i+". " + linkList.get(i).getText());
		}
		
	}

}
