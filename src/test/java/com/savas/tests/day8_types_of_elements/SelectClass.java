package com.savas.tests.day8_types_of_elements;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClass {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 1. locate the dropdown element with unique locator
        WebElement dropdownElement=driver.findElement(By.id("state"));

        // 2. create select object by passing the element as a constructor
        Select listOfState=new Select(dropdownElement);

        // getOptions() ---> returns all the available options from the dropdown list
        List<WebElement> alternatives=listOfState.getOptions();


        System.out.println(alternatives.size());

        for (WebElement alternative : alternatives) {
            System.out.println(alternative.getText());
        }


        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test2() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");


        // 1. locate the dropdown element with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        // 2. create select object by passing the element as a constructor
        Select listOfState = new Select(dropdownElement);

        // verify that first option is "Select a State"
        Assert.assertEquals(listOfState.getFirstSelectedOption().getText(),"Select a State","verify");


        // How to select options from the dropdown
        // 1. Using visible text
        // selectByVisibleText("text") --> selecting based on the visible text
        listOfState.selectByVisibleText("Texas");
        Assert.assertEquals(listOfState.getFirstSelectedOption().getText(),"Texas","verify that Texas was selected");


        // 2. Using index number
        //total option --> 52
        listOfState.selectByIndex(5);
        Assert.assertEquals(listOfState.getFirstSelectedOption().getText(),"California","verify that California is selected");

        // 3. Using value
        listOfState.selectByValue("AL");
        Assert.assertEquals(listOfState.getFirstSelectedOption().getText(),"Alabama","verify that Alabama is selected");



        Thread.sleep(3000);
        driver.quit();
    }
}
