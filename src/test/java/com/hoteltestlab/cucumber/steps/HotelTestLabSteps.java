package com.hoteltestlab.cucumber.steps;

import com.hoteltestlab.BasePage;
import com.hoteltestlab.LoginPage;
import com.hoteltestlab.MyBookingPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;

public class HotelTestLabSteps {

    private WebDriver driver;
    private String email = "test@test" + new Random().nextInt(1000000) + ".com";


    @Given("an open hotel-test-lab login page")
    public void goingToLoginPage(){
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://hotel-testlab.coderslab.pl/en/");
        //MyBookingPage myBookingPage = new MyBookingPage();
        //myBookingPage.goToLoginPage();
    }

    @When("user logins with valid credentials: {word} {word}")
    public void userLogin(String email, String password){
        System.out.println("Hello");
        //LoginPage loginPage = new LoginPage();
        //loginPage.logInUser(email, password);
        //assertTrue(loginPage.loginAssertCheck().contains("MY ACCOUNT"));
    }

    @Then("they can add a new address")
    public void enterNewAddress(){

    }


    @And("quit the browser")
    public void tearDown(){

    }


}
