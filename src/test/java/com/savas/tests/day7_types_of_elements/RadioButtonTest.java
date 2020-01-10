package com.savas.tests.day7_types_of_elements;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {


    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueButton=driver.findElement(By.id("blue"));
        WebElement redButton=driver.findElement(By.id("red"));
        WebElement yellowButton=driver.findElement(By.id("yellow"));

        System.out.println("is blue button selected : " + blueButton.isSelected());
        System.out.println("is red button selected : " + redButton.isSelected());
        System.out.println("is yellow button selected : " + yellowButton.isSelected());



        Assert.assertTrue(blueButton.isSelected(),"verify that blue button is selected");
        Assert.assertFalse(redButton.isSelected(),"verify that red button is not selected");
        Assert.assertFalse(yellowButton.isSelected(),"verify that yellow button is not selected");

        redButton.click();
        Assert.assertFalse(blueButton.isSelected(),"verify that blue button is not selected");
        Assert.assertTrue(redButton.isSelected(),"verify that red button is selected");
        Assert.assertFalse(yellowButton.isSelected(),"verify that yellow button is not selected");

        System.out.println("is blue button selected : " + blueButton.isSelected());
        System.out.println("is red button selected : " + redButton.isSelected());
        System.out.println("is yellow button selected : " + yellowButton.isSelected());

        yellowButton.click();
        Assert.assertFalse(blueButton.isSelected(),"verify that blue button is not selected");
        Assert.assertFalse(redButton.isSelected(),"verify that red button is not selected");
        Assert.assertTrue(yellowButton.isSelected(),"verify that yellow button is not selected");

        System.out.println("is blue button selected : " + blueButton.isSelected());
        System.out.println("is red button selected : " + redButton.isSelected());
        System.out.println("is yellow button selected : " + yellowButton.isSelected());





        Thread.sleep(3000);
        driver.quit();
    }

}
