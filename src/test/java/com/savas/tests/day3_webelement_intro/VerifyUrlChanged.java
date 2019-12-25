package com.savas.tests.day3_webelement_intro;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlChanged {


    /** Verify URL changed
     open browser
     go to http://practice.cybertekschool.com/forgot_password
     enter any email
     click on Retrieve password
     verify that url changed to http://practice.cybertekschool.com/email_sent
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailBox=driver.findElement(By.name("email"));

        emailBox.sendKeys("abcd@gmail.com");

        WebElement retriveButton = driver.findElement(By.id("form_submit"));
        retriveButton.click();

        String expectedUrl="http://practice.cybertekschool.com/email_sent";
        String actualUrl=driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedUrl = " + expectedUrl);
        }


        Thread.sleep(3000);
        driver.quit();


    }
}
