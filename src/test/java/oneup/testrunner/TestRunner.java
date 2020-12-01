package oneup.testrunner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import oneup.report.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/oneup",
glue="oneup", tags = "@bat"
, dryRun = false,
plugin = {"json:target/cucumber.json"}
		)

public class TestRunner {

	@BeforeClass
	public static void setup() {
		//Reporter.startSuite();
	}
	@AfterClass
	public static void teardown() {
		//Reporter.endSuite();
	}
}
