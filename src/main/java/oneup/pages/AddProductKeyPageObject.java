package oneup.pages;

import org.openqa.selenium.By;

import actions.ElementActions;
import oneup.report.Assert;

public class AddProductKeyPageObject {
	//page locators
	
	private static By txtPageHeader= By.xpath("//h3[contains(text(),'CREATE PRODUCT KEY')]");
	
	
	public static void validateHeader(String expected) {
		String actual = ElementActions.getText(txtPageHeader);
		Assert.assertEquals(expected, actual,"\nValidate Header");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
	}


	
	
}
