package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HandleRadioButtons extends TestBase {

    @Test
    public void clickOnRadioButtons(){
        driver.navigate().to("https://www.letskodeit.com/practice");
        WebElement bmwRadBtn = driver.findElement(By.id("bmwradio"));
        WebElement benzRadBtn = driver.findElement(By.id("benzradio"));
        WebElement hondaRadBtn = driver.findElement(By.id("hondaradio"));

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

        System.out.println("Total Radio Buttons: "+radioButtons.size());

        if(!bmwRadBtn.isSelected()){
            bmwRadBtn.click();
        }

        if(!benzRadBtn.isSelected()){
            benzRadBtn.click();
        }

        if(!hondaRadBtn.isSelected()){
            hondaRadBtn.click();
        }

        System.out.println("Benz: "+benzRadBtn.isSelected());
        System.out.println("BMW: "+bmwRadBtn.isSelected());
        System.out.println("Honda: "+hondaRadBtn.isSelected());


    }

}
