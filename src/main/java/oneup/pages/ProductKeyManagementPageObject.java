package oneup.pages;

import actions.ElementActions;
import oneup.report.Assert;

public class ProductKeyManagementPageObject {
	//page locators
	
	public static void validateTitle(String expected) {
		String actual = ElementActions.getDriver().getTitle();
		System.out.print(actual);
		Assert.assertEquals(expected, actual,"validateTitle");
	}
	
	
}
