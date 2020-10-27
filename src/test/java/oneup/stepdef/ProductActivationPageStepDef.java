package oneup.stepdef;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.ProductActivationPageObject;
import oneup.pages.ProfilePageObject;

public class ProductActivationPageStepDef {

//	
//	@Then("^User navigates to profile Page$")
//	public void user_navigates_to_profile_Page() throws Throwable {
//	   ProfilePageObject.navigate_profile();
//	}
//
//	
	@Then("^verify the product page header as \"([^\"]*)\"$")
	public void verify_the_product_page_header_as(String arg1) throws Throwable {
		ProductActivationPageObject.validateProductHeader(arg1);
	}
	
	@Then("^Verify go to profile button$")
	public void verify_go_to_my_profile_button() throws Throwable {
		ProductActivationPageObject.validatGotoProfile();
	}
	
	
	@Then("^Verify if the user get multiple times code usage error message.$")
	public void verify_multiple_times_usage_error() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ProductActivationPageObject.validateMultipleTimesMsg();
	}
	
//
//	@When("^update profile by clearing textboxes$")
//	public void update_profile_by_clearing_textboxes() throws Throwable {
//		ProfilePageObject.clearFields();
//	}
//
//	
	@Then("^Verify the valid key message$")
	public void verify_the_mandatory_messages() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ProductActivationPageObject.validateValidKeyMsg();
	}

	
	
		
	
	@Then("^User navigates to  Product Activation Page$")
	public void user_navigates_to_Product_Activation_Page() throws Throwable {
		ProductActivationPageObject.navigateActivationPage();
	}
	
	@When("^update product and user key  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void update_product_and_user_key_and(String productkey, String userkey) throws Throwable {
		ProductActivationPageObject.updateProductKey(productkey, userkey);
	}
	
	
	@When("^update Product Activation Page by clearing textboxes$")
	public void update_Product_Activation_Page_by_clearing_textboxes() throws Throwable {
		ProductActivationPageObject.clearFields();
	}
	
	@When("^Verify the Product Activation mandatory messages$")
	public void verify_the_Product_Activation_mandatory_messages() throws Throwable {
		ProductActivationPageObject.validateMandatoryMsg();
	}




}	
