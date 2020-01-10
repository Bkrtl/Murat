package com.savas.tests.day7_testNG;

import org.testng.annotations.*;

public class BeforeAndAfterTest {

    @Test
    public void test1(){
        System.out.println("This is from test1");
    }

    @Test
    public void test2(){
        System.out.println("This is from test2");
    }

    @Test
    public void test3(){
        System.out.println("This is from test3");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("open browser from BeforeMethod");
    }

    @AfterMethod
    public void teaeDown(){
        System.out.println("close browser from AfterMethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class code");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class code");
        System.out.println("Reporting");
    }
}
