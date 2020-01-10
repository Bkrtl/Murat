package com.savas.tests.day4_basic_locators;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagnameTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameBox=driver.findElement(By.tagName("input"));
        fullNameBox.sendKeys("Thomas August");

        WebElement emailBox=driver.findElement(By.name("email"));
        emailBox.sendKeys("agfs@hotmail.com");

        WebElement signUPButton=driver.findElement(By.tagName("button"));
        signUPButton.click();

        /**
        WebElement message=driver.findElement(By.tagName("h3"));
        String actualMessage=message.getText();
        System.out.println("actualMessage = " + actualMessage);
         */
        System.out.println(driver.findElement(By.tagName("h3")).getText()); // yukardaki üc satrın tek satır hali.lazy way

        Thread.sleep(3000);
        driver.quit();

    }
}
