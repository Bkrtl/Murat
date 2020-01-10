package com.savas.tests.day13_properties_driver_testbase;

import com.savas.utilities.ConfigurationReader;
import com.savas.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {
    WebDriver driver;
    @Test
    public void test(){

        String s1 = Singleton.getInstance();
        //100 lines of code
        String s2 = Singleton.getInstance();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);


    }

    @Test
    public void test2(){

        //this is how we create webdriver object from now on
        //type of the driver will come from configuration.properties file
        driver = Driver.get();
        //driver=Driver.get(); burada WebDriver objectimizi oluşturuyoruz.
        // Bunu yaptıktan sonra "driver.get(ConfigurationReader.get("url"));" şeklinde kullanabiliriz çünkü "driver", is a object keeping "Driver.get()"
        //ancak yine de "Driver.get()" de kullanabiliriz.
        // "Driver.get().get(ConfigurationReader.get("url"));" = "driver.get(ConfigurationReader.get("url"));"

        //we are getting url from configuration.properties file
        driver.get(ConfigurationReader.get("url"));
        //Driver.get().get(ConfigurationReader.get("url"));---bi üstteki code ile aynı (burada doğrudan Driver classı ve methodunu kullanıyoruz

        driver.navigate().refresh();
        //Driver.get().navigate().refresh();---bi üstteki code ile aynı
    }


    @Test
    public void test3() throws InterruptedException {
        Thread.sleep(2000);
        Driver.get().get("http://amazon.com");//----alltaki ile aynı
        //driver.get("http://amazon.com");

        //if we are using Driver close, we use closeDriver method to close the driver.
        Driver.closeDriver();
    }
}
