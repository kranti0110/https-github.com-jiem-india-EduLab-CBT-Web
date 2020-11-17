package oneup.stepdef;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.RegistrationPageObject;
import oneup.report.Assert;


public class RegistrationStepDef {
	@When("^User navigates to Registration Page$")
	public void user_navigates_to_Registration_Page() throws Throwable {
		RegistrationPageObject.navigate_Registration();
	}	

	@Then("^verify the pageheader as \"([^\"]*)\"$")
	public void verify_the_pageheader_as(String arg1) throws Throwable {
		RegistrationPageObject.validateHeader(arg1);
	}
	
	@Then("^verify the page title as \"([^\"]*)\"$")
	public void verify_the_page_title_as(String arg1) throws Throwable {
		RegistrationPageObject.validateTitle(arg1);
	}
	
	@Then("^verify the Proceed For Verification button is Disabled when Tnc is Unchecked and All mandatory fields are not filled$")
	public void verify_the_Proceed_For_Verification_button_is_Disabled_when_Tnc_is_Unchecked_and_All_mandatory_fields_are_not_filled() throws Throwable {
		RegistrationPageObject.validateProceedButtonDisabledTnCDisabled();
	}
	
	@Then("^verify the Proceed For Verification button is Disabled when Tnc is Checked and All mandatory fields are not filled$")
	public void verify_the_Proceed_For_Verification_button_is_Disabled_when_Tnc_is_Checked_and_All_mandatory_fields_are_not_filled() throws Throwable {
	    RegistrationPageObject.validateProceedButtonDisabledTnCEnabled();
	}
	
	
	/*@Then("^verify the default highlight is on \"([^\"]*)\"$")
	public void verify_the_default_highlight_is_on() throws Throwable {
	    RegistrationPageObject.validateDefaultHighlight();
	}*/
	
//	@When("^fill up the new registration form with the following data$")
//	public void fill_up_the_new_registration_form_with_the_following_data(DataTable datatable) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//		   List<List<String>> ls  = datatable.raw();
//		   for(List<String> l : ls) 
//		   {
//			   for(String h : l) 
//			   {
//				   System.out.println(h);
//			   }
//	}
////	
//	@Then("^user fill registration form$")
//	public void user_fill_registration_form(DataTable datatable) throws Throwable {
//		List<List<String>> ls  = datatable.raw();
//		for(List<String> l : ls) {
//		   for(String h : l) {
//			   System.out.println(h);
//				   }
//			   }
//			}
		   
		   
	
}

