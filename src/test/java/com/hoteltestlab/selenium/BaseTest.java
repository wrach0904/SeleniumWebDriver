package com.hoteltestlab.selenium;

import com.hoteltestlab.BasePage;
import com.hoteltestlab.MyBookingPage;
import org.junit.jupiter.api.TestInstance;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@org.junit.jupiter.api.TestInstance(TestInstance.Lifecycle.PER_CLASS) //to make BeforeEach non-static

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected MyBookingPage myBookingPage;
    private final String AUT_URL = "https://hotel-testlab.coderslab.pl/en/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown(){
        //
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(AUT_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        myBookingPage = new MyBookingPage();
    }

    //@AfterEach
    //takeSchreenshots

}


