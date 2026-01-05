package com.demoqa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsP2_Forms extends BaseTest{

    @Test
    public void TestRadioButton(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();

        boolean isFemaleRadioButtonSelected = formsPage.isFemaleRadioButtonSelected();

        Assert.assertTrue(isFemaleRadioButtonSelected,
                "Female radio button is not selected");
    }

    @Test
    public void TestCheckbox(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.unclickReadingCheckbox();

        boolean isReadingCheckboxSelected = formsPage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSelected,
                "Reading checkbox is selected");
    }
}

