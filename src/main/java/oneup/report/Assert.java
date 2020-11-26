package oneup.report;

public class Assert {

	public static void assertEquals(String expected , String actual, String stepName) {
		if(expected == null) {expected = "null";}
		if(actual == null) {actual = "null";}
		//Reporter.addValidationStep(stepName, "", expected.equals(actual));
		junit.framework.Assert.assertEquals(expected, actual);
	}
}
