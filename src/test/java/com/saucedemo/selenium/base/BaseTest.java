package com.saucedemo.selenium.base;

import com.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import com.saucedemo.LoginPage;

public class BaseTest  {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private  String url = "https://www.saucedemo.com/";

    @BeforeClass
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);

        basePage = new BasePage();
        basePage.setWebDriver(driver);

        loginPage = new LoginPage();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }




}
