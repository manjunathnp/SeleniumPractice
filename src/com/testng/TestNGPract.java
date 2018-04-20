package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGPract 
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
		System.out.println("Login to application");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout from application");
	}
	
	@Test(enabled = true)
	public void createCustomer()
	{
		System.out.println("Create Customer");
	}
	
	@Test(dependsOnMethods = {"createCustomer"})
	public void editCustomer()
	{
		System.out.println("Edit customer details");
	}
	
	@Test(dependsOnMethods = {"editCustomer"})
	public void deleteCustomer()
	{
		System.out.println("Delete Customer");
	}
	

}
