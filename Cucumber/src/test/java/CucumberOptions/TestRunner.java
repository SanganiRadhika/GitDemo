package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/features/GreenCartVerification.feature",
		glue = "Stepdefinations",stepNotifications=true, monochrome=true,
	   plugin = {"pretty","html:target/cucumber.html", "json:target/cucumber.json","junit: target/cucumbner.xml",
			   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			)

public class TestRunner {

}
//JunitRunner//Testng test Runner

//running failed scenarios in Cucumber
/*
 * in plugin 
 *  plugin = {"pretty","html:target/cucumber.html", "json:target/cucumber.json","junit: target/cucumbner.xml",
			   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenarios.txt"}
 */
