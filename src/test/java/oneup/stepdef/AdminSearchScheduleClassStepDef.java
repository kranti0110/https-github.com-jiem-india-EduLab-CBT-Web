package oneup.stepdef;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import actions.ElementActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.AdminSearchScheduleClassPageObject;


public class AdminSearchScheduleClassStepDef {
	
	private By Schl_Name_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[1]");
	private By Schl_Name_value=By.xpath("//span[text()='Vidya Vikas Vidyalay']");
	private By grade_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[2]");
	private By grade_value=By.xpath("//span[text()='6']");
	private By Section_Name_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[3]");
	private By Section_Name_value=By.xpath("//span[text()='A']");
	private By Selectdate_xpath=By.xpath("//input[@formcontrolname='date']");
	private By SelectfutureDate_xpath=By.xpath("//input[@formcontrolname='date']");
	private By SelectfutureDate_value=By.xpath("");
	

	@When("^User clicks on advance search dropdown$")
	public void user_clicks_on_advance_search_dropdown() throws Throwable {
		AdminSearchScheduleClassPageObject.clickOnAdvSearch();
	}

	@When("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		AdminSearchScheduleClassPageObject.clickonSearchbtn();
	}

	@Then("^Verify the Error msg for date as \"([^\"]*)\"$")
	public void verify_the_error_msg_for_date_as(String arg1) throws Throwable {
		AdminSearchScheduleClassPageObject.verifyErrorMsgForDate(arg1);
	}
	
	@Then("^Verify The error msg for school name as \"([^\"]*)\"$")
	public void verify_the_error_msg_for_school_name_as(String arg1) throws Throwable {
		AdminSearchScheduleClassPageObject.verifyErrorMsgforsclName(arg1);
	}

	@Then("^Verify the error msg For grade as \"([^\"]*)\"$")
	public void verify_the_error_msg_for_grade_as(String arg1) throws Throwable {
		AdminSearchScheduleClassPageObject.verifyerrormsgforgrade(arg1);
	}

	@Then("^Verify the error Msg for section as \"([^\"]*)\"$")
	public void verify_the_error_Msg_for_section_as(String arg1) throws Throwable {
		AdminSearchScheduleClassPageObject.verifyErrorMsgForSection(arg1);
	}
	
	@When("^Select date from calendar control$")
	public void select_date() throws Throwable {
		// TODO Auto-generated method stub
		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
							
		Date date = new Date();
					 
		// Now format the date
		String date1= dateFormat.format(date);
			 
		// Print the Date
		System.out.println("Current date and time is " +date1);
		ElementActions.sendKeys(Selectdate_xpath, date1);
	  
	}
	
	
	@When("^Select school name$")
	public void select_school_name() throws Throwable {
		AdminSearchScheduleClassPageObject.select_dropdown(Schl_Name_xpath, Schl_Name_value);
	}

	@When("^Select Grade$")
	public void select_Grade() throws Throwable {
		AdminSearchScheduleClassPageObject.select_dropdown(grade_xpath, grade_value);
	}

	@When("^Select Section$")
	public void select_Section() throws Throwable {
		AdminSearchScheduleClassPageObject.select_dropdown(Section_Name_xpath, Section_Name_value);
	}
	
	@Then("^Click on cross icon$")
	public void click_on_cross_icon() throws Throwable {
		AdminSearchScheduleClassPageObject.clickOnCrossIcon();
	}
	
	@Then("^Verify the page header \"([^\"]*)\"$")
	public void verify_the_page_header_as(String arg1) throws Throwable {
		AdminSearchScheduleClassPageObject.Verifypageheader(arg1);
	}
	
	@When("^Select future date for which homework is not schedule$")
	public void select_future_date_for_which_homework_is_not_schedule() throws Throwable {
		ElementActions.click(SelectfutureDate_xpath);
		ElementActions.click(SelectfutureDate_value);   
	}
	
	@Then("^verify the search class \"([^\"]*)\"$")
	public void verify_the_search_class(String arg1) throws Throwable  {
		AdminSearchScheduleClassPageObject.verifySearchclass(arg1);
	}

	@Then("^click on delete icon$")
	public void click_on_delete_icon() throws Throwable {
		AdminSearchScheduleClassPageObject.clickOndelete();
	}

	@Then("^verify the confirmation msg as \"([^\"]*)\"$")
	public void verify_the_confirmation_msg_as(String arg1) throws Throwable {
		AdminSearchScheduleClassPageObject.VerifydeleteConMsg(arg1);
	}

	@Then("^click on cancel$")
	public void click_on_cancel() throws Throwable {
		AdminSearchScheduleClassPageObject.clickOnCancel();
	}

	@Then("^user nevigate to schudule class list$")
	public void user_nevigate_to_schudule_class() throws Throwable {
		AdminSearchScheduleClassPageObject.NevigatetoScheduleClassList();
	   
	}
	
	@Then("^click on delete$")
	public void click_on_delete() throws Throwable {
		AdminSearchScheduleClassPageObject.clickOndeletebtn();
	}
	
	@Then("^click on the session link$")
	public void click_on_the_session_link() throws Throwable {
		AdminSearchScheduleClassPageObject.ClickOnsessionLink();
	}

	@Then("^Session link should be open in new tab$")
	public void session_link_should_be_open_in_new_tab() throws Throwable {
		AdminSearchScheduleClassPageObject.OpenSessionLink();
	}
	
	@Then("^verify Satrt time \"([^\"]*)\"$")
	public void verify_Satrt_time(String arg1) throws Throwable {
		AdminSearchScheduleClassPageObject.verifyStarttime(arg1);
	}

	@Then("^verify End time \"([^\"]*)\"$")
	public void verify_End_time(String arg1) throws Throwable {
		AdminSearchScheduleClassPageObject.verifyEndtime(arg1);
	}





}
