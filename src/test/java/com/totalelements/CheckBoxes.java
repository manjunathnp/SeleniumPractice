package com.totalelements;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxes extends TestBase {

    @Test
    public void quantifyCheckBoxes() {
        driver.get("https://www.letskodeit.com/practice");

        //Total radio-buttons
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//label[input[@type='checkbox']]"));
        System.out.println("Total Radio buttons: "+checkBoxes.size());

        System.out.println("List of available checkboxes: ");
        for(WebElement checkbox: checkBoxes){
            System.out.println(checkbox.getText());
        }

    }
}
