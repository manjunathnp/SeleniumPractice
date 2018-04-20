package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPract2 
{
	@BeforeClass
	public void setUp()
	{
		System.out.println("Setup Started....");
	}
	@AfterClass
	public void tearDown()
	{
		System.out.println("Test Completed....");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("Login Success");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout Success");
	}
	
	@Test(priority=1, groups="Test Group")
	public void test1()
	{
		System.out.println("Test1 Validated");
	}
	
	@Test(priority=2, groups="Test Group")
	public void test2()
	{
		System.out.println("Test2 Validated");
	}
	
	@Test(priority=3, groups="Title Group")
	public void testTitle1()
	{
		System.out.println("Title Validated");
	}
	
	@Test(priority=4, groups="Title Group")
	public void testTitle2()
	{
		System.out.println("Title Validated");
	}
	
	@Test(priority=5, groups="Title Group")
	public void testTitle3()
	{
		System.out.println("Title Validated");
	}
	
	@Test(priority=6, groups="Image Group", enabled = false)
	public void imageTest()
	{
		System.out.println("Image Validated");
	}

}
