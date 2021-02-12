package oneup.pages;

import org.openqa.selenium.By;

import actions.ElementActions;
import oneup.report.Assert;

public class PurchaseTestNewPageObject {

	public static void validateYellowStripLink(String expected) {
		System.out.print("Im an in the validateYellowStripLink" );
		By titlePURCHASETEST =By.xpath("//span[@id='purchase-test']");
		String actual = ElementActions.getText(titlePURCHASETEST );
//		String actual = ElementActions.getText(header);
		System.out.print(actual );
		Assert.assertEquals(expected, actual, actual);
	
	}

	public static void nevigate_MyReportPage() {
		System.out.print("Im an in the navigate_MyReportPage " );
//		ElementActions.click(MyReport);
		
	}

	public static void nevigate_ConfirmPaymentPage(String arg1) {
		System.out.print("Im an in the navigate_ConfirmPaymentPage " );
//		ElementActions.click(linkPURCHASETEST);
		
	}

}
