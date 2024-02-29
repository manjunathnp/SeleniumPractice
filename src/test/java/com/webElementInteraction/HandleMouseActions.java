package com.webElementInteraction;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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

    @Test
    public void validateMouseHoverDemo(){
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"))).perform();
        driver.findElement(By.linkText("View profile")).click();

    }

    @Test
    public void validateDragDrop(){
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement srcElement = driver.findElement(By.id("column-a"));
        WebElement destElement = driver.findElement(By.id("column-b"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(srcElement, destElement).perform();

    }

    @Test
    public void validateDoubleClick() throws InterruptedException {
        driver.get("https://api.jquery.com/dblclick/");
        WebElement doubleClickItem = driver.findElement(By.xpath("//body//div"));

        Actions actions = new Actions(driver);

        actions.doubleClick(doubleClickItem).perform();
        Thread.sleep(3000);

    }

    @Test
    public void validateKeyboardActions(){
        //Navigate to the demo site
        driver.get("https://demoqa.com/text-box");

        // Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");

        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");

        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("43 School Lane London EC71 9GO");

        // Copy the Current Address
        currentAddress.sendKeys(Keys.CONTROL + "a");
        currentAddress.sendKeys(Keys.CONTROL + "c");

        //Press the TAB Key to Switch Focus to Permanent Address
        currentAddress.sendKeys(Keys.TAB);

        //Paste the Address in the Permanent Address field
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(Keys.CONTROL + "v");

        //Compare Text of current Address and Permanent Address
        //assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));


    }


}
