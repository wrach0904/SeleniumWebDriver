package pl.mystoretestlab;


import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.*;

import java.io.File;
import java.io.IOException;

public class BasePage {


    public static WebDriver driver;
    public void setDriver (WebDriver driver){
        BasePage.driver = driver;
    }

    protected String currentURL(){
        String URL = driver.getCurrentUrl();
        return URL;
    }

    protected WebElement find(By locator){
        return driver.findElement(locator);
    }

    protected void click(By locator){
        find(locator).click();
    }

    protected void clear(By locator){
        find(locator).clear();
    }

    protected void type(By locator, String text){
        find(locator).sendKeys(text);
    }

    protected void goTo(String URL){
        driver.get(URL);
    }

    protected void hoverOver(By locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(find(locator)).build().perform();
    }

    protected String printText(By locator){
        String text = find(locator).getText();
        System.out.println("Text: " + text);
        return text;
    }

    protected String getText(By locator){
        String text = find(locator).getText();
        return text;
    }



}
