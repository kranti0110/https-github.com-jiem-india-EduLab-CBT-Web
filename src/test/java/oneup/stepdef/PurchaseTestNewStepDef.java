package oneup.stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.PurchaseTestNewPageObject;

public class PurchaseTestNewStepDef {
	
	@Then("^varify the yellow strip link as \"([^\"]*)\"$")
	public void varify_the_yellow_strip_link_as(String arg1) throws Throwable {
		System.out.print("PurchaseTestNewStepDef:Im an in the PurchaseTestNewStepDef --verify_the_yellow_strip_link_as " );
		PurchaseTestNewPageObject.validateYellowStripLink(arg1);
	}
	
	@When("^User nevigate to My Report page$")
	public void user_nevigate_to_My_Report_page() throws Throwable {
		System.out.print("PurchaseTestNewStepDef:Im an in the PurchaseTestNewStepDef --user_navigates_to_my_report_page " );
		PurchaseTestNewPageObject.nevigate_MyReportPage();
	}

	@Then("^varify the yellow strip link text as \"([^\"]*)\"$")
	public void varify_the_yellow_strip_link_text_as(String arg1) throws Throwable {
		System.out.print("PurchaseTestNewStepDef:Im an in the PurchaseTestNewStepDef --verify_the_yellow_strip_link_text_as " );
		PurchaseTestNewPageObject.validateYellowStripLink(arg1);
	}
	
	@When("^User click on Purchase test link on My Test page$")
	public void user_click_on_Purchase_test_link_on_My_Test_page() throws Throwable {
		System.out.println("Inside - clicks on purchase test");
	}

	@Then("^verify user nevigates to \"([^\"]*)\" page$")
	public void verify_user_nevigates_to_page(String arg1) throws Throwable {
		System.out.print("PurchaseTestNewStepDef:Im an in the PurchaseTestNewStepDef --user_navigates_to_confirm_payment_page " );
		PurchaseTestNewPageObject.nevigate_ConfirmPaymentPage(arg1);   
	}
	
	@When("^User nevigate to My Report tab$")
	public void user_nevigate_to_My_Report_tab() throws Throwable {
		System.out.print("PurchaseTestNewStepDef:Im an in the PurchaseTestNewStepDef --user_navigates_to_my_report_tab " );
		PurchaseTestNewPageObject.nevigate_MyReportPage();
	}

	@Then("^User click on Purchase test link on My Report tab$")
	public void user_click_on_Purchase_test_link_on_My_Report_tab() throws Throwable {
		System.out.println("Inside - clicks on purchase test link");
	}

	@Then("^verify user nevigates to \"([^\"]*)\" Screen$")
	public void verify_user_nevigates_to_Screen(String arg1) throws Throwable {
		System.out.print("PurchaseTestNewStepDef:Im an in the PurchaseTestNewStepDef --user_navigates_to_confirm_payment_screen " );
		PurchaseTestNewPageObject.nevigate_ConfirmPaymentPage(arg1);
	}

}
