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
	
	
	@Then("^class teachers are listed with page navigation options$")
	public void class_teachers_are_listed_with_page_navigation_options() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ClassTeacherManagementPageObject.verifyPageLink();
	}

	@Then("^check the link loads the list of class teachers$")
	public void check_the_link_loads_the_list_of_class_teachers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ClassTeacherManagementPageObject.navigatePage1();
	}
	
	@When("^User is on second page$")
	public void user_is_on_second_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ClassTeacherManagementPageObject.verifysecondpage();
	}
	
	@Then("^check  next and previous options works fine$")
	public void check_next_and_previous_options_works_fine() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ClassTeacherManagementPageObject.navigatePage1();
		ClassTeacherManagementPageObject.navigatePreviousPage();
	}

	
}
