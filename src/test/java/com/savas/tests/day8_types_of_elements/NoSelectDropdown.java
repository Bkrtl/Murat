package com.savas.tests.day8_types_of_elements;

import com.savas.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {

    @Test
    public void test(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownLinkMenu=driver.findElement(By.cssSelector("#dropdownMenuLink"));
        dropdownLinkMenu.click();

        List<WebElement> DropdownLinkMenu= driver.findElements(By.className("dropdown-item"));
        System.out.println("Numbers of dropdown link is " +DropdownLinkMenu.size());

        System.out.println(DropdownLinkMenu.get(2).getText());
        System.out.println(DropdownLinkMenu.get(4).getText());

        DropdownLinkMenu.get(3).click();


        for (WebElement ofDropdownLinkMenu : DropdownLinkMenu) {
            System.out.println("Name of list = " + ofDropdownLinkMenu.getText());
        }


        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a[1]")).click();
        //DropdownLinkMenu.get(4).click();


        driver.quit();

    }
}
