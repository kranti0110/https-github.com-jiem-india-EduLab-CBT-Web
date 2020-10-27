package oneup.report;

import java.text.SimpleDateFormat;
import java.util.Date;

import reportapi.TestCase;
import reportapi.TestStep;
import reportapi.TestSuite;

public class Reporter {
	private static String buidlId = null;
	private static String testId = null;
	private static String project = "OneUp";
	private static String TestingType = "Sanity";

	public static void startSuite() {
		try {
			String SuiteName = new SimpleDateFormat("dd_MM_yyyy_hh_mm").format(new Date());
			buidlId = TestSuite.createTestSuite(project, TestingType, project + "_" +TestingType + SuiteName, false);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void endSuite() {
		TestSuite.finishTestSuite(buidlId);
	}

	public static void startTestCase(String testName, String desc) {
		testId = TestCase.createTestcase(buidlId,testName , desc, "INPROGRESS");
	}

	public static void endTestCase() {
		TestCase.finish(buidlId, testId);
	}

	public static void addValidationStep(String stepName, String desc, boolean isPassed) {
		//TestStep.addInformation(buildId, testid, teststepname, teststepdesc);
		if(isPassed) {
			TestStep.addValidation(buidlId, testId, stepName, desc, "", "PASS");
		}else {
			TestStep.addValidation(buidlId, testId, stepName, desc, "", "FAIL");	
		}
	}
	
	public static void addInformation(String stepName, String desc) {
		TestStep.addInformation(buidlId, testId, stepName, desc);
	}

}
