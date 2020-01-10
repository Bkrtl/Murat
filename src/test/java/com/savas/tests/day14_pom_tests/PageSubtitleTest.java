package com.savas.tests.day14_pom_tests;

import com.savas.pages.BasePage;
import com.savas.pages.CalendarEventsPage;
import com.savas.pages.DashboardPage;
import com.savas.pages.LoginPage;
import com.savas.tests.TestBase;
import com.savas.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {

     /*Test case
    Open browser
    Login as a Driver
    Verify that page subtitle is Quick Launchpad
    Go to Activities -> Calendar Events
    verify that page subtitle is Calendar Events
    click create calendar events
    ..
    ..
    */

    @Test
    public void verifySubtitleTest(){
        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        loginPage.login(username,password);

        DashboardPage dashboardPage = new DashboardPage();
        //expected title
        String expectedSubtitle = "Quick Launchpad";
        //actual title from website
        String actualSubtitle = dashboardPage.getPageSubTitle();
        //verify titles are matching
        Assert.assertEquals(actualSubtitle,expectedSubtitle,"Verify subtitles");

        //Assert.assertEquals(dashboardPage.getPageSubTitle(),"Quick Launchpad"); --->bu yukardaki üç satırın tek satıra yapılmış hali

        dashboardPage.navigateToModule("Activities","Calendar Events");
        //dashboardPage.navigateToModule("Customers","Accounts");
        //dashboardPage.navigateToModule("System","Jobs");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        Assert.assertEquals(calendarEventsPage.getPageSubTitle(),"Calendar Events","Verify subtitles");

    }
}
