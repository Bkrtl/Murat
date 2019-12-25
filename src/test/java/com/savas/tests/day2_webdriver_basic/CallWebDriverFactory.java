package com.savas.tests.day2_webdriver_basic;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.get("https://www.amazon.com");


        String title= driver.getTitle();
        System.out.println("title = " + title);

        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        String sourcePage=driver.getPageSource();
        System.out.println("sourcePage = " + sourcePage);

        driver.quit();


    }
}
