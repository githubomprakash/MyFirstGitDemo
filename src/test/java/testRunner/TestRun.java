package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(
		
		features = ".//Features/Customer.feature",
		glue = "stepDefinition",
		monochrome = true,
		plugin = {"pretty", "html:CucumberReport"},
		tags = {"@Smoke"},
		dryRun = false
		
		
		
		)

public class TestRun {

}
