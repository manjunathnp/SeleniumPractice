package com.seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launched Successfully!");
		
		driver.manage().window().maximize();
		
		//Launch Test Site
		driver.get("http://demo.automationtesting.in/Register.html");
		
		/*driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Manjunath");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("N P");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tester@gmailtest.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1599517346");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		
		WebElement checkboxMovies = driver.findElement(By.xpath("//input[@value='Movies']"));
		System.out.println(checkboxMovies.isSelected());*/
		
		/*WebElement comboBox = driver.findElement(By.xpath("//multi-select/div[@id='msdd']"));
		Select language = new Select(comboBox);
		
		language.selectByVisibleText("Slovenian");
		language.selectByVisibleText("Hindi");*/
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select skills = new Select(dropDown);
		
		skills.selectByIndex(5);
		
		
	}

}
