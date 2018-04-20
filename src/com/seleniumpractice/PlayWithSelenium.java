package com.seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithSelenium 
{

	public static void main(String[] args) 
	{
		//Handling Alert box

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched Successfully!");
		
		driver.manage().window().maximize();
		
		//Launch Demo Automation Site
		driver.get("http://demo.automationtesting.in/Register.html");
		
//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
/*		WebElement captureAlertResMsg = driver.findElement(By.xpath("//p[@id='demo']"));
		WebElement capturePromptResMsg = driver.findElement(By.xpath("//p[@id='demo1']"));
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		alert.accept();
		System.out.println("Alert Result Message when clicked on OK button: "+captureAlertResMsg.getText());
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		alert.dismiss();
		System.out.println("Alert Result Message when clicked on CANCEL button: "+captureAlertResMsg.getText());
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		alert.sendKeys("Manjunath N P");
		alert.accept();
		System.out.println(capturePromptResMsg.getText());
		*/

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@test.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test2@test.com");
		
		
		

	}

}
