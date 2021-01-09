package oneup.stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.AddProductKeyPageObject;
import oneup.pages.AdminLandingPageObject;
import oneup.pages.ProductKeyManagementPageObject;

public class ProductKeyManagementStepDef
{
	@When("^User navigates to ProductKeyManagement page$")
	public void user_navigates_to_ProductKeyManagement_page() throws Throwable {
		AdminLandingPageObject.navigate_productKeyManagement();
	}

	@Then("^verify the pagetitleproductmgmt as \"([^\"]*)\"$")
	public void verify_the_pagetitleproductmgmt_as(String arg1) throws Throwable {
		ProductKeyManagementPageObject.validateTitle(arg1);
	}
	
	@When("^User clicks ADD PRODUCT KEY$")
	public void user_clicks_ADD_PRODUCT_KEY() throws Throwable {
	    ProductKeyManagementPageObject.clickAddProductKetButton();
	}
	
	@Then("^verify the createProductKeypageHeader is \"([^\"]*)\"$")
	public void verify_the_createProductKeypageHeader_is(String arg1) throws Throwable {
		AddProductKeyPageObject.validateHeader(arg1);
	}
	
	
}

	   
	


