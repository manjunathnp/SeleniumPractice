package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import com.base.TestBase;

public class HandleDropDowns extends TestBase {

    @Test
    public void selectItemInDropdown(){
        driver.get("https://www.letskodeit.com/practice");

        WebElement carSelectDropdownMenu = driver.findElement(By.id("carselect"));

        Select carSelectDropdown = new Select(carSelectDropdownMenu);
        System.out.println("Total items in dropdown: "+carSelectDropdown.getOptions().size());

        List<WebElement> options = carSelectDropdown.getOptions();

        System.out.println("List of all the items present in dropdown: ");
        for(WebElement option: options){
            System.out.println(option.getText());
        }

        System.out.println("Selecting BENZ from dropdown: ");
        carSelectDropdown.selectByVisibleText("Benz");
    }
}
