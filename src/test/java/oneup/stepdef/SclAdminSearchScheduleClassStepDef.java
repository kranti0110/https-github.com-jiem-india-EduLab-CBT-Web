package oneup.stepdef;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import actions.ElementActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.SclAdminSearchSchedulePageObject;

public class SclAdminSearchScheduleClassStepDef {
	
	private By grade_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[1]");
	private By grade_value=By.xpath("//span[text()='7']");
	private By Section_Name_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[2]");
	private By Section_Name_value=By.xpath("//span[text()='A']");
	private By Selectdate_xpath=By.xpath("//input[@formcontrolname='date']");
	

	@When("^user clicks on advance search dropdown$")
	public void user_clicks_on_advance_search_dropdown() throws Throwable {
		SclAdminSearchSchedulePageObject.clickOnAdvSearch();
	}

	@When("^click on search button$")
	public void click_on_search_button() throws Throwable {
		SclAdminSearchSchedulePageObject.clickonSearchbtn();
	}

	@Then("^verify the Error msg for date as \"([^\"]*)\"$")
	public void verify_the_error_msg_for_date_as(String arg1) throws Throwable {
		SclAdminSearchSchedulePageObject.verifyErrorMsgForDate(arg1);
	}
	

	@Then("^verify the error msg For grade as \"([^\"]*)\"$")
	public void verify_the_error_msg_for_grade_as(String arg1) throws Throwable {
		SclAdminSearchSchedulePageObject.verifyerrormsgforgrade(arg1);
	}

	@Then("^verify the error Msg for section as \"([^\"]*)\"$")
	public void verify_the_error_Msg_for_section_as(String arg1) throws Throwable {
		SclAdminSearchSchedulePageObject.verifyErrorMsgForSection(arg1);
	}
	
	@When("^select date from calendar control$")
	public void select_date() throws Throwable {
		// TODO Auto-generated method stub
		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
							
		Date date = new Date();
					 
		// Now format the date
		String date1= dateFormat.format(date);
			 
		// Print the Date
		System.out.println("Current date and time is " +date1);
		ElementActions.sendKeys(Selectdate_xpath, date1);
	  
	}
	

	@When("^select Grade$")
	public void select_Grade() throws Throwable {
		SclAdminSearchSchedulePageObject.select_dropdown(grade_xpath, grade_value);
	}

	@When("^select Section$")
	public void select_Section() throws Throwable {
		SclAdminSearchSchedulePageObject.select_dropdown(Section_Name_xpath, Section_Name_value);
	}
	
	@Then("^click on cross icon$")
	public void click_on_cross_icon() throws Throwable {
		SclAdminSearchSchedulePageObject.clickOnCrossIcon();
	}
	
	@Then("^verify the page header \"([^\"]*)\"$")
	public void verify_the_page_header_as(String arg1) throws Throwable {
		SclAdminSearchSchedulePageObject.Verifypageheader(arg1);
	}
	
	
	@Then("^verify search class \"([^\"]*)\"$")
	public void verify_search_class(String arg1) throws Throwable  {
		SclAdminSearchSchedulePageObject.verifySearchclass(arg1);
	}
	
	@Then("^Verify page header$")
	public void Verify_the_page_header_after_adding_class() throws Throwable {
		SclAdminSearchSchedulePageObject.verifyheader();
	}

	@Then("^Click on delete icon$")
	public void Click_on_delete_icon() throws Throwable {
		SclAdminSearchSchedulePageObject.clickOndelete();
	}

	@Then("^Verify the confirmation msg as \"([^\"]*)\"$")
	public void Verify_the_confirmation_msg_as(String arg1) throws Throwable {
		SclAdminSearchSchedulePageObject.VerifydeleteConMsg(arg1);
	}

	@Then("^Click on cancel btn$")
	public void Click_on_cancel_btn() throws Throwable {
		SclAdminSearchSchedulePageObject.clickOnCancel();
	}

	@Then("^User nevigate to schudule class list$")
	public void User_nevigate_to_schudule_class() throws Throwable {
		SclAdminSearchSchedulePageObject.NevigatetoScheduleClassList();
	   
	}
	
	@Then("^Click on delete$")
	public void Click_on_delete() throws Throwable {
		SclAdminSearchSchedulePageObject.clickOndeletebtn();
	}
	
	@Then("^click on the given session link$")
	public void click_on_the_given_session_link() throws Throwable {
		SclAdminSearchSchedulePageObject.ClickOngivensessionLink();
	}

	@Then("^session link should be open in new window$")
	public void session_link_should_be_open_in_new_window() throws Throwable {
		SclAdminSearchSchedulePageObject.OpentheSessionLink();
	}
	
	@Then("^Verify Satrt time \"([^\"]*)\"$")
	public void Verify_Satrt_time(String arg1) throws Throwable {
		SclAdminSearchSchedulePageObject.verifyStarttime(arg1);
	}

	@Then("^Verify End time \"([^\"]*)\"$")
	public void Verify_End_time(String arg1) throws Throwable {
		SclAdminSearchSchedulePageObject.verifyEndtime(arg1);
	}





}



