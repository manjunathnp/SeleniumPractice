package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleMutliSelect extends TestBase {

    @Test
    public void selectMutlipleItemsTest(){
        driver.get("https://www.letskodeit.com/practice");

        WebElement multiSelectMenu = driver.findElement(By.id("multiple-select-example"));

        Select multiSelect = new Select(multiSelectMenu);
        System.out.println("\nTotal items present in multiselect menu: "+multiSelect.getOptions().size());

        List<WebElement> multiOptions = multiSelect.getOptions();
        System.out.println("Items present in multiselect menu: ");
        for(WebElement option: multiOptions){
            System.out.println(option.getText());
        }

        System.out.println("\nSelecting Apple and Orange from multiselect menu: ");
        multiSelect.selectByVisibleText("Apple");
        multiSelect.selectByVisibleText("Orange");

        System.out.println("\nSelected options:");
        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        for(WebElement option: selectedOptions){
            System.out.println(option.getText());
        }

    }
}
