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
import oneup.pages.AdminAddNewHomeworkPageObject;


public class AdminAddNewHomeworkStepDef {
	
	private By date_xpath=By.xpath("//input[@formcontrolname='date']");
	private By School_Name_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[1]");
	private By School_Name_value=By.xpath("//span[text()='OneUp School']");
	private By Grade_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[2]");
	private By Grade_value=By.xpath("//span[text()='7']");
	private By Section_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[3]");
	private By Section_value=By.xpath("//span[text()='A']");
	private By Subject_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[4]");
	private By Subject_value=By.xpath("//span[text()='Mathematics']");
	private By duedate_xpath=By.xpath("//input[@formcontrolname='homeworkDueDate']");
	private By EnableAnswerKeydate_xpath=By.xpath("//input[@placeholder='Enable answer key date']");
	public By file_selecter=By.id("customFile1");
	
	@When("^User navigates to Schedule homework menu$")
	public void user_navigates_to_Schedule_homework_menu() throws Throwable {
	    AdminAddNewHomeworkPageObject.nevigateToScheduleHW();
	}

	@When("^user clicks on Add New Homework button$")
	public void user_clicks_on_Add_New_Homework_button() throws Throwable {
		 AdminAddNewHomeworkPageObject.ClickOnAddNewHW();
	}

	@When("^User nevigates to Add new Homework Page$")
	public void user_nevigates_to_Add_new_Homework_Page() throws Throwable {
		 AdminAddNewHomeworkPageObject.NevigateToadddNewHWpage();
	}
	
	@Then("^verify the header as \"([^\"]*)\"$")
	public void verify_the_header_as(String arg1) throws Throwable {
		AdminAddNewHomeworkPageObject.verifyPageHeader(arg1);
	}
	
	@Then("^user selects HW date$")
	public void user_selects_HW_date() throws Throwable {
		// TODO Auto-generated method stub
				// Create object of SimpleDateFormat class and decide the format
				DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
									
				Date date = new Date();
							 
				// Now format the date
				String date1= dateFormat.format(date);
					 
				// Print the Date
				System.out.println("Schedule homework date is " +date1);
				ElementActions.sendKeys(date_xpath, date1);
			}
	

	@Then("^user select school name$")
	public void user_select_school_name() throws Throwable {
		AdminAddNewHomeworkPageObject.select_dropdown(School_Name_xpath, School_Name_value);
	}

	@Then("^user select grade$")
	public void user_select_grade() throws Throwable {
		AdminAddNewHomeworkPageObject.select_dropdown(Grade_xpath, Grade_value);
	}

	@Then("^user selects section$")
	public void user_selects_section() throws Throwable {
		AdminAddNewHomeworkPageObject.select_dropdown(Section_xpath, Section_value);
	}

	@Then("^user select subject$")
	public void user_select_subject() throws Throwable {
		AdminAddNewHomeworkPageObject.select_dropdown(Subject_xpath, Subject_value);
	}
	
	@Then("^select question worksheet$")
	public void select_question_worksheet() throws Throwable {
//		ElementActions.getElement(By.id("customFile1")).sendKeys("C:\\Downloads\\Oneup-2.0 feature list.xlsx");
		ElementActions.sendKeys(file_selecter, "C:\\Users\\prasad\\Downloads\\Oneup-2.0 feature list.xlsx");
	}

	@Then("^Attach Answer keys$")
	public void Attach_Answer_keys() throws Throwable {
		AdminAddNewHomeworkPageObject.SelectAnswerKeys();
	}

	@Then("^select Enable Answer Key Date$")
	public void select_Enable_Answer_Key_Date() throws Throwable {
		// TODO Auto-generated method stub
		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
							
		Date date = new Date();
					 
		// Now format the date
		String date1= dateFormat.format(date);
			 
		// Print the Date
		System.out.println("Enable Answer Key Date is " +date1);
		ElementActions.sendKeys(EnableAnswerKeydate_xpath, date1);
	}
	

