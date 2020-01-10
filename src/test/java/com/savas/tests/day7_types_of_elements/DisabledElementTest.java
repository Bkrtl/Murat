package com.savas.tests.day7_types_of_elements;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElementTest {

    @Test
    public void test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenButton=driver.findElement(By.id("green"));

        System.out.println("green button is enabled : " +greenButton.isEnabled());

        Assert.assertFalse(greenButton.isEnabled(),"verify that green button is not enabled");

        driver.quit();
    }

    @Test
    public void test2() throws InterruptedException {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement disableBox=driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));

        System.out.println("Button is enable :" + disableBox.isEnabled());

        Assert.assertFalse(disableBox.isEnabled(),"verify that disable box is disable");

        WebElement enableButton=driver.findElement(By.cssSelector("#input-example > button"));
        enableButton.click();

        Thread.sleep(3000);

        Assert.assertTrue(disableBox.isEnabled(),"verify that input is enable");

        disableBox.sendKeys("Platon");

        Thread.sleep(3000);
        driver.quit();
    }
}
