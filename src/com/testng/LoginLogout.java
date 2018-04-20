package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginLogout 
{
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("Launch Browser");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}

	@BeforeMethod
	public void login()
	{
		System.out.println("Login to Application");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout from Application");
	}
	
	@Test
	public void verifyPageTitle()
	{
		System.out.println("Home Page Title Verification");
	}
	 
}
