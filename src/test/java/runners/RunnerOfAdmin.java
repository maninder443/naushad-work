package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
	@CucumberOptions(
	features = ".\\src\\test\\resources\\functionalTests\\admin.feature",
	glue= {"stepDefinitions"},
	plugin = { "pretty", "html:test-output", "json:json_output/cucumber.json"},
	monochrome = true,
	strict = true,
	dryRun = false
	  )

	@Test

public class RunnerOfAdmin extends AbstractTestNGCucumberTests {

}
