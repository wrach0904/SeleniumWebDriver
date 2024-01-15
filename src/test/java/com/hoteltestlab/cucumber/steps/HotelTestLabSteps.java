package com.hoteltestlab.cucumber.steps;

import com.hoteltestlab.selenium.BaseTest;
import com.hoteltestlab.LoginPage;
import com.hoteltestlab.MyBookingPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class HotelTestLabSteps extends BaseTest {

    private WebDriver driver;
    private String email = "test@test" + new Random().nextInt(1000000) + ".com";
    MyBookingPage myBookingPage = new MyBookingPage();
    LoginPage loginPage = new LoginPage();


    @Given("an open hotel-test-lab login page")
    public void goingToLoginPage(){
        setUp();
        loadApplication();
        myBookingPage.goToLoginPage();
    }

    @When("user logins with valid credentials: {word} {word}")
    public void userLogin(String email, String password){
        loginPage.logInUser(email, password);
        assertTrue(loginPage.loginAssertCheck().contains("MY ACCOUNT"));
    }

    @Then("they can add a new address")
    public void enterNewAddress(){

    }


    @And("quit the browser")
    public void teardown(){
        tearDown();
    }


}
