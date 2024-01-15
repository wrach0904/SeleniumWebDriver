package com.hoteltestlab.cucumber.steps;

import com.hoteltestlab.AddressesPage;
import com.hoteltestlab.MyAccountPage;
import com.hoteltestlab.selenium.BaseTest;
import com.hoteltestlab.LoginPage;
import com.hoteltestlab.MyBookingPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

import static org.junit.Assert.*;

public class HotelTestLabSteps extends BaseTest {

    private String email = "test@test" + new Random().nextInt(1000000) + ".com";
    MyBookingPage myBookingPage = new MyBookingPage();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    AddressesPage addressesPage = new AddressesPage();


    @Given("an open hotel-test-lab login page")
    public void goingToLoginPage(){
        setUp();
        loadApplication();
        myBookingPage.goToLoginPage();
    }

    @When("user logins with valid credentials: {word} {word}")
    public void userLogin(String email, String password){
        loginPage.logInUser(email, password);
    }

    @Then("they can add a new address")
    public void enterNewAddress() throws InterruptedException {
        myAccountPage.goToAddressesPage();
        addressesPage.addNewAddress();
        try {
            assertEquals("MY ADDRESSES", addressesPage.newAddAssertCheck());
        } catch (NoSuchElementException ex) {
            fail("Creating the address failed.");
        }
    }


    @And("quit the browser")
    public void quitBrowser(){
        tearDown();
    }


}
