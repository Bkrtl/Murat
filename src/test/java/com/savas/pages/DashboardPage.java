package com.savas.pages;

import com.savas.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{

    //no ned to explicitly write constructors, because it will use its parents constructor. ayrıca aşağıda kalmasınada da bi sıkıntı yok(override)
    public DashboardPage(){
        PageFactory.initElements(Driver.get(),this);
    }
}
