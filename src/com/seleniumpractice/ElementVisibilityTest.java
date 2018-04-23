package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched Successfully!");
		
		driver.manage().window().maximize();
		
		//Launch Google
		driver.get("https://freecrm.com/register");
		
		//1. isDisplayed() Method - Applicable for all the elements
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b1); //returns true if present
		
		//2. isEnabled() Method - primarily used with button to verify it is enabled or not
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2); //returns false if disabled
		
		//3. isSelected() Method - Applicable for Radio Buttons, Checkboxes, Drop-downs
		driver.findElement(By.name("agreeTerms")).click();
		boolean b3 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b3); //returns true if selected
		
	}

}
