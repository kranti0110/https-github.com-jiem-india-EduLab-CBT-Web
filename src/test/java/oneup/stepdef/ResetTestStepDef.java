package oneup.stepdef;

import java.util.List;


import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.ResetTestPageObject;

public class ResetTestStepDef {
	
	@When("^User clicks on Reset Test menu$")
	public void user_clicks_on_Reset_Test_menu() throws Throwable {
		ResetTestPageObject.clickonResetTest();
	   
	}

	@Then("^verify the page header as \"([^\"]*)\"$")
	public void verify_the_page_header_as(String arg1) throws Throwable {
		ResetTestPageObject.verifyPageHeader(arg1);
	    
	}
	
	@Then("^Enter valid email id$")
	public void enter_valid_email_id(DataTable fieldvalues) throws Throwable {
			List<List<String>> data = fieldvalues.raw();
			ResetTestPageObject.enterData(data.get(1).get(0));
	}

	@Then("^Click on Reset button$")
	public void click_on_Reset_button() throws Throwable {
		ResetTestPageObject.clickonResetbtn();
	}
	@Then("^Verify the message \"([^\"]*)\"$")
	public void Verify_the_message_as(String arg1) throws Throwable {
		ResetTestPageObject.Verifymsg(arg1);
	}

	
	
	@Then("^Enter invalid email id$")
	public void enter_invalid_email_id(DataTable fieldvalues) throws Throwable {
		List<List<String>> data = fieldvalues.raw();
		ResetTestPageObject.enterinvalidData(data.get(1).get(0));
	}
	
	@Then("^Verify the error message as \"([^\"]*)\"$")
	public void Verify_the_error_message_as(String arg1) throws Throwable {
		ResetTestPageObject.Verifyerrormsgforinvalidid(arg1);
	}
	
	@When("^User click on the user profile$")
	public void User_click_on_the_user_profile() throws Throwable {
		ResetTestPageObject.clickonuserprofile();
	}
	
	
	@When("^User log out from appication$")
	public void user_log_out_from_appication() throws Throwable {
		ResetTestPageObject.clickonlogout();
	}
	
	
	@When("^nevigate to My test page$")
	public void nevigate_to_My_test_page() throws Throwable {
		ResetTestPageObject.nevigatetoMytest();
	}

	@When("^Click on maths Take test$")
	public void click_on_maths_Take_test() throws Throwable {
		ResetTestPageObject.clickOnMathtakeTestbtn();
	}
	
	@When("^click on tandc$")
	public void click_on_t_and_C() throws Throwable {
		ResetTestPageObject.ClickontandC();
	}

	@When("^Click on Yes Iam ready for the test$")
	public void click_on_Yes_Iam_ready_for_the_test() throws Throwable {
		ResetTestPageObject.ClickonReadyforTest();
	}

	@When("^Click on next$")
	public void click_on_next() throws Throwable {
		ResetTestPageObject.ClickOnnext();
	}

	@When("^click on abort$")
	public void click_on_abort() throws Throwable {
		ResetTestPageObject.clickonAbort();
	}

	@When("^click on yes to abort the test$")
	public void click_on_yes_to_abort_the_test() throws Throwable {
		ResetTestPageObject.clickonYesToAbort();
	}

	@Then("^verify the maths test button name as \"([^\"]*)\"$")
	public void verify_the_maths_test_button_name_as(String arg1) throws Throwable {
		ResetTestPageObject.verifyMathsTestbtnname(arg1);
	}

	@Then("^verify the maths test button name after reset \"([^\"]*)\"$")
	public void verify_the_maths_test_button_name_after_reset(String arg1) throws Throwable {
		ResetTestPageObject.verifyMathsTestbtnafterReset(arg1);
	}
	
	@When("^Click on Science Take test$")
	public void click_on_Science_Take_test() throws Throwable {
		ResetTestPageObject.clickOnSciTakeTest();
	}
	   

	@Then("^verify the Science test button name as \"([^\"]*)\"$")
	public void verify_the_Science_test_button_name_as(String arg1) throws Throwable {
		ResetTestPageObject.verifyScitestbtn(arg1);
	    
	}
	
	@Then("^verify the science test button name after reset \"([^\"]*)\"$")
	public void verify_the_science_test_button_name_after_reset(String arg1) throws Throwable {
		ResetTestPageObject.verifysciTestbtnafterReset(arg1);

	}
	
}
