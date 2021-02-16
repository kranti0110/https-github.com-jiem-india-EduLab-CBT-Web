package oneup.stepdef;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;

import org.openqa.selenium.By;

import actions.ElementActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.AdminScheduleClassPageObject;


public class AdminScheduleclassStepDef {
	
	private By School_Name_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[1]");
	private By School_Name_value=By.xpath("(//span[text()='OneUp School'])");
	private By Start_Time_Hours_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[2]");
	private By Start_Time_Hours_value=By.xpath("//span[text()='10']");
	private By Start_Time_Minutes_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[3]");
	private By Start_Time_Minutes_value=By.xpath("(//span[text()='00'])[1]");
	private By End_Time_Hours_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[4]");
	private By End_Time_Hours_value=By.xpath("//span[text()='11']");
	private By End_Time_Minutes_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[5]");
	private By End_Time_Minutes_value=By.xpath("(//span[text()='00'])[2]");
	private By Grade_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[6]");
	private By Grade_value=By.xpath("//span[text()='7']");
	private By Section_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[7]");
	private By Section_value=By.xpath("//span[text()='A']");
	private By Subject_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[8]");
	private By Subject_value=By.xpath("//span[text()='Mathematics']");
	private By date_xpath=By.xpath("//input[@placeholder='Date']");
	
				
	@When("^User navigates to  Schedule Class menu$")
	public void user_navigates_to_Schedule_Class_menu() throws Throwable {
		AdminScheduleClassPageObject.navigatetoScheduleClass();
	    
	}

	@Then("^verify the message as \"([^\"]*)\"$")
	public void verify_the_message_as(String arg1) throws Throwable {
		AdminScheduleClassPageObject.VerifyMessage(arg1);
	}
	
	@When("^User clicks on add new class button$")
	public void user_clicks_on_add_new_class_button() throws Throwable {
		AdminScheduleClassPageObject.ClickOnAddNewClassbtn();
	   
	}

	@Then("^User nevigates to add new class page$")
	public void user_nevigates_to_add_new_class_page() throws Throwable {
		AdminScheduleClassPageObject.nevigatetoAddNewClassPage();
	    
	}
	
	@Then("^Verify page header as \"([^\"]*)\"$")
	public void Verify_page_header_as(String arg1) throws Throwable {
		AdminScheduleClassPageObject.verifyPageHeader(arg1);
	}
	
	@Then("^Select date$")
	public void select_date() throws Throwable {
		// TODO Auto-generated method stub
		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
							
		Date date = new Date();
					 
		// Now format the date
		String date1= dateFormat.format(date);
			 
		// Print the Date
		System.out.println("Current date and time is " +date1);
		ElementActions.sendKeys(date_xpath, date1);
	}
	
	@Then("^Select school name from the list of dropdown$")
	public void select_School_Name_from_the_list_of_dropdown() throws Throwable {
		AdminScheduleClassPageObject.select_dropdown(School_Name_xpath, School_Name_value);
	}
	
	@Then("^Select Start Time Hours from dropdown$")
	public void select_Start_Time_Hours_from_dropdown() throws Throwable {
		AdminScheduleClassPageObject.select_dropdown(Start_Time_Hours_xpath, Start_Time_Hours_value);
	    
	}

	@Then("^Select Start Time Minutes from dropdown$")
	public void select_Start_Time_Minutes_from_dropdown() throws Throwable {
		AdminScheduleClassPageObject.select_dropdown(Start_Time_Minutes_xpath, Start_Time_Minutes_value);
	   
	}

	@Then("^Select End Time Hours from dropdown$")
	public void select_End_Time_Hours_from_dropdown() throws Throwable {
		AdminScheduleClassPageObject.select_dropdown(End_Time_Hours_xpath, End_Time_Hours_value);
	    
	}

	@Then("^Select End Time Minutes from dropdown$")
	public void select_End_Time_Minutes_from_dropdown() throws Throwable {
		AdminScheduleClassPageObject.select_dropdown(End_Time_Minutes_xpath, End_Time_Minutes_value);
	    
	}

