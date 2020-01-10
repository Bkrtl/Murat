package com.savas.tests.day7_testNG;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {


    @Test
    public void test1(){

        System.out.println("First Assertion");
        Assert.assertEquals("one","One");

        System.out.println("Second Assertion");
        Assert.assertEquals("title", "titlE");

        System.out.println("after second assertion");
    }


    @Test
    public void test2(){
        //verify that title starts wıth C
        String actualTitle = "Cybertek";
        String expectedTitleBeginning ="B";

        System.out.println("first assertion");
        Assert.assertTrue(actualTitle.startsWith(expectedTitleBeginning),"verify that starts with C");



    }
    @Test
    public void test21(){
        //verify that email includes @ sign
        Assert.assertTrue("yasin@mail".contains("@"), "verify @ in email");
    }

    @Test
    public  void test3(){

        Assert.assertNotEquals("one","two", "one should not be equal to two");
    }

    @Test
    public  void test4(){

        Assert.assertFalse(1<0);
    }
}
