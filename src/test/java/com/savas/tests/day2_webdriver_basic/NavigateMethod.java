package com.savas.tests.day2_webdriver_basic;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://www.amazon.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();



        Thread.sleep(5000);

        driver.quit();
    }
}
