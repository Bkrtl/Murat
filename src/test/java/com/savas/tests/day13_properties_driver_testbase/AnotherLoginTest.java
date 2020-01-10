package com.savas.tests.day13_properties_driver_testbase;

import com.savas.tests.TestBase;
import org.testng.annotations.Test;

public class AnotherLoginTest extends TestBase {

    @Test
    public void test(){
        driver.get("https://www.google.com");
    }
}
