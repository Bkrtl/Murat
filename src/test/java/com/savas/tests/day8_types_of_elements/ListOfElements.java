package com.savas.tests.day8_types_of_elements;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {

    @Test
    public void test(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons=driver.findElements(By.tagName("button"));

        System.out.println(buttons.size());
        Assert.assertEquals(buttons.size(),6);

        for (WebElement button : buttons) {
            System.out.println("the texts on button : " + button.getText());
        }



        driver.quit();
    }
}
