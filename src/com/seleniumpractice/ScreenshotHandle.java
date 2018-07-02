package com.seleniumpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotHandle 
{
	static WebDriver driver, driver2;
	
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://google.com");
		takeScreenshot("Google_HomePage");
	}
	
	public static void takeScreenshot(String filename) throws IOException
	{
		//1. Take Screenshot and store it in a file format
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//2. Now copy the file to the desired location using copyFile method
		FileUtils.copyFile(file, new File("E:\\Selenium\\SeleniumPractice\\src\\com\\seleniumpractice\\Screenshot\\"+filename+".jpg"));
		
		
	}
}
