package oneup.stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.ProductKeyAddPageObject;
import oneup.pages.ProductKeyDetailsPageObject;
import oneup.pages.ProductKeyManagementPageObject;

public class ProductKeyDetailsStepDef
{
	@When("^User clicks ProductKeyDetailsIcon$")
	public void user_clicks_ADD_PRODUCT_KEY() throws Throwable {
	    ProductKeyManagementPageObject.clickDeatilsProductKetIcon();
	}
	
	
	@Then("^verify the pageTitle_DetailsProductKey as \"([^\"]*)\"$")
	public void verify_the_pageTitle_DetailsProductKey_as(String arg1) throws Throwable {
		ProductKeyDetailsPageObject.validateTitle(arg1);
	}
	
	@Then("^verify the ProductKeyDetailspageHeader is \"([^\"]*)\"$")
	public void verify_the_ProductKeyDetailspageHeader_is(String arg1) throws Throwable {
		ProductKeyDetailsPageObject.validateHeader(arg1);
	}
	
	
	
}

	   
	


