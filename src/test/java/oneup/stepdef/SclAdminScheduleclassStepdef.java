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
import oneup.pages.SclAdminScheduleClassPageObject;

public class SclAdminScheduleclassStepdef {
	
		private By Start_Time_Hours_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[1]");
		private By Start_Time_Hours_value=By.xpath("//span[text()='12']");
		private By Start_Time_Minutes_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[2]");
		private By Start_Time_Minutes_value=By.xpath("//span[text()='30']");
		private By End_Time_Hours_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[3]");
		private By End_Time_Hours_value=By.xpath("//span[text()='14']");
		private By End_Time_Minutes_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[4]");
		private By End_Time_Minutes_value=By.xpath("//span[text()='00']");
		private By Grade_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[5]");
		private By Grade_value=By.xpath("//span[text()='7']");
		private By Section_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[6]");
		private By Section_value=By.xpath("//span[text()='A']");
		private By Subject_xpath=By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[7]");
		private By Subject_value=By.xpath("//span[text()='Science']");
		private By date_xpath=By.xpath("//input[@placeholder='Date']");
		
					
		@When("^User navigates to  Schedule Class$")
		public void user_navigates_to_Schedule_Class_menu() throws Throwable {
			SclAdminScheduleClassPageObject.navigatetoScheduleClass();
		    
		}

		@Then("^verify message as \"([^\"]*)\"$")
		public void verify_message_as(String arg1) throws Throwable {
			SclAdminScheduleClassPageObject.VerifyMessage(arg1);
		}
		
		@When("^user clicks on the add new class btn$")
		public void user_clicks_on_the_add_new_class_btn() throws Throwable {
			SclAdminScheduleClassPageObject.ClickOnAddNewClassbtn();
		}

		@When("^nevigates to the add new class page$")
		public void nevigates_to_the_add_new_class_page() throws Throwable {
			SclAdminScheduleClassPageObject.nevigatetoAddNewClassPage();
		}
		
		@Then("^user verify the page header as \"([^\"]*)\"$")
		public void user_verify_the_page_header_as(String arg1) throws Throwable {
			SclAdminScheduleClassPageObject.verifypageHeader(arg1);
		}

		@Then("^Select the date$")
		public void select_the_date() throws Throwable {
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
		
		
		
		@Then("^Select the Start Time Hours from dropdown$")
		public void Select_the_Start_Time_Hours_from_dropdown() throws Throwable {
			SclAdminScheduleClassPageObject.select_dropdown(Start_Time_Hours_xpath, Start_Time_Hours_value);
		    
		}

		@Then("^Select the Start Time Minutes from dropdown$")
		public void Select_the_Start_Time_Minutes_from_dropdown() throws Throwable {
			SclAdminScheduleClassPageObject.select_dropdown(Start_Time_Minutes_xpath, Start_Time_Minutes_value);
		   
		}

		@Then("^Select the End Time Hours from dropdown$")
		public void Select_the_End_Time_Hours_from_dropdown() throws Throwable {
			SclAdminScheduleClassPageObject.select_dropdown(End_Time_Hours_xpath, End_Time_Hours_value);
		    
		}

		@Then("^Select the End Time Minutes from dropdown$")
		public void Select_the_End_Time_Minutes_from_dropdown() throws Throwable {
			SclAdminScheduleClassPageObject.select_dropdown(End_Time_Minutes_xpath, End_Time_Minutes_value);
		    
		}

		@Then("^Select the Grade from dropdown$")
		public void Select_the_Grade_from_dropdown() throws Throwable {
			SclAdminScheduleClassPageObject.select_dropdown(Grade_xpath, Grade_value);
		    
		}

		@Then("^Select the Section from dropdown$")
		public void Select_the_Section_from_dropdown() throws Throwable {
			SclAdminScheduleClassPageObject.select_dropdown(Section_xpath, Section_value);
		    
		}

		@Then("^Select the Subject from dropdown$")
		public void Select_the_Subject_from_dropdown() throws Throwable {
			SclAdminScheduleClassPageObject.select_dropdown(Subject_xpath, Subject_value);
		   
		}

		@Then("^Click on any one of the Online Meeting Using option$")
		public void Click_on_any_one_of_the_Online_Meeting_Using_option() throws Throwable {
			SclAdminScheduleClassPageObject.clickOnOnlineMeetingUsingOption();
		}
		
		 @Then("^User enters the meeting url message and topic$")
	    	public void User_enters_the_meeting_url_message_and_topic(DataTable fieldvalues) throws Throwable {
			List<List<String>> data = fieldvalues.raw();
			SclAdminScheduleClassPageObject.enterData(data.get(1).get(0), data.get(1).get(1), data.get(1).get(2));
			
		}

		@Then("^Click on Save btn$")
		public void Click_on_Save_btn() throws Throwable {
			SclAdminScheduleClassPageObject.clickOnSave();
		    
		}
		
		@Then("^verify page header after Adding class$")
		public void verify_page_header_after_adding_class() throws Throwable {
			SclAdminScheduleClassPageObject.Verifyheaderafteraddingclass();
		}

		@Then("^New class is added succefully$")
		public void New_class_is_added_succefully() throws Throwable {
			System.out.print("The_New_class_is_added_succefully" );
		    
		}
		
		@Then("^Click on the cancel button$")
		public void Click_on_the_cancel_button() throws Throwable {
			SclAdminScheduleClassPageObject.clickOnCancel();
		}

		@Then("^User should nevigates to time table page$")
		public void User_should_nevigates_to_time_table_page() throws Throwable {
			SclAdminScheduleClassPageObject.nevigateToTimeTable();
		}
		
		@Then("^verify url error message as \"([^\"]*)\"$")
		public void verify_url_Error_message_as(String arg1) throws Throwable {
			SclAdminScheduleClassPageObject.verifyurlerrormsg(arg1);		
		}
		
		@Then("^verify section Error message as \"([^\"]*)\"$")
		public void verify_section_Error_message_as(String arg1) throws Throwable {
			SclAdminScheduleClassPageObject.verifysectionerrormsg(arg1);
		}

		@Then("^verify subject error message as \"([^\"]*)\"$")
		public void verify_subject_error_message_as(String arg1) throws Throwable {
			SclAdminScheduleClassPageObject.verifysubjecterrormsg(arg1);
		}
		
		@Then("^verify error message as \"([^\"]*)\"$")
		public void verify_error_message_as(String arg1) throws Throwable {
			SclAdminScheduleClassPageObject.verifyerrormsgforexisting(arg1);
		}
		
		



		
		

	}



