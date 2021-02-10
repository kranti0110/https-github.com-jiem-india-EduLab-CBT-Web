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
glue="oneup", tags = "@abhinav111"
, dryRun = false,
plugin = {"json:target/cucumber.json"}
		)

public class TestRunner {
//	https://oneuptest.net/#/show-school?id=155
	@BeforeClass
	public static void setup() {
		//Reporter.startSuite();
	}
	@AfterClass
	public static void teardown() {
		//Reporter.endSuite();
	}
}
