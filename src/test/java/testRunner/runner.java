package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = ".//Features/register.feature", glue = "step_definition", dryRun = false, monochrome = false, plugin = {
		"pretty", "html:target/Cucumber-report/report5s.html" })

// the cucumber file will always be empty
public class runner {

}
