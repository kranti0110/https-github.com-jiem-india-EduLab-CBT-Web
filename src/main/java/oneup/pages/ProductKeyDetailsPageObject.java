package oneup.pages;

import org.openqa.selenium.By;

import actions.ElementActions;
import oneup.report.Assert;

public class ProductKeyDetailsPageObject {
	//page locators
	
	private static By txtPageHeader= By.xpath("//h3[contains(text(),'PRODUCT KEY DETAILS')]");
	
	
	public static void validateTitle(String arg1) {
		String actual = ElementActions.getDriver().getTitle();
		System.out.print(actual);
		Assert.assertEquals(arg1, actual,"validateTitle");
		
	}
	
	public static void validateHeader(String expected) {
		String actual = ElementActions.getText(txtPageHeader);
		Assert.assertEquals(expected, actual,"\nValidate Header");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
	}


	
	
}
