package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/FeatureFiles/LoginPage.feature",
		glue = "StepDefinition",
		tags="",
		plugin= {
				"pretty","html:target/HTMLReports.html",
				"pretty","json:target/JSONReports.json",
				"pretty","junit:target/JUNITReports.junit",
		}
		
		
		)


public class CucumberRun{

}
