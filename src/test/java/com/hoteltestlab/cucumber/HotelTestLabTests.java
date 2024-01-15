package com.hoteltestlab.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/features/HotelTestLab_AddAddress.feature",
        plugin = {"pretty", "html:report.html"})

public class HotelTestLabTests{
}
