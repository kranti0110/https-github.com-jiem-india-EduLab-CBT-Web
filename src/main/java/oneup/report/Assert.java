package oneup.report;

public class Assert {

	@SuppressWarnings("deprecation")
	public static void assertEquals(String expected , String actual, String stepName) {
		if(expected == null) {expected = "null";}
		if(actual == null) {actual = "null";}
		//Reporter.addValidationStep(stepName, "", expected.equals(actual));
		junit.framework.Assert.assertEquals(expected, actual);
	}

	@SuppressWarnings("deprecation")
	public static void assertFalse(Boolean condition) {
		//Reporter.addValidationStep(stepName, "", expected.equals(actual));
		junit.framework.Assert.assertFalse(condition);
	}
	
	@SuppressWarnings("deprecation")
	public static void assertTrue(Boolean condition) {
		//Reporter.addValidationStep(stepName, "", expected.equals(actual));
		junit.framework.Assert.assertTrue(condition);
	}
}
