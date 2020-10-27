package oneup.commonstepdef;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import driverfactory.DriverFactory;
import helper.JIEMGlobalFramework;
import oneup.report.Reporter;

public class Hooks {
	
	@Before
	public void beforehook(Scenario scenario) throws Exception {
		System.out.print("OneUP:Hooks: Im an in the beforehook.java class" );
		JIEMGlobalFramework.initiateFramework();
		//Reporter.startTestCase(scenario.getName(), scenario.getSourceTagNames().toString());
		System.out.print("OneUP:Hooks: running the -- " + scenario);
	}
	
	@After
	public void afterhook(Scenario scenario) {
		System.out.print("OneUP:Hooks: Im an in the afterhook.java class" );
		//Reporter.endTestCase();
		DriverFactory.closeBrowser();
	}
	
	
	
}
