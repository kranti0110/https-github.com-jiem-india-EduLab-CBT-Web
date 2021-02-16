package oneup.stepdef;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.AdminIncreaseExamAttemptPageObject;


public class AdminIncreaseExamAttemptStepDef {
	
	@When("^User clicks on Increase Exam Attempt menu$")
	public void user_clicks_on_Increase_Exam_Attempt_menu() throws Throwable {
	   AdminIncreaseExamAttemptPageObject.clickOnIncExamAttemptMenu();
	}
	
	@Then("^Verify page header \"([^\"]*)\"$")
	public void Verify_page_header(String arg1) throws Throwable {
		AdminIncreaseExamAttemptPageObject.verifyPageheader(arg1);
	}

	
	@Then("^Enter a valid email id$")
	public void enter_a_valid_email_id(DataTable fieldvalues) throws Throwable {
			List<List<String>> data = fieldvalues.raw();
			AdminIncreaseExamAttemptPageObject.enterData(data.get(1).get(0));
	}

	@Then("^Click on the Reset button$")
	public void click_on_the_Reset_button() throws Throwable {
		AdminIncreaseExamAttemptPageObject.clickonResetbtn();
	}
	@Then("^Verify the message as \"([^\"]*)\"$")
	public void Verify_the_message_as(String arg1) throws Throwable {
		AdminIncreaseExamAttemptPageObject.Verifymsg(arg1);
	}
	
	@Then("^Enter the invalid email id$")
	public void enter_the_invalid_email_id(DataTable fieldvalues) throws Throwable {
		List<List<String>> data = fieldvalues.raw();
		AdminIncreaseExamAttemptPageObject.enterinvalidData(data.get(1).get(0));
	}
	
	@Then("^Verify the error message \"([^\"]*)\"$")
	public void Verify_the_error_message(String arg1) throws Throwable {
		AdminIncreaseExamAttemptPageObject.Verifyerrormsgforinvalidid(arg1);
	}
	
	@When("^click on user profile icon$")
	public void click_on_user_profile_icon() throws Throwable {
		AdminIncreaseExamAttemptPageObject.clickonuserprofile();
	}

	@When("^log out from admin user$")
	public void log_out_from_admin_user() throws Throwable {
		AdminIncreaseExamAttemptPageObject.clickOnLogOut();
	}

	@When("^user go to My test tab$")
	public void user_go_to_My_test_tab() throws Throwable {
		AdminIncreaseExamAttemptPageObject.ClickOnMyTest();
	}

	@When("^user clicks on Maths Take test btn$")
	public void user_clicks_on_Maths_Take_test_btn() throws Throwable {
		AdminIncreaseExamAttemptPageObject.CliclOnMathsTakeTest();
	}

	@When("^user clicks on T&C checkbox$")
	public void user_clicks_on_T_C_checkbox() throws Throwable {
		AdminIncreaseExamAttemptPageObject.ClickOnTandC();
	}

	@When("^user click on I am ready to take test btn$")
	public void user_click_on_I_am_ready_to_take_test_btn() throws Throwable {
		AdminIncreaseExamAttemptPageObject.ClickOnReadyForTestbtn();
	}

	@When("^user clicks on Next btn$")
	public void user_clicks_on_Next_btn() throws Throwable {
		AdminIncreaseExamAttemptPageObject.ClickOnNextbtn();
	}

	@When("^user clicks on abort icon$")
	public void user_clicks_on_abort_icon() throws Throwable {
		AdminIncreaseExamAttemptPageObject.ClickOnAbort();
	}

	@When("^user clicks on yes to abort the test$")
	public void user_clicks_on_yes_to_abort_the_test() throws Throwable {
		AdminIncreaseExamAttemptPageObject.ClickOnYesToAbort();
	}

	@When("^user clicks on maths Resume test btn$")
	public void user_clicks_on_maths_Resume_test_btn() throws Throwable {
		AdminIncreaseExamAttemptPageObject.ClickOnResumeTest();
	}

	@Then("^verify the text as \"([^\"]*)\"$")
	public void verify_the_text_as(String arg1) throws Throwable {
		AdminIncreaseExamAttemptPageObject.verifyTheResumeText(arg1);
	}
	
	@When("^user clicks on Science Take test btn$")
	public void user_clicks_on_Science_Take_test_btn() throws Throwable {
		AdminIncreaseExamAttemptPageObject.clickOnScitakeTestbtn();
	}
	
	
}
