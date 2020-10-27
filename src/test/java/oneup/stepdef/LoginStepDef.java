package oneup.stepdef;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.LoginPageObject;
import oneup.module.LoginModule;

public class LoginStepDef {
	
	@When("^User login with \"([^\"]*)\"$")
	public void user_login_with(String arg1) throws Throwable {
		System.out.print("LoginStepDef:Im an in the LoginStepDef --user_login_with " );
		LoginModule.login(arg1);
	}
	
	@Then("^verify the pagetitle as \"([^\"]*)\"$")
	public void verify_the_pagetitle_as(String arg1) throws Throwable {
		System.out.print("LoginStepDef:Im an in the LoginStepDef --verify_the_pagetitle_as " );
		LoginPageObject.validateTitle(arg1);
	}

	@When("^User navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
		System.out.print("LoginStepDef:Im an in the LoginStepDef --user_navigates_to_Login_Page " );
		LoginPageObject.navigate_login();
	}

	@Then("^varify the pageheader as \"([^\"]*)\"$")
	public void varify_the_pageheader_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPageObject.validateHeader(arg1);
	}
	
	@Then("^verify the subjects listed \"([^\"]*)\" and \"([^\"]*)\"$")
	public void verify_the_subjects_listed_and(String arg1, String arg2) throws Throwable {
		LoginPageObject.validateMath(arg1);
		LoginPageObject.validateScience(arg2);
	}

	@Then("^verify the error message \"([^\"]*)\"\"$")
	public void verify_the_error_message(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPageObject.validateError(arg1);
	}	

	@When("^User forget password$")
	public void user_forget_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPageObject.navigate_forgetpassword();
	}	
	
	@When("^User enter valid email \"([^\"]*)\" and send code$")
	public void user_enter_valid_email_and_send_code(String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPageObject.navigate_verification_code(email);
	}
	
	@Then("^verify if the code verification page appears\\.$")
	public void verify_if_the_code_verification_page_appears() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPageObject.validateCodeVerification();
	}
	
}
