package com.totalelements;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDown extends TestBase {
    @Test
    public void quanitifySelectDropDown(){
        driver.get("https://www.letskodeit.com/practice");

        WebElement carsDropDownElement = driver.findElement(By.xpath("//select[@id='carselect']"));

        Select carsDropDownMenu = new Select(carsDropDownElement);

        System.out.println("Total Options present in Cars Dropdown Menu: "+carsDropDownMenu.getOptions().size());

        System.out.println("Options in CarDropDown: ");
        for(WebElement option: carsDropDownMenu.getOptions()){
            System.out.println(option.getText());
        }
        carsDropDownMenu.selectByVisibleText("Honda");
    }

    @Test
    public void validateMultiSelectionListBox(){
        driver.get("https://www.letskodeit.com/practice");

        WebElement carsListBoxElement = driver.findElement(By.id("multiple-select-example"));

        Select fruitsListBox = new Select(carsListBoxElement);

        System.out.println("Total options present in Fruits List-box: "+fruitsListBox.getOptions().size());

        for(WebElement option: fruitsListBox.getOptions()){
            System.out.println(option.getText());
        }

        fruitsListBox.selectByVisibleText("Apple");
        fruitsListBox.selectByVisibleText("Orange");

        System.out.println("Selected option from Fruits List-box");
        for(WebElement option: fruitsListBox.getAllSelectedOptions()){
            System.out.println(option.getText());
        }

        fruitsListBox.deselectByVisibleText("Orange");
        fruitsListBox.deselectByVisibleText("Apple");

        for(WebElement option: fruitsListBox.getOptions()){
            fruitsListBox.selectByVisibleText(option.getText());
        }

    }
    @Test
    public void validateAllItemsSelectionMulitSelectBox(){
        driver.get("https://www.letskodeit.com/practice");

        WebElement carsListBoxElement = driver.findElement(By.id("multiple-select-example"));

        Select fruitsListBox = new Select(carsListBoxElement);

        System.out.println("Selecting all the items: ");
        for(WebElement option: fruitsListBox.getOptions()){
            fruitsListBox.selectByVisibleText(option.getText());
            System.out.println(option.getText());
        }

    }
}
