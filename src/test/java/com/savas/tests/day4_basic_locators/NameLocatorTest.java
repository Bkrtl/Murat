package com.savas.tests.day4_basic_locators;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    /**
     * http://practice.cybertekschool.com/sign_up
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameBox=driver.findElement(By.name("full_name"));
        fullNameBox.sendKeys("John Locke");

        WebElement emailBox=driver.findElement(By.name("email"));
        emailBox.sendKeys("abcd@gmail.com");

        WebElement signUpButton=driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        WebElement signUpUMessage=driver.findElement(By.name("signup_message"));

        String actualMessage=signUpUMessage.getText();

        String expectedMessage="Thank you for signing up. Click the button below to return to the home page.";

        if(actualMessage.equals(expectedMessage)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
