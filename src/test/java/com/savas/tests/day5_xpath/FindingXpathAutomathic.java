package com.savas.tests.day5_xpath;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindingXpathAutomathic {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        /*

        driver.get("https://www.amazon.com");


        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium");

        WebElement clickButton=driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
        clickButton.click();

         */

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement multipleButton=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/button[6]"));
        multipleButton.click();


        Thread.sleep(3000);
        driver.quit();
    }
}
