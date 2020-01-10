package com.savas.tests.day13_properties_driver_testbase;

import com.savas.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class PropertiesTest {

    @Test
    public void test1(){

        //String browser= ConfigurationReader.get("browser");
        //System.out.println(browser);

        System.out.println(ConfigurationReader.get("browser"));
        System.out.println(ConfigurationReader.get("url"));
        System.out.println(ConfigurationReader.get("qa1_url"));
        //if your key not exist in properties file, it will return null
        System.out.println(ConfigurationReader.get("salesmanager_username"));



    }

}
