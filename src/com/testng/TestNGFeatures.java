package com.testng;

import org.testng.annotations.Test;

public class TestNGFeatures 
{
	@Test
	public void loginTest()
	{
		//int res = 10/0;
		System.out.println("Login Test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest()
	{
		int res = 10/0;
		System.out.println("Home Page Test");
	}
	
	@Test(dependsOnMethods = "homePageTest")
	public void searchPageTest()
	{
		System.out.println("Search Page Test");
	}
	
	@Test(dependsOnMethods = {"loginTest", "homePageTest"})
	public void logoutTest()
	{
		System.out.println("Logout Test");
	}

}
