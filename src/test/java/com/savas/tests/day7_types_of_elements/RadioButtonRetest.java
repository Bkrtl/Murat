package com.savas.tests.day7_types_of_elements;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonRetest {

    @Test
    public void test(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueButton=driver.findElement(By.xpath("//*[@id='blue']"));
        WebElement redButton=driver.findElement(By.cssSelector("#red"));
        redButton.click();

        System.out.println("blue button is selected :" + blueButton.isSelected());
        System.out.println("red button is selected : " + redButton.isSelected());

        WebElement greenButton=driver.findElement(By.xpath("//*[@id=\"green\"]"));
        Assert.assertFalse(greenButton.isEnabled(),"verify that green is enabled");



    }
}
