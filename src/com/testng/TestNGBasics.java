package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics 
{
	@BeforeSuite
	public void setUp()
	{
		System.out.println("Set up system property for Chrome");
	}
	
	@BeforeClass
	public void launchChromeBrowser()
	{
		System.out.println("Launch Chrome Browser");
	}
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("Enter URL");
	}
	
	@BeforeTest
	public void login()
	{
		System.out.println("Login to App");
	}
	
	@Test
	public void googleTitleTest()
	{
		System.out.println("Google Title Test");
	}
	
	
	@AfterMethod
	public void logout()
	{
	System.out.println("Logout from App");	
	}
	
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("Delete all cookies");
	}

	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("Generate Test Report");
	}
}
