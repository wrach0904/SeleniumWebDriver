package com.saucedemo.selenium.tests.login;

import com.saucedemo.selenium.base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class LoggingTests extends BaseTest{

    @Test
    public void TC1_loggingError(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("abcdefg123456");
        loginPage.clickButtonLogin();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String actualMessage = loginPage.getErrorMessage();
        assertTrue(actualMessage.contains("Epic sadface"));
    }

}
