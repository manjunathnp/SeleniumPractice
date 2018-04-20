package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpHandler {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched Successfully!");
		
		driver.manage().window().maximize();
		
		//Launch File Uploader site
		driver.get("https://html.com/input-type-file/");
		
		//Upload file
		WebElement fileUploadBtn = driver.findElement(By.xpath("//input[@id='fileupload']"));
		fileUploadBtn.sendKeys("C:\\Users\\acer\\Desktop\\TestFile.txt");
	}

}
