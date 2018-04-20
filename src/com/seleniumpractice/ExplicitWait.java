package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched Successfully!");
		
		driver.manage().window().maximize();
		
		//Launch Google
		driver.get("https://google.com");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement kannadaLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'ಕನ್ನಡ')]")));
		kannadaLink.click();
		
	}

}
