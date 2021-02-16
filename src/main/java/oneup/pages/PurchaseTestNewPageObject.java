package oneup.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import actions.ElementActions;
import oneup.report.Assert;

public class PurchaseTestNewPageObject {

	private static By MyReport=By.xpath("//a[text()=' MY REPORT']");
	private static By PurchaseTest=By.xpath("//span[text()=' Purchase Test >']");

	public static void validateYellowStripLink(String expected) {
		System.out.print("Yellow Strip Link is " );
		By titlePURCHASETEST =By.xpath("//span[@id='purchase-test']");
		String actual = ElementActions.getText(titlePURCHASETEST );
		System.out.print(actual );
		Assert.assertEquals(expected, actual, actual);
	
	}

	public static void nevigate_MyReportPage() {
	ElementActions.click(MyReport);
		
	}

	public static void ClickonPurchasetest() {
		ElementActions.click(PurchaseTest);
		
	}

	public static void nevigate_ConfirmPaymentPage(String arg1) {
		String TestCurntURL = ElementActions.getDriver().getCurrentUrl();
		System.out.println(TestCurntURL);
		assertEquals("https://oneuptest.net/#/oneup-product-list", TestCurntURL);
		
		
	}

	

}
