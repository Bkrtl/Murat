package com.savas.tests.day3_webelement_intro;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {

    /** Verify confirmation message
     open browser
     go to http://practice.cybertekschool.com/forgot_password
     enter any email
     verify that email is displayed in the input box
     click on Retrieve password
     verify that confirmation message says 'Your e-mail's been sent!'
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailBox = driver.findElement(By.name("email"));

        String expectedEmail="abcd@gmail.com";
        emailBox.sendKeys(expectedEmail);

        String actualEmail=emailBox.getAttribute("value");

        if(expectedEmail.equals(actualEmail)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("actualEmail = " + actualEmail);
            System.out.println("expectedEmail = " + expectedEmail);
        }

        WebElement retriveButton=driver.findElement(By.id("form_submit"));
        retriveButton.click();

        WebElement message = driver.findElement(By.name("confirmation_message"));
        String expectedMessage="Your e-mail's been sent!";
        String actualMessage=message.getText();

        if (actualMessage.equals(expectedMessage)){
            System.out.println("Pass");
        }else{
            System.out.println("fail");
            System.out.println("actualMessage = " + actualMessage);
            System.out.println("expectedMessage = " + expectedMessage);
        }

        WebElement confirmationMessage=driver.findElement(By.name("confirmation_message"));
        String actualConMessage= confirmationMessage.getText();


        Thread.sleep(3000);
        driver.quit();





    }
}
