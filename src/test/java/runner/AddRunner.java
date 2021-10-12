package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/addition.feature",
		glue="stepDefinition",
		monochrome=true,//Used for formating the console outcome
		plugin= {"pretty","html:target/htmlReport.html","json:target/jsonReport/report.json"},//prints matching step definitions for the steps
		dryRun=false//if true checks whether if all steps have matching step definitions
		)
public class AddRunner {

}
