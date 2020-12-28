package oneup.stepdef;


import java.util.List;
import java.util.Map;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.RegistrationPageObject;

public class RegistrationStepDef
{
	@When("^User navigates to Registration Page$")
	public void user_navigates_to_Registration_Page() throws Throwable {
		RegistrationPageObject.navigate_Registration();
	}	

	@Then("^verify the registrationPageHeader as \"([^\"]*)\"$")
	public void verify_the_registrationPageHeader_as(String arg1) throws Throwable {
		RegistrationPageObject.validateRegistrationPageHeader(arg1);
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

	@Then("^verify the default focus is on First Name$")
	public void verify_the_default_focus_is_on_First_Name() throws Throwable {
		RegistrationPageObject.validateDefaultFocus();
	}
	
	@Then("^user fill registration form with valid data without discount code$")
	public void user_fill_registration_form_with_valid_data_without_discount_code(DataTable arg1) throws Throwable {
	    List<Map<String,String>> ls = arg1.asMaps(String.class, String.class); 
	    RegistrationPageObject.enterData(ls);
	}   	
	
	@Then("^user fill registration form with valid data with discount code$")
	public void user_fill_registration_form_with_valid_data_with_discount_code(DataTable arg1) throws Throwable {
		List<Map<String,String>> ls = arg1.asMaps(String.class, String.class); 
	    RegistrationPageObject.enterData(ls);
	}
	
	@When("^click on TnC checkbox$")
	public void click_on_TnC_checkbox() throws Throwable {
		RegistrationPageObject.clickTnC();
	}

	@When("^register$")
	public void register() throws Throwable {
	    RegistrationPageObject.register();
	}
	    
}

	   
	


