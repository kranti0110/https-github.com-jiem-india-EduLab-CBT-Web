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
	
	
	
}
