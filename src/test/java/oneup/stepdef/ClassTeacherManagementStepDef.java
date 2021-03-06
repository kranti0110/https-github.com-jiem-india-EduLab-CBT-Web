package oneup.stepdef;
import java.util.Map;

import org.openqa.selenium.By;

import java.util.List;
//import com.sun.tools.javac.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import oneup.pages.ClassTeacherManagementPageObject;

public class ClassTeacherManagementStepDef {
	public static By School_Name_xpath = By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[1]");
	public static By School_value = By.xpath("(//span[text()='HH01 - HHCP'])[1]");
	public static By teacher_name_xpath = By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[2]");
	public static By teacher_value = By.xpath("(//span[text()='sam ubhad'])[1]");
	public static By grade_xpath = By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[3]");
	public static By grade_value = By.xpath("(//span[text()='6'])[1]");
	public static By section_xpath = By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[4]");
	public static By section_value = By.xpath("(//span[text()='A'])[1]");

	@When("^User navigates to Master Data$")
	public void user_navigates_to_Master_Data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ClassTeacherManagementPageObject.navigate_MasterData();
	}
	
	@When("^User navigates to class teacher management page$")
	public void user_navigates_to_class_teacher_management_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ClassTeacherManagementPageObject.navigate_classTeacherManagementpage();
	}

	@When("^User clicks CREATE CLASS TEACHER button$")
	public void user_clicks_CREATE_CLASS_TEACHER_button() throws Throwable {
		ClassTeacherManagementPageObject.clicks_CREATECLASSTEACHER();
	}
	
	@Then("^check the pagetitle as \"([^\"]*)\"$")
	public void check_the_pagetitle_as(String arg1) throws Throwable {
		ClassTeacherManagementPageObject.checkPagetitle(arg1);
	}

	@When("^User clicks CREATE CLASS TEACHER$")
	public void user_clicks_CREATE_CLASS_TEACHER() throws Throwable {
		ClassTeacherManagementPageObject.clicks_CREATECLASSTEACHER();
	
	}
	
