package com.practiceautomationsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Chrome Browser Launched Successfully!");
		
		driver.manage().window().maximize();
		
		//Navigate to site
		driver.get("http://practice.automationtesting.in/");
		
		WebElement myAccountLink = driver.findElement(By.xpath("//a[@href='http://practice.automationtesting.in/my-account/']"));
		myAccountLink.click();
		
		//Login to site
		WebElement loginTextField = driver.findElement(By.id("username"));
		loginTextField.sendKeys("tester5@tester5.com");
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.sendKeys("tester5@tester5.com");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		System.out.println("Login Successful!");
	
		
		//Logout from site
		WebElement logoutLink = driver.findElement(By.xpath("//a[@href='http://practice.automationtesting.in/my-account/customer-logout/'][contains(text(),'Logout')]"));
		logoutLink.click();
		System.out.println("Logout Successful");
		
	}

}
