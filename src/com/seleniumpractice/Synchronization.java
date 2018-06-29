package com.seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Selenium instructing the WebDriver to wait for the maximum time of 10 seconds until the page is fully loaded
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//Implicitly Wait - always applied globally - its applicable for all the WebElement for which the 'driver' is interacting
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Launch FB
		driver.get("http://facebook.com");
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		WebElement forgotAccountLink = driver.findElement(By.linkText("Forgotten account?"));

		sendKeys(driver, firstName, 15, "Tommy");
		sendKeys(driver, lastName, 10, "Chunky");
		sendKeys(driver, email, 10, "test@test.com");
		sendKeys(driver, password, 5, "testpassword");
		onClick(driver, forgotAccountLink, 5);
		
		
	}
	//Explicitly Wait - explicitly specifying the wait for certain WebElements with specific timeouts
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void onClick(WebDriver driver, WebElement element, int timeout)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
