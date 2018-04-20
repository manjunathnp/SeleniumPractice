package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched Successfully!");
		driver.manage().window().maximize();
		
		//Launch Free CRM
		driver.get("https://freecrm.com");
		System.out.println("Free CRM Launched Successfully!");
		
		//Login
		driver.findElement(By.name("username")).sendKeys("tester5tester5");
		driver.findElement(By.name("password")).sendKeys("tester5tester5");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Login Successful!");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
		
		driver.switchTo().defaultContent();
		
		System.out.println("Frame1 Handled Successfully!");
		
//		driver.switchTo().frame("leftpanel");
//		driver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[6]/a")).click();
		
		driver.switchTo().defaultContent();
		
		//driver.close();

	}

}
