package com.savas.tests.day15_pom_tests;


import com.savas.pages.CalendarEventsPage;
import com.savas.pages.CreateCalendarEventsPage;
import com.savas.pages.DashboardPage;
import com.savas.pages.LoginPage;
import com.savas.tests.TestBase;
import com.savas.utilities.BrowserUtils;
import com.savas.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/** /* VERIFY RADIO BUTTONS
 Open browser
 Login as driver
 Go to Activities->Calendar Events
 Click on create calendar events
 Click on repeat
 Verfiy that repeat every days is checked
 verify that repeat weekday is not checked
 */

public class RepeatOptionsTests extends TestBase {


    @Test
    public void RepeatRadioButtonTest(){
        //Login as driver
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username,password);
        //Go to Activities->Calendar Events
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities","Calendar Events");
        //Click on create calendar events
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        //if you getting error
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(2);
        calendarEventsPage.createCalendarEvent.click();
        //Click on repeat
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        createCalendarEventsPage.repeat.click();
        //Verify that repeat every days is checked
        Assert.assertTrue(createCalendarEventsPage.days.isSelected(), "Verify days rb is selected");
        //verify that repeat weekday is not checked
        Assert.assertFalse(createCalendarEventsPage.weekday.isSelected(),"verify that weekday is not selected");


    }

    /**VERIFY REPEAT OPTIONS
     Open browser
     Login as driver
     Go to Activities->Calendar
     Click on create calendar events
     Click on repeat
     Verify that repat options are Daily, Weekly, Monthly,Yearly(in this order)
     *
     */

    @Test
    public  void verifyRepeatOptions(){
        //Login as driver
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username,password);
        //Go to Activities->Calendar Events
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities","Calendar Events");
        //new DashboardPage().navigateToModule("Activities","Calendar Events"); --->yukardaki iki satırı tek satırda bu sekilde yapabiliriz

        //Click on create calendar events
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        //if you getting error
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(2);
        calendarEventsPage.createCalendarEvent.click();
        //Click on repeat
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        createCalendarEventsPage.repeat.click();

        //Verify that repeat options are Daily, Weekly, Monthly,Yearly(in this order)
        List<String> expectedList = Arrays.asList("Daily", "Weekly", "Monthly", "Yearly");
        List<WebElement> actualOptions = createCalendarEventsPage.repeatOptionsList().getOptions();


        //get text of each webelement and return as a list of String
        List<String> actualList = BrowserUtils.getElementsText(actualOptions);

        /**
         *  List<String> actualList = new ArrayList<>();   ------->yukarıdakinin başka bi şekli
         *
         * for (WebElement option : actualOptions) {
         *  //get each weblement text inside the dropdown and add to actual list
         *      actualList.add(option.getText());
         *  }
         */

        //compare actual and expected list
        Assert.assertEquals(actualList,expectedList,"Compare dropdown values");
        //Assert.assertEquals(actualOptions,expectedList);

    }
}
