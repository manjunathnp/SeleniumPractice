package com.testng;

import org.testng.annotations.Test;

public class InvocationCountTestNG 
{
	@Test(invocationCount=10)
	public void sum()
	{
		int a = 10;
		int b = 90;
		int res = a+b;
		
		System.out.println("Result of Sum = "+res);
	}

}
