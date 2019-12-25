package com.savas.tests.day3_webelement_intro;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlNotChanged {

    /**
     * Verify URL not changed
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password
     * click on Retrieve password
     * verify that url did not change
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        String currentUrl=driver.getCurrentUrl();

        WebElement retrieveButton=driver.findElement(By.id("form_submit"));

        retrieveButton.click();

        String actualUrl=driver.getCurrentUrl();

        if(currentUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("currentUrl = " + currentUrl);
        }

        Thread.sleep(5000);

        driver.quit();
    }
}
