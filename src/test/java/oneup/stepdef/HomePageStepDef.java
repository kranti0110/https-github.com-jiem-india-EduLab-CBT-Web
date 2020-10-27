package oneup.stepdef;

import java.util.List;
import java.util.Map;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.HomePageObject;
import oneup.pages.RegistrationPageObject;

public class HomePageStepDef {
	
	@Then("^user fill registration form$")
	public void user_fill_registration_form(DataTable datatable) throws Throwable {
		List<Map<String, String>> list = datatable.asMaps(String.class, String.class);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).get("First Name"));
			System.out.println(list.get(i).get("Last Name"));
			System.out.println(list.get(i).get("email"));
			System.out.println(list.get(i).get("Phone No"));
		}
		RegistrationPageObject.enterData(list);
	}

	@Then("^verify the maths is available as \"([^\"]*)\"$")
	public void verify_the_maths_is_available_as(String arg1) throws Throwable {
		HomePageObject.validateMath(arg1);
	}

	@Then("^verify the science is available as \"([^\"]*)\"$")
	public void verify_the_science_is_available_as(String arg1) throws Throwable {
		HomePageObject.validateScience(arg1);
	}

	@Then("^verify the homescreen have \"([^\"]*)\"$")
	public void verify_the_homescreen_have(String arg1) throws Throwable {
		HomePageObject.ignoreSceen();
	}
	
	
	@Then("^verify the link access on the homepage$")
	public void verify_the_link_access_on_the_homepage() throws Throwable {
		HomePageObject.validateMainMenuAccess();
	}



}	
