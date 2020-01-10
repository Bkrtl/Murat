package com.savas.tests.day10_file_upload;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        driver.quit();
    }

    /**
     *  go to website http://practice.cybertekschool.com/upload
     *  upload file.txt
     *  click upload
     *  verify file name is displayed in the next page
     */

    //uploadı masaüstündeki bir dosyadan yapma
    @Test
    public void test(){
        driver.get("http://practice.cybertekschool.com/upload");

        driver.findElement(By.id("file-upload")).sendKeys("/Users/bmkrtl/Desktop/file.txt");


        driver.findElement(By.id("file-submit")).click();

        String actualMessage=driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actualMessage,"file.txt","verify.....");
        //Assert.assertEquals(driver.findElement(By.id("uploaded-files")).getText(),"file.txt","verify that actual message is file.txt");

    }


    //upload ı resources package aracılığıyla yapma
    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/upload");

        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath = " + projectPath);

        String relativePath = "src/test/resources/testfile.txt";
        System.out.println("relativePath = " + relativePath);

        String filePath = projectPath+"/"+relativePath;
        System.out.println("filePath = " + filePath);


        driver.findElement(By.name("file")).sendKeys(filePath);
        //clicking the upload button
        driver.findElement(By.id("file-submit")).click();
        //getting text of webelement
        String actualFilename = driver.findElement(By.id("uploaded-files")).getText();
        //verify file name is displayed in the next page
        Assert.assertEquals(actualFilename,"testfile.txt","Verify the file name");


    }
}
