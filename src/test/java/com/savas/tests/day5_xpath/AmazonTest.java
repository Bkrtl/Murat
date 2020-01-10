package com.savas.tests.day5_xpath;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");


        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium");

        //WebElement search=driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
        //search.click();
        WebElement searchButton=driver.findElement(By.xpath("//input[@value='Go']"));
        searchButton.click();


        WebElement resultMessage=driver.findElement(By.xpath("//span[contains(text(),'results for')]"));


        String expectedResult="1-48 of 326 results for";
        String actualResult=resultMessage.getText();

        if(expectedResult.equals(actualResult)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("actualResult = " + actualResult);
            System.out.println("expectedResult = " + expectedResult);
        }

        Thread.sleep(2000);
        driver.quit();

    }
}
