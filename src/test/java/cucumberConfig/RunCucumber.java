package cucumberConfig;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		// Ref to feature folder
		features = "src/test/java/features",
		
		// Ref to stepDefinitions folder
		glue = "stepDefinitions", 
		
		monochrome = true, 
		plugin = { "pretty", 
				"html:target/site/cucumber-report-default", 
				"json:target/site/cucumber.json" }, 
		snippets = SnippetType.CAMELCASE, 
		
		// run tag
		tags = { "@payment_commonSteps" })

public class RunCucumber {

}
