package com.seleniumpractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest 
{

	public static void main(String[] args) throws MalformedURLException, IOException  
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched Successfully!");
		
		driver.manage().window().maximize();
		
		//Launch Free CRM
		driver.get("https://freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("tester66");
		driver.findElement(By.name("password")).sendKeys("tester66");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		//1. Get the list of Links and Images
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of full links and images: "+linkList.size());
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//2.Iterate Link List : exclude all the links and images which has no href attribute
		for(int i=0; i<linkList.size(); i++)
		{
			if(linkList.get(i).getAttribute("href") != null && (! linkList.get(i).getAttribute("href").contains("javascript")))
			{
				activeLinks.add(linkList.get(i));
			}
		}
		
		//Get the size of active links list:
		System.out.println("Size of active links and images: "+activeLinks.size());
		
		//3. Check href URL with httpconnection API
		for(int j=0; j<activeLinks.size(); j++)
		{
			HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			
			System.out.println(activeLinks.get(j).getAttribute("href")+" ----> "+response);
		}
		
		
		

	}

}

