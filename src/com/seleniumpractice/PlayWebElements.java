package com.seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PlayWebElements 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("D:/RSW9/Example.html");
		
		driver.findElement(By.name("usrname")).sendKeys("np_manjunath");
		driver.findElement(By.name("pwd")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.id("male")).click();
	
		WebElement breakFastDd = driver.findElement(By.name("Breakfast"));
		Select dd = new Select(breakFastDd);
		dd.selectByVisibleText("Vade");
		
		driver.findElement(By.xpath("//textarea[@name = 'desc']")).sendKeys("Selenium is Fun");
		
		driver.close();
		
	}
}
