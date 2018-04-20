package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched Successfully!");
		driver.manage().window().maximize();
		
		//driver.navigate().to("http://demo.automationtesting.in/Static.html");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions actions = new Actions(driver);
		//actions.clickAndHold(driver.findElement(By.xpath("//img[@id='angular']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droparea']"))).release().build().perform(); 
		WebElement src = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='box103']"));
		Thread.sleep(3000);
		actions.dragAndDrop(src, dest).perform();
	}

}
