package testRun;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features= ".//Featur//login_Test.feature",
			glue= {"stepDefinitions"},
			plugin= {"pretty","html:test-output"},
			dryRun=true,
			monochrome = true
)
public class TestRunner 
{

}
