package com.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromePlayAround 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched Successfully!");
		
		driver.manage().window().maximize();
		
		//Launch Google
		driver.get("https://google.com");
		System.out.println("Navigated to Google Successfully!");
		
		//Site Title
		String siteTitle = driver.getTitle();
		System.out.println("Title: "+siteTitle);
		//Site URL
		String siteURL = driver.getCurrentUrl();
		System.out.println("URL: "+siteURL);
		/*//Site Page Source
		String sitePageSource = driver.getPageSource();
		System.out.println("Page Source:\n"+ sitePageSource);*/
		
		driver.get("https://gmail.com");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("URL: "+driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("Title: "+driver.getTitle());
		driver.close();
		
		System.out.println("Infomartion gathered successfully!");

	}

}
