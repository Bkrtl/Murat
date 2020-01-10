package com.savas.tests.day8_types_of_elements;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {

    @Test
    public void test() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement username=driver.findElement(By.cssSelector("#username"));
        Assert.assertFalse(username.isDisplayed(),"verify that usernamebox is not displayed");



        WebElement startButton=driver.findElement(By.cssSelector("#start > button"));
        startButton.click();

        Thread.sleep(6000);
        Assert.assertTrue(username.isDisplayed(),"verify that usernamebox is displayed");



        Thread.sleep(3000);
        driver.quit();

    }
}
