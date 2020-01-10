package com.savas.tests.day8_types_of_elements;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");


        WebElement radioBlueButton=driver.findElement(By.id("blue"));

        // get the value of name attribute
        System.out.println(radioBlueButton.getAttribute("name"));

        // get the value of id attribute
        System.out.println(radioBlueButton.getAttribute("id"));

        // get the value of type attribute
        System.out.println(radioBlueButton.getAttribute("type"));

        //trying to get attribute does not exit
        //when we use non exist attribute, it will return NULL to us
        System.out.println(radioBlueButton.getAttribute("href"));

        // attribute without value (checked)
        // checked attribute value is boolean if it is checked it will be true
        System.out.println(radioBlueButton.getAttribute("checked"));

        // "outerHTML" returns full html of that element
        System.out.println(radioBlueButton.getAttribute("outerHTML"));

        // 3rd way of getting text "innerHTML" (certain cases)
        System.out.println(radioBlueButton.getAttribute("innerHTML"));




        driver.quit();
    }
}
