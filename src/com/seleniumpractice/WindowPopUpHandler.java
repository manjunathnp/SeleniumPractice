package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched Successfully!");
		
		driver.manage().window().maximize();
		
		//Launch PopUp Test Site
		driver.get("http://popuptest.com/goodpopups.html");
		
		//Click on Link that pops up window
		driver.findElement(By.xpath("//a[@class='black']")).click();
		
		
	}

}
