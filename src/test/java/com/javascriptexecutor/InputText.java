package com.javascriptexecutor;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InputText extends TestBase {

    @Test
    public void loginTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");

        WebElement usernameTxtFld = driver.findElement(By.id("user-name"));
        WebElement passwordTxtFld = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        String username = "standard_user";
        String password = "secret_sauce";

        usernameTxtFld.sendKeys(username);
        passwordTxtFld.sendKeys(password);
        loginBtn.click();

        /*JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].value = arguments[1];", usernameTxtFld, username);
        js.executeScript("arguments[0].value = arguments[1];", passwordTxtFld, password);

        Thread.sleep(3000);
        // Clicking the login button using JavaScriptExecutor
        js.executeScript("arguments[0].click();", loginBtn);*/


    }
}
