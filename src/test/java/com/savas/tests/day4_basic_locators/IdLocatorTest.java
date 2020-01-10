package com.savas.tests.day4_basic_locators;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {

    /**
     * http://practice.cybertekschool.com/multiple_buttons
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClickButton=driver.findElement(By.cssSelector("#disappearing_button"));
        dontClickButton.click();



        Thread.sleep(3000);
        driver.quit();

    }
}
