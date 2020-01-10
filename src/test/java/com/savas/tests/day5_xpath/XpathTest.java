package com.savas.tests.day5_xpath;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //LOCATING ELEMENT WITH KNOWN VALUEONLY
        WebElement button1=driver.findElement(By.xpath("//button[@onclick='button1()']"));
        //WebElement button1=driver.findElement(By.xpath("//*[@onclick='button1()']"));
        //WebElement button1=driver.findElement(By.xpath("//button[@*='button1()']"));
        //WebElement button1=driver.findElement(By.xpath("//*[@*='button1()']"));
        button1.click();


        //LOCATING ELEMENT WITH KNOWN VISIBLE TEXT
        //WebElement button2=driver.findElement(By.xpath("//button[.='Button 2']"));
        //WebElement button2=driver.findElement(By.xpath("//*[text()='Button 2']"));
        //WebElement button2=driver.findElement(By.xpath("//*[.='Button 1']"));
        WebElement button2=driver.findElement(By.xpath("//button[text()='Button 2']"));
        button2.click();

        WebElement button3=driver.findElement(By.xpath("//button[text()='Button 3']"));
        button3.click();

        WebElement button4=driver.findElement(By.xpath("//button[text()='Button 4']"));
        button4.click();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement signUpButton=driver.findElement(By.xpath("//button[text()='Sign Up']"));
        //WebElement signUpButton=driver.findElement(By.xpath("//*text()='Sign Up']"));
        //WebElement signUpButton=driver.findElement(By.xpath("//button[.='Sign Up']"));
        //WebElement signUpButton=driver.findElement(By.xpath("//*[.='Sign Up']"));
        System.out.println(signUpButton.getText());

        WebElement signUpPage=driver.findElement(By.xpath("//h2[text()='Sign Up Page']"));
        System.out.println(signUpPage.getText());


        Thread.sleep(2000);
        driver.quit();
    }
}
