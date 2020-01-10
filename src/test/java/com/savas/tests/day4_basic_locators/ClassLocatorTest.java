package com.savas.tests.day4_basic_locators;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");


        //WebElement homeLink=driver.findElement(By.className("nav-link"));
        //homeLink.click();

        driver.findElement(By.className("nav-link")).click(); // lazy way. kısayolu


        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //WebElement multipleButton= driver.findElement(By.className("h3"));
        //String message=multipleButton.getText();
        //System.out.println("message = " + message);

        System.out.println(driver.findElement(By.className("h3")).getText()); // kısayolu




        Thread.sleep(3000);
        driver.quit();

    }


}
