package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class CalendarSelect extends TestBase {
    @Test
    public void selectDates(){
        LocalDate currentDate = LocalDate.now();
        driver.navigate().to("https://www.hyrtutorials.com/p/calendar-practice.html");
        WebElement firstDate = driver.findElement(By.id("first_date_picker"));

        //firstDate.click();

//        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[3]/td[6]/a[1]")).click();

        firstDate.sendKeys(currentDate.toString());
    }
}
