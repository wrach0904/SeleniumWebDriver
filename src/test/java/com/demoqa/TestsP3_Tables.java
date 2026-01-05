package com.demoqa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsP3_Tables extends BaseTest{

    @Test
    public void testWebTable() throws InterruptedException {
        String expectedAge = "34";

        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit("alden@example.com");
        Thread.sleep(1000);
        webTablePage.setAge(expectedAge);
        webTablePage.clickSumbitButton();

        String actualAge = webTablePage.getAge("alden@example.com");

        Assert.assertEquals(actualAge, expectedAge, "\nAge is not correct \n");
    }
}

