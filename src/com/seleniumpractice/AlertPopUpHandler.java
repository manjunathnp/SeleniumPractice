package com.seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandler {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched Successfully!");
		
		driver.manage().window().maximize();
		
		//Launch Rediffmail Login Page
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Click on Go button
		driver.findElement(By.name("proceed")).click();
		
		//Switch to Alert
		Alert alert = driver.switchTo().alert();
		
		//Capture Alert Text
		System.out.println("Alert Text: "+alert.getText());
		
		//Handle Alert by Clicking on Alert OK
		alert.accept();
		
		System.out.println("Alert Handled Successfully!");

	}

}
