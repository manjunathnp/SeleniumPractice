package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HandleCheckboxes extends TestBase {

    //@Test
    public void clickOnCheckBoxes(){
        driver.get("https://www.letskodeit.com/practice");

        WebElement bmwCheckbox = driver.findElement(By.id("bmwcheck"));
        WebElement benzCheckbox = driver.findElement(By.id("benzcheck"));
        WebElement hondaCheckbox = driver.findElement(By.id("hondacheck"));

        bmwCheckbox.click();
        benzCheckbox.click();
        //hondaCheckbox.click();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total Checkboxes: "+checkBoxes.size());

        System.out.println("Honda selected? "+hondaCheckbox.isSelected());
        System.out.println("BMW selected? "+bmwCheckbox.isSelected());
        System.out.println("Benz selected? "+benzCheckbox.isSelected());

    }
}

