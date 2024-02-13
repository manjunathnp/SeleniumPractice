package com.totalelements;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class RadioButtons extends TestBase {

    @Test
    public void quantifyRadioButtons() throws InterruptedException {
        driver.get("https://www.letskodeit.com/practice");

        WebElement bmwRadBtn = driver.findElement(By.id("bmwradio"));
        WebElement benzRadBtn = driver.findElement(By.id("benzradio"));
        WebElement hondaRadBtn = driver.findElement(By.id("hondaradio"));

        //Total radio-buttons
        List<WebElement> radioButtons = driver.findElements(By.xpath("//div[@id='radio-btn-example']//label"));
        System.out.println("Total Radio buttons: "+radioButtons.size());

        System.out.println("List of available radio buttons: ");
        for(WebElement radiobutton: radioButtons){
            System.out.println(radiobutton.getText());
        }

    }
}
