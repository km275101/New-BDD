package junitRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\kamlesh.maurya\\git\\New-BDD\\src\\test\\java\\feature",
	glue = {"defineStep1" },
		format = { "pretty","html:test-output" }, 
		dryRun = false)

public class JunitRunner{

	
}
