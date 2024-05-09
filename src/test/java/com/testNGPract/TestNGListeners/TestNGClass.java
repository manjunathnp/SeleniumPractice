package com.testNGPract.TestNGListeners;

import com.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TestNGClass extends TestBase {

    @Test(enabled = false)
    public void launchApp(){
        driver.get("https://askomdch.com");
    }

    @Test
    public void registration(){
        System.out.println("Inside Registration Test");
    }

    @Test(dependsOnMethods = "registration")
    public void login(){
        //Assert.fail();
        System.out.println("Inside Login Test");
    }

    @Test(dependsOnMethods = "login")
    public void logout(){
        System.out.println("Inside Logout Test");
    }
}
