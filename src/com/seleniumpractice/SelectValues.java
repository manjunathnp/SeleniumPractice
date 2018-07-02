package com.seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectValues 
{
	WebDriver driver;
	
	@Test
	public void selectValueFromDropDown()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement dd = driver.findElement(By.id("Skills"));
		
		Select opt = new Select(dd);
		
		opt.selectByValue("Java");
		
	}

}