//  @Then("^User enters the valid data$")
//	public void user_enters_the_valid_data(DataTable fieldvalues) throws Throwable {
//		List<List<String>> data = fieldvalues.raw();
//		ClassTeacherManagementPageObject.enterData(data.get(1).get(0), data.get(1).get(1), data.get(1).get(2), data.get(1).get(3));
//	
//	}
	
	@Then("^User should be on Create Class Teacher page$")
	public void user_should_be_on_Create_Class_Teacher_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ClassTeacherManagementPageObject.verifyCreateClassTeacherPage();
	}
	
	@Then("^User enters the valid data$")
	public void user_enters_the_valid_data()throws Throwable {
		
	}
	
	@And("Select school name from dropdown")
	public void Select_school_name_from_dropdown()throws Throwable {
		ClassTeacherManagementPageObject.select_dropdown(School_Name_xpath, School_value);
	}
	
	@And("Select teacher name from dropdown")
	public void Select_teacher_name_from_dropdown()throws Throwable {
		ClassTeacherManagementPageObject.select_dropdown(teacher_name_xpath, teacher_value);
	}
	
	@And("Select grade from dropdown")
	public void Select_grade_from_dropdown()throws Throwable {
		ClassTeacherManagementPageObject.select_dropdown(grade_xpath, grade_value);
	}
	
	@And("Select section from dropdown")
	public void Select_section_from_dropdown()throws Throwable {
		ClassTeacherManagementPageObject.select_dropdown(section_xpath, section_value);
	}
	
	@Then("^click on Save$")
	public void click_on_Save() throws Throwable {
		ClassTeacherManagementPageObject.clickOnSave();
	}

	
	@Then("^the class teacher is saved succefully  \"([^\"]*)\"$")
	public void the_class_teacher_is_saved_succefully(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("the_Class_Teacher_is_saved_succefully" );
	}

	@When("^user clicks on advance search$")
	public void user_clicks_on_advance_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ClassTeacherManagementPageObject.clicksonadvancesearch();
	}

	@Then("^User gets the search record$")
	public void user_gets_the_search_record() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ClassTeacherManagementPageObject.getsearchrecord();
	}
	
	@Then("^click on close button to check all records$")
	public void click_on_close_button_to_check_all_records() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ClassTeacherManagementPageObject.verifyclosesearchbutton();
	    
	}
	
	@Then("^verify all records are displayed$")
	public void verify_all_records_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ClassTeacherManagementPageObject.verifyallrecords();
	    
	}
	
	@When("^click on cancel button$")
	public void click_on_cancel_button() throws Throwable {
	   ClassTeacherManagementPageObject.VerifyCancleButton();
	    
	}

	@Then("^user should nevigate to class teacher management page$")
	public void user_should_nevigate_to_class_teacher_management_page() throws Throwable {
		ClassTeacherManagementPageObject.NevigatetoClassTeacherMngPage();
	    
	    
	}

	@Then("^Verify the record per page$")
	public void verify_the_record_per_page() throws Throwable {
		ClassTeacherManagementPageObject.VerifyrecordPerPage();
	    
	}
	
	@Then("^User clicks on Save button without selecting any data$")
	public void user_clicks_on_Save_button_without_selecting_any_data() throws Throwable {
		ClassTeacherManagementPageObject.clickOnSave();
	    
	}

	@Then("^Verify create class teacher mandatory messages$")
	public void verify_create_class_teacher_mandatory_messages() throws Throwable {
		ClassTeacherManagementPageObject.VerifyMandatoryMessages();
	   
	}
	
	@When("^User clicks on class teacher name link$")
	public void user_clicks_on_class_teacher_name_link() throws Throwable {
		ClassTeacherManagementPageObject.clickOnClassTeacherNameLink();
	   
	}

	@Then("^Verify the page header as \"([^\"]*)\"$")
	public void verify_the_page_header_as(String arg1) throws Throwable {
		ClassTeacherManagementPageObject.VerifyPageHeader(arg1);
	}
	
	@When("^User clicks Class Teacher List button$")
	public void user_clicks_Class_Teacher_List_button() throws Throwable {
		ClassTeacherManagementPageObject.clickOnClassTeacherListButton();
	}

	@Then("^User nevigates to Class teacher mangement scrren$")
	public void user_nevigates_to_Class_teacher_mangement_scrren() throws Throwable {
		ClassTeacherManagementPageObject.NevigateToClassTeacherMangScreen();
	}
	
	@When("^User clicks on edit icon on class teacher mng page$")
	public void user_clicks_on_edit_icon_on_class_teacher_mng_page() throws Throwable {
		ClassTeacherManagementPageObject.clickOnEdit();
	    
	}

	@Then("^Validate page header as \"([^\"]*)\"$")
	public void Validate_page_header_as(String arg1) throws Throwable {
		ClassTeacherManagementPageObject.ValidatePageHeader(arg1);
	}
	
	@Then("^Click on Update button$")
	public void click_on_Update_button() throws Throwable {
		ClassTeacherManagementPageObject.ClickUpdatebtn();
	    
	}
	
	@Then("^The class teacher data gets updated succefully$")
	public void the_class_teacher_data_gets_updated_succefully() throws Throwable {
		System.out.print("the_Class_Teacher_is_updated_succefully" );
	    
	}
	
	@When("^User is on second page$")
	public void user_is_on_second_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ClassTeacherManagementPageObject.verifysecondpage();
	}
	
	
	@Then("^Click on next page link$")
	public void click_on_next_page_link() throws Throwable {
		ClassTeacherManagementPageObject.Nextpagelink();
	}
	
	@Then("^verify second page records$")
	public void verify_second_page_records() throws Throwable {
		ClassTeacherManagementPageObject.verifysecondpagerecords();
	}

	@Then("^verify records on next page$")
	public void verify_records_on_next_page() throws Throwable {
		ClassTeacherManagementPageObject.verifyRecordsonNextpage();
	}

	@Then("^Click on Previous page link$")
	public void click_on_Previous_page_link() throws Throwable {
		ClassTeacherManagementPageObject.PreviousPageLink();
	}

	@Then("^Verify records on previous page$")
	public void verify_records_per_page() throws Throwable {
		ClassTeacherManagementPageObject.verifyRecordsonPreviousPage();
	}
	
	@When("^User clicks on delete icon$")
	public void user_clicks_on_delete_icon() throws Throwable {
		ClassTeacherManagementPageObject.clickOnDeletebtn();
	}

	@Then("^verify delete confirmation message as \"([^\"]*)\"$")
	public void verify_delete_confirmation_message_as(String arg1) throws Throwable {
		ClassTeacherManagementPageObject.verifyDeleteCongMsg(arg1);
	   
	}

	@Then("^Click on cancel$")
	public void click_on_cancel() throws Throwable {
		ClassTeacherManagementPageObject.clickCancel();
	}

	@Then("^Nevigate to Class Teacher Mng Page$")
	public void nevigate_to_Class_Teacher_Mng_Page() throws Throwable {
		ClassTeacherManagementPageObject.NevigatetoClassTeacherMngPage();
	}
	
	@Then("^Click on Delete$")
	public void click_on_Delete() throws Throwable {
		ClassTeacherManagementPageObject.clickOnDelete();
	}

	@Then("^Record should get deleted$")
	public void record_should_get_deleted() throws Throwable {
		System.out.print("The_Record_should_get_deleted" );
	
	}





	
	
}
