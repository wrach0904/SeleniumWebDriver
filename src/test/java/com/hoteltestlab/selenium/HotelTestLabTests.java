package com.hoteltestlab.selenium;

import com.hoteltestlab.*;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.Random;

import static org.junit.Assert.*;

public class HotelTestLabTests extends BaseTest {

    MyBookingPage myBookingPage = new MyBookingPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    LoginPage loginPage = new LoginPage();
    CreateAccountPage createAccountPage = new CreateAccountPage();
    AddressesPage addressesPage = new AddressesPage();

    private String email;
    private String password;

    @Test
    public void changeLanguage(){
        myBookingPage.changePagesLanguageToPln();
        try {
            assertEquals("Polski", myBookingPage.languageAssertCheck());
        } catch (NoSuchElementException ex) {
            fail("Language didn't change.");
        }
        myBookingPage.changePagesLanguageToEng();
        try {
            assertEquals("English", myBookingPage.languageAssertCheck());
        } catch (NoSuchElementException ex) {
            fail("Language didn't change.");
        }
    }

    @Test
    public void loginUser(){
        myBookingPage.goToLoginPage();
        loginPage.logInUser("test@test631387.com", "Abc435353");
        try {
            assertEquals("MY ACCOUNT", loginPage.loginAssertCheck());
        } catch (NoSuchElementException ex) {
            fail("Sign in failed.");
        }
    }

    @Test
    public void registerUser(){
        myBookingPage.goToLoginPage();
        email = "test" + new Random().nextInt(1000000) + "@test.com";
        System.out.println("Email: " + email);
        loginPage.goToCreateAccountPage(email);
        password = "Abcd1234";
        System.out.println("Password: " + password);
        createAccountPage.createAccount(email, "Lilly", "Brooks", password);
        try {
            assertEquals("MY ACCOUNT", loginPage.registerAssertCheck());
        } catch (NoSuchElementException ex) {
            fail("Creating the account failed.");
        }
    }

    @Test
    public void addNewAddress() throws InterruptedException {
        loginUser();
        myAccountPage.goToAddressesPage();
        addressesPage.addNewAddress();
        try {
            assertEquals("MY ADDRESSES", addressesPage.newAddAssertCheck());
        } catch (NoSuchElementException ex) {
            fail("Creating the address failed.");
        }
    }

    @Test
    public void test() {

    }


}
