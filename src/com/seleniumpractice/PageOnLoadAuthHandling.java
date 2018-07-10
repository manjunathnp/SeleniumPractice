package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageOnLoadAuthHandling 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String expPageMsg = "Congratulations! You must have the proper credentials.";
		String pageMsg = driver.findElement(By.cssSelector("p")).getText();
		
		if(expPageMsg.equals(pageMsg))
			System.out.println("Authentication Successful!");
		else
			System.out.println("Not Authorized");
		
		
	}
}
