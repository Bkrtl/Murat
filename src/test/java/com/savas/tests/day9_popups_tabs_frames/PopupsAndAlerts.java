package com.savas.tests.day9_popups_tabs_frames;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public  void htmlPopUp(){

        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        driver.findElement(By.xpath("//*[text()='Destroy the World']")).click();

        driver.findElement(By.xpath("//*[text()='No']")).click();

    }

    @Test
    public void alerts() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        driver.findElement(By.xpath("//*[@*='jsAlert()'] ")).click();

        Alert alert= driver.switchTo().alert();

        Thread.sleep(3000);
        alert.accept();

        driver.findElement(By.xpath("//*[@*='jsConfirm()'] ")).click();
        alert.dismiss();

        driver.findElement(By.xpath("//*[@*='jsPrompt()'] ")).click();
        Thread.sleep(2000);
        alert.sendKeys("Mike Smith");
        alert.accept();
        Thread.sleep(3000);



    }
}
