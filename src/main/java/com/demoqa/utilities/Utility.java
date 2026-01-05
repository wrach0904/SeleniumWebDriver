package com.demoqa.utilities;

import com.BasePage;
import org.openqa.selenium.WebDriver;

public class Utility {

    public static WebDriver  driver;

    public static void setUtilityDriver(){
        driver = BasePage.driver;
    }


    public static void sleep(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {}
    }
}
