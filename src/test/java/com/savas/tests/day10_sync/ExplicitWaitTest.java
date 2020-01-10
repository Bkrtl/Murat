package com.savas.tests.day10_sync;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        //clicking the start  button
        driver.findElement(By.tagName("button")).click();

        //find the username inputbox
        WebElement username = driver.findElement(By.id("username"));

        //HOW TO WAIT EXPLICITLY
        //Create Explicit wait object
        WebDriverWait wait = new WebDriverWait(driver,10);

        //call until method from wait object
        //waiting for the specific element to be visible (up to 10 sec)
        wait.until(ExpectedConditions.visibilityOf(username));
        // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username")))); --- bu sekilde de yapabiliriz, line 39 olmadan

        //sending some user name
        username.sendKeys("Mikesmith");
    }

    @Test
    public  void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        //click enable
        driver.findElement(By.xpath("//button[contains(text(), 'Enable')]")).click();

        //finding box
        WebElement inputbox = driver.findElement(By.cssSelector("input[type='text']"));

        //Wait until element is enabled or clickable
        //create to object to wait
        WebDriverWait wait = new WebDriverWait(driver,30);

        wait.until(ExpectedConditions.elementToBeClickable(inputbox));

        //type something in the inputbox
        inputbox.sendKeys("Something something");
    }
}
