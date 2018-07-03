package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest 
{
	@Test
	public void AppLaunch()
	{
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Launch Browser");
		System.out.println("Navigate to Application");
		System.out.println("Login to Application");
		//Assert.assertEquals(false, true, "Login Unsuccessful");
		
		System.out.println("Validate HomePage");
		softAssert.assertEquals(false, true, "Home Page Validation failed");
		
		System.out.println("Creates Deals");
		softAssert.assertEquals(false, true, "Deals Validation failed");
		
		System.out.println("Logout from Application");
		
		softAssert.assertAll();
		
	}
	

}