	@Then("^Select Grade from dropdown$")
	public void select_Grade_from_dropdown() throws Throwable {
		AdminScheduleClassPageObject.select_dropdown(Grade_xpath, Grade_value);
	    
	}

	@Then("^Select Section from dropdown$")
	public void select_Section_from_dropdown() throws Throwable {
		AdminScheduleClassPageObject.select_dropdown(Section_xpath, Section_value);
	    
	}

	@Then("^Select Subject from dropdown$")
	public void select_Subject_from_dropdown() throws Throwable {
		AdminScheduleClassPageObject.select_dropdown(Subject_xpath, Subject_value);
	   
	}

	@Then("^Click on any one Online Meeting Using option$")
	public void click_on_any_one_Online_Meeting_Using_option() throws Throwable {
		AdminScheduleClassPageObject.clickOnOnlineMeetingUsingOption();
	}
	
	 @Then("^User enters meeting url message and topic$")
    	public void user_enters_meeting_url_message_and_topic(DataTable fieldvalues) throws Throwable {
		List<List<String>> data = fieldvalues.raw();
		AdminScheduleClassPageObject.enterData(data.get(1).get(0), data.get(1).get(1), data.get(1).get(2));
		
	}

	@Then("^Click on Save$")
	public void click_on_Save() throws Throwable {
		AdminScheduleClassPageObject.clickOnSave();
	    
	}
	
	@Then("^verify the page header after adding class$")
	public void verify_the_page_header_after_adding_class() throws Throwable {
		AdminScheduleClassPageObject.Verifyheaderafteraddingclass();
	}

	@Then("^The New class is added succefully$")
	public void the_New_class_is_added_succefully() throws Throwable {
		System.out.print("The_New_class_is_added_succefully" );
	    
	}
	
	@Then("^Click on cancel button$")
	public void click_on_cancel_button() throws Throwable {
		AdminScheduleClassPageObject.clickOnCancel();
	}

	@Then("^User should nevigate to time table page$")
	public void user_should_nevigate_to_time_table_page() throws Throwable {
		AdminScheduleClassPageObject.nevigateToTimeTable();
	}
	
	@Then("^verify the section Error message as \"([^\"]*)\"$")
	public void verify_the_section_Error_message_as(String arg1) throws Throwable {
		AdminScheduleClassPageObject.verifysectionerrormsg(arg1);
	}

	@Then("^verify The subject error message as \"([^\"]*)\"$")
	public void verify_The_subject_error_message_as(String arg1) throws Throwable {
		AdminScheduleClassPageObject.verifysubjecterrormsg(arg1);
	}
	
	@Then("^verify the error message as \"([^\"]*)\"$")
	public void verify_the_error_message_as(String arg1) throws Throwable {
		AdminScheduleClassPageObject.verifyerrormsgforexisting(arg1);
	}
	
	@When("^User click on user profile$")
	public void User_click_on_user_profile() throws Throwable {
		AdminScheduleClassPageObject.clickonuserprofile();
	}
	
	
	@When("^User log out from the appication$")
	public void user_log_out_from_the_appication() throws Throwable {
		AdminScheduleClassPageObject.clickonlogout();
	}

	@When("^User clicks on My School tab$")
	public void user_clicks_on_My_School_tab() throws Throwable {
		AdminScheduleClassPageObject.clickOnMySchool();
	}

	@Then("^verify the class \"([^\"]*)\" schedule by admin is visible to the student$")
	public void verify_the_class_schedule_by_admin_is_visible_to_the_student(String arg1) throws Throwable {
		AdminScheduleClassPageObject.verifyclass(arg1);
	}

	@Then("^click on Session link$")
	public void click_on_Session_link() throws Throwable {
		AdminScheduleClassPageObject.clickOnSessionlink();
	}

	@Then("^session link should be open in new tab$")
	public void session_link_should_be_open_in_new_tab() throws Throwable {
		AdminScheduleClassPageObject.openSessionlink();
	}






}
