package oneup.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.module.LoginModule;
import oneup.pages.LoginPageObject;
import oneup.pages.StudentHomeworkPageObject;

public class StudentHomeworkPageStepDef {
	

	@Given("^User Clicks on Homework Link$")
	public void user_Clicks_on_Homework_Link() throws Throwable {
		StudentHomeworkPageObject.clickHomeworkLink();
	}

	@Then("^verify the Page Title$")
	public void verify_the_Page_Title() throws Throwable {
		StudentHomeworkPageObject.verifyHomePageTitle();
	}

	@Then("^User Clicks on Download worksheet$")
	public void user_Clicks_on_Download_worksheet() throws Throwable {
		StudentHomeworkPageObject.clickDownloadLink();
	}

	@Then("^User Uploads the homework$")
	public void user_Uploads_the_homework() throws Throwable {
		StudentHomeworkPageObject.clickUploadLink();
	}

	@Then("^User Logout$")
	public void user_Logout() throws Throwable {
		
	}
	
}
