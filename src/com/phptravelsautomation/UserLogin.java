package com.phptravelsautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLogin
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		System.out.println("Chrome Browser Launched Successfully!");
		
		driver.manage().window().maximize();
		
		//Launch Google
		driver.get("https://www.phptravels.net/login");
		if(driver.getTitle().equals("Login"))
		{
			System.out.println("PHP Travel Login Page displayed");
		}
		else
		{
			System.out.println("Invalid Page");
		}
		
		//Login as User
		WebElement emailTextField = driver.findElement(By.name("username"));
		emailTextField.sendKeys("user@phptravels.com");
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.sendKeys("demouser");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit'][contains(text(),'Login')]"));
		loginButton.click();
		Thread.sleep(10);
		
		if(driver.getCurrentUrl().equals("https://www.phptravels.net/account/"))
		{
			System.out.println("User login successful");
		}
		else
		{
			System.out.println("User login unsuccessful");
		}
		System.out.println(driver.getCurrentUrl());
		
	}

}
