package oneup.pages;

import org.openqa.selenium.By;

import actions.ElementActions;
import oneup.report.Assert;

public class ProductKeyManagementPageObject {
	//page locators
	
	private static By btnAddProductKey= By.xpath("//body/app-root[1]/app-product-management[1]/app-list-product[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]");
	private static By iconProductDetails= By.xpath("//tbody/tr[1]/td[6]/span[2]");
	
	public static void validateTitle(String expected) {
		String actual = ElementActions.getDriver().getTitle();
		System.out.print(actual);
		Assert.assertEquals(expected, actual,"validateTitle");
	}

	public static void clickAddProductKetButton() {
		ElementActions.click(btnAddProductKey);
				
	}

	public static void clickDeatilsProductKetIcon() {
		ElementActions.click(iconProductDetails);
	}
	
	
	
}
