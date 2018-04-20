package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched Successfully!");
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[@href='Interactions.html']"))).build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[@data-toggle='dropdown'][contains(text(),'Drag and Drop')]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='Static.html']")).click();
		
		
		
		
		
		
		
	}

}
