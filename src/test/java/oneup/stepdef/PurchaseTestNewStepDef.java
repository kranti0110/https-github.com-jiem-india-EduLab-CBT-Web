package oneup.stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.PurchaseTestNewPageObject;

public class PurchaseTestNewStepDef {
	
	@Then("^varify the yellow strip link as \"([^\"]*)\"$")
	public void varify_the_yellow_strip_link_as(String arg1) throws Throwable {
		PurchaseTestNewPageObject.validateYellowStripLink(arg1);
	}
	
	@When("^User nevigate to My Report page$")
	public void user_nevigate_to_My_Report_page() throws Throwable {
		PurchaseTestNewPageObject.nevigate_MyReportPage();
	}

	@When("^User click on Purchase test link$")
	public void user_click_on_Purchase_test_link_on_My_Test_page() throws Throwable {
		PurchaseTestNewPageObject.ClickonPurchasetest();
	}

	@Then("^verify user nevigates to \"([^\"]*)\" page$")
	public void verify_user_nevigates_to_page(String arg1) throws Throwable {
		PurchaseTestNewPageObject.nevigate_ConfirmPaymentPage(arg1);   
	}
	

}
