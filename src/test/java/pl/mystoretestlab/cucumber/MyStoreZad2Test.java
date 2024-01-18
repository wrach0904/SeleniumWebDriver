package pl.mystoretestlab.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/features/MyStoreTestsZaliczenie2.feature",
        plugin = {"pretty", "html:report.html"})

public class MyStoreZad2Test {
}
