package oneup.stepdef;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.ProfilePageObject;

public class ProfilePageStepDef {

	
	@Then("^User navigates to profile Page$")
	public void user_navigates_to_profile_Page() throws Throwable {
	   ProfilePageObject.navigate_profile();
	}

	
	@Then("^verify the profile page header as \"([^\"]*)\"$")
	public void verify_the_profile_page_header_as(String arg1) throws Throwable {
		ProfilePageObject.validateHeader(arg1);
	}

	
	@When("^update section and rollno with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void update_section_and_rollno_with_and(String section, String rollno) throws Throwable {
		ProfilePageObject.updateProfile(section,rollno);
	}
	
	@Then("^Verify go to my school button$")
	public void verify_go_to_my_school_button() throws Throwable {
		ProfilePageObject.validatGoSchool();
	}
	
	
	@Then("^Verify go to my school button does not appear$")
	public void verify_go_to_my_school_button_does_not_appear() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ProfilePageObject.validatUpdateButton();
	}
	

	@When("^update profile by clearing textboxes$")
	public void update_profile_by_clearing_textboxes() throws Throwable {
		ProfilePageObject.clearFields();
	}

	
	@Then("^Verify the mandatory messages$")
	public void verify_the_mandatory_messages() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ProfilePageObject.validateMandatoryMsg();
	}

	

}	
