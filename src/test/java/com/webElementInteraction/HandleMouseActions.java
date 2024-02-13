package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleMouseActions extends TestBase {

    @Test
    public void validateMouseHover() throws InterruptedException {
        driver.get("https://www.letskodeit.com/practice");

        WebElement mouseHoverBtn = driver.findElement(By.id("mousehover"));
        WebElement topLnk = driver.findElement(By.xpath("//*[@id='mouse-hover-example-div']/div[1]/fieldset/div/div/a[1]"));
        WebElement reloadLnk = driver.findElement(By.xpath("//*[@id='mouse-hover-example-div']/div[1]/fieldset/div/div/a[2]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(mouseHoverBtn).perform();
        Thread.sleep(3000);
        topLnk.click();
        Thread.sleep(2000);


        actions.moveToElement(mouseHoverBtn).perform();
        Thread.sleep(3000);
        reloadLnk.click();
        Thread.sleep(2000);

        actions.contextClick(mouseHoverBtn).perform();
        Thread.sleep(2000);

    }
    @Test
    public void validateMouseRightClick() throws InterruptedException {
        driver.get("https://www.letskodeit.com/practice");

        WebElement mouseHoverBtn = driver.findElement(By.id("mousehover"));
        Actions actions = new Actions(driver);

        actions.contextClick(mouseHoverBtn).perform();
        Thread.sleep(3000);

        /*WebElement src=driver.findElement(By.id("srcID"));
        WebElement dest=driver.findElement(By.id("destID"));;
        actions.dragAndDrop(src, dest);*/
    }


}
