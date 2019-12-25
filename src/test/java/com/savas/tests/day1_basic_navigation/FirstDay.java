package com.savas.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstDay {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("http://google.com");


    }
}