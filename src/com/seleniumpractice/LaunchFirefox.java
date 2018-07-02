package com.seleniumpractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Firefox Browser Launched Successfully!");
		
		//Launch Google
		driver.navigate().to("https://google.com");
		System.out.println("Navigation to GOOGLE is Successful!");
		
		ScreenshotHandle.takeScreenshot("Google_HomePage2");

	}

}
