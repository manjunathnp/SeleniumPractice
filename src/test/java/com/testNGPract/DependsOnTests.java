package com.testNGPract;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTests {

    @Test
    public void registration(){
        Assert.fail("registration() - This test is intentionally failed");
        System.out.println("User Registration Test");
    }

    @Test(dependsOnMethods = "registration")
    public void login(){
        System.out.println("User Login Test");
    }

    @Test(dependsOnMethods = "login")
    public void logout(){
        System.out.println("User Logout Test");
    }
}
