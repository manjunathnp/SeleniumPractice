package com.practice;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginLogout extends TestBase {

    @Test
    public void loginToSauceDemoApp(){
        driver.navigate().to("https://saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //driver.findElement(By.id("login-button")).click();
        elementClick(driver.findElement(By.id("login-button")));

        WebElement appLogo = driver.findElement(By.xpath("//div[@class='app_logo']"));
        if(appLogo.isDisplayed()==true){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Unsuccessful");
        }

        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        if(loginBtn.isDisplayed()==true){
            System.out.println("Logout Successful");
        }else{
            System.out.println("Logout Unsuccessful");
        }
    }


}