	@Then("^select Homework Due Date$")
	public void select_Homework_Due_Date() throws Throwable {
        // TODO Auto-generated method stub
		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
							
		Date date = new Date();
					 
		// Now format the date
		String date1= dateFormat.format(date);
			 
		// Print the Date
		System.out.println("Homework Due Date is " +date1);
		ElementActions.sendKeys(duedate_xpath, date1);
	}

	@Then("^User enters the message and topic$")
	public void user_enters_the_message_and_topic(DataTable fieldvalues) throws Throwable {
		List<List<String>> data = fieldvalues.raw();
		AdminAddNewHomeworkPageObject.enterData(data.get(1).get(0), data.get(1).get(1));
	}

	@Then("^user click on save$")
	public void user_click_on_save() throws Throwable {
		AdminAddNewHomeworkPageObject.clickOnSave();
	}
	
	@Then("^verify the date error message as \"([^\"]*)\"$")
	public void verify_the_date_error_message_as(String arg1) throws Throwable {
		AdminAddNewHomeworkPageObject.verifydateerrormsg(arg1);
	}

	@Then("^verify the school error message as \"([^\"]*)\"$")
	public void verify_the_school_error_message_as(String arg1) throws Throwable {
		AdminAddNewHomeworkPageObject.verifyschoolerrormsg(arg1);
	}

	@Then("^verify the grade error message as \"([^\"]*)\"$")
	public void verify_the_grade_error_message_as(String arg1) throws Throwable {
		AdminAddNewHomeworkPageObject.verifygradeErrormsg(arg1);
	}

	@Then("^verify the topic error message as \"([^\"]*)\"$")
	public void verify_the_topic_error_message_as(String arg1) throws Throwable {
		AdminAddNewHomeworkPageObject.verifyTopicerrormsg(arg1);
	}

	@Then("^verify the homework due date error message as \"([^\"]*)\"$")
	public void verify_the_homework_due_date_error_message_as(String arg1) throws Throwable {
		AdminAddNewHomeworkPageObject.verifyHWduedateerrormsg(arg1);
	}
	
	@Then("^user click on Cancel$")
	public void user_click_on_Cancel() throws Throwable {
		AdminAddNewHomeworkPageObject.ClickOncancel();
	}

	@Then("^user nevigate to Schedule homework list page$")
	public void user_nevigate_to_Schedule_homework_list_page() throws Throwable {
		AdminAddNewHomeworkPageObject.NevigatetoHWListpage();
	}

	@When("^User clicks on advance search$")
	public void user_clicks_on_advance_search() throws Throwable {
		AdminAddNewHomeworkPageObject.clickOnAdvancesearch();
	}

	@Then("^click on search$")
	public void click_on_search() throws Throwable {
		AdminAddNewHomeworkPageObject.clickonSearch();
	}
	
	@Then("^verify the section error message as \"([^\"]*)\"$")
	public void verify_the_section_error_message_as(String arg1) throws Throwable {
		AdminAddNewHomeworkPageObject.verifySectionerrormsg(arg1);
	}
	
	@When("^user clicks on delete icon$")
	public void user_clicks_on_delete_icon() throws Throwable {
		AdminAddNewHomeworkPageObject.clickonDeleteicon();
	}

	@When("^user verifies the delete confirmation msg \"([^\"]*)\"$")
	public void user_verifies_the_delete_confirmation_msg(String arg1) throws Throwable {
		AdminAddNewHomeworkPageObject.verifydeleteconfmsg(arg1);
	}

	@Then("^User clicks on Cancel$")
	public void user_clicks_on_Cancel() throws Throwable {
		AdminAddNewHomeworkPageObject.clickOnCancelfordelete();
	}
	
	@Then("^User clicks on Delete$")
	public void user_clicks_on_Delete() throws Throwable {
		AdminAddNewHomeworkPageObject.clickOndelete();
	}
	
	@When("^verify the page header text as \"([^\"]*)\"$")
	public void verify_the_page_header_text_as(String arg1) throws Throwable {
		AdminAddNewHomeworkPageObject.pageheader(arg1);
	}




}
