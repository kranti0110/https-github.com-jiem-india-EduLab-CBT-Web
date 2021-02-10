package oneup.stepdef;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import actions.ElementActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.AdminLandingPageObject;
import oneup.pages.ProductKeyPageObject;
import oneup.pages.UserManagobject;



public class UserManagStepDef {
	
	public static By status_box_xpath = By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[2]");
	public static By inactive_xpath = By.xpath("//span[text()='Inactive']");
	
	// Scenario 1	

		@When("^User navigates to User page$")
			public void user_navigates_to_User_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			AdminLandingPageObject.navigate_user();
	}
	
		@Given("User is on admin home page and clicks on Master data")
		public void User_is_on_admin_home_page_and_clicks_on_Master_data() {
			System.out.println("Inside scenario given");
			UserManagobject.clickMasterData();
		}
		
		@And("clicks on User Management")
		public void clicks_on_User_Management() throws Throwable {
			UserManagobject.clickUserManagement();
		}
		
		@Then("user should land to user management page")
		public void user_should_land_to_user_management_page() throws Throwable {
			System.out.println("user should land to user management page");
		}
		
		@And("click record box")
		public void click_record_box() throws Throwable {
			UserManagobject.clickRecordBox();
			Thread.sleep(5000);
			
		}
		
		@Then("user should able to select record value")
		public void user_should_able_to_select_record_value() throws Throwable {
			UserManagobject.clickRecordValue();
			Thread.sleep(5000);
		}

		// Scenario 2
		
		@Given("User is on user management page and click for advance search")
		public void User_is_on_user_management_page_and_click_for_advance_search() throws Throwable {
			UserManagobject.clickdropdown();
		}
		
		@And("Clicks on first name and enter value")
		public void clicks_on_first_name_and_enter_value() throws Throwable {
			UserManagobject.enterfirstname("Prakhar");  
		
		}
		
		@And("click on search button")
		public void click_on_search_button() throws Throwable {
			
			UserManagobject.clicksearchbtn();
		}
		
		// scenario 3rd
		
		@And("Clicks on last name and enter value")
		public void Clicks_on_last_name_and_enter_value() throws Throwable {
			UserManagobject.enterlastname("Automation");
			
		}
		
//		@And("Clicks on email and enter value")
//		public void Clicks_on_email_and_enter_value() throws Throwable {
//			UserManagobject.entermailid("amruta.bisain1+10@gmail.com");
//		}
		
		@And("select role")
		public void select_role() throws Throwable {
			UserManagobject.selectrole();
			
		}
		
		@And("select school name")
		public void select_school_name() throws Throwable {
			UserManagobject.selectschoolname();
		}
// Glue code of add new user related scenarios
		String expurl1 = "https://oneuptest.net/#/user-management";
//		String actualurl = ElementActions.getDriver().getCurrentUrl();
		@Given("Admin is on user management tab")
		public void Admin_is_on_user_management_tab() throws Throwable{
			UserManagobject.verifies_page_url(expurl1, ElementActions.getDriver().getCurrentUrl());
		}
		
		@When("Clicks on Add new user button")
		public void Clicks_on_Add_new_user_button() {
			UserManagobject.click_add_new_user();
		}
		
		String expurl = "https://oneuptest.net/#/create-user";
		@Then("Admin should land on Add new user page")
		public void Admin_should_land_on_Add_new_user_page() {
			UserManagobject.verifies_page_url(expurl, ElementActions.getDriver().getCurrentUrl());
		}
		
		@And("Admin clicks on first name and enter value")
		public void Admin_clicks_on_first_name_and_enter_value() {
			String firstnamevalue = "Prakhar";
			UserManagobject.enterfirstname(firstnamevalue);
		}
		
		@Then("match text of first name element")
		public void match_text_of_first_name_element() {
			UserManagobject.text_assertion("Prakhar", UserManagobject.fst_name_xpath,  "Advance search for first name is not working");
		}
		
		@Then("match text of last name element")
		public void match_text_of_last_name_element() {
			UserManagobject.text_assertion("Automation", UserManagobject.lst_name_xpath,  "Advance search for last name is not working");
		}
		
		
		@Then("match the text of first email locator")
		public void match_the_text_of_first_email_locator() {
			UserManagobject.text_assertion( "nikita.shinde+3@jiem.in", UserManagobject.email_name_xpath, "Advance search for email is not working");
		}
		
		
		@Then("match the role value")
		public void match_the_role_value() {
			UserManagobject.text_assertion("STUDENT", UserManagobject.role_value_xpath, "Advance search for role value is not working");
		}
		
		
		@Then("match the school name value")
		public void match_the_school_name_value() {
			UserManagobject.text_assertion("HHCP" , UserManagobject.school_value_xpath, "Advance search for school value is not working");
		}
		
		
		@And("In advance search selecting school")
		public static void In_advance_search_selecting_school() {
			UserManagobject.advance_search_school_name();
		}
		
		
		
		@And("Admin clicks on last name and enter value")
		public void Admin_clicks_on_last_name_and_enter_value() {
			String lastnamevalue = "Automation";
			UserManagobject.enterlastname(lastnamevalue);
		}

		@Then("^Admin clicks on email and enter value \"([^\"]*)\"$")
		public void admin_clicks_on_email_and_enter_value(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			UserManagobject.entermailid(arg1);
		  
		}
		
		@And("clicks on save button")
		public void clicks_on_save_button() throws Throwable {
			UserManagobject.clicksave();
			Thread.sleep(10000);

		}
		
		@And("Add some notes")
		public void Add_some_notes() {
			UserManagobject.enternotetext("Text added by automated script");
		}
		
		@When("^Admin search text \"([^\"]*)\"$")
		public void admin_search_text(String arg1) throws Throwable {
		   UserManagobject.enter_in_search_box(arg1);
		   Thread.sleep(2000);
		   System.out.println("First name prakhar found successfully");
		   assertEquals(ElementActions.getText(UserManagobject.fst_name_xpath),"Prakhar");	
	
		   Thread.sleep(2000);
		   
		}
		
		@And("clicks on user list")
		public void clicks_on_user_list() {
			UserManagobject.click_user_list_btn();
			
		}
		
		String expurl2 = "https://oneuptest.net/#/show-user";
		@Then("Admin lands in show user page")
		public void Admin_lands_in_show_user_page() {
			UserManagobject.verifies_page_url(expurl2, ElementActions.getDriver().getCurrentUrl());
			
		}
		
		@And("click on delete icon")
		public void click_on_delete_icon() throws InterruptedException {
			UserManagobject.click_del_icon();
			Thread.sleep(3000);
		}
		
		@And("Admin clicks on email and enter prefix value")
		public void Admin_clicks_on_email_and_enter_prefix_value() throws Throwable {
			UserManagobject.time_stamp("abhinavpandey104+");
//			System.out.println(Email);
			Thread.sleep(5000);
		}
		
		
//		@And("enter new value in first name")
//		public void enter_new_value_in_first_name(String arg1) throws Throwable {
//			UserManagobject.enterfirstname(arg1);
//		}
		
		
		@And("^enter new value in first name \"([^\"]*)\"$")
		public void enter_new_value_in_first_name(String arg1) throws Throwable {
			ElementActions.sendKeys(UserManagobject.Firstname, Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			UserManagobject.enterfirstname(arg1);
			Thread.sleep(5000);
		   
		}
		
		@Then("^enter new value in last name \"([^\"]*)\"$")
		public void enter_new_value_in_last_name(String arg1) throws Throwable {
			ElementActions.sendKeys(UserManagobject.Lastname, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			UserManagobject.enterlastname(arg1);
		}

		

		@Then("^enter new value in notes \"([^\"]*)\"$")
		public void enter_new_value_in_notes(String arg1) throws Throwable {
			ElementActions.sendKeys(UserManagobject.notebox, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			UserManagobject.enternotetext(arg1);
		}
		
		@And("change the status from active to inactive")
		public void change_the_status_from_active_to_inactive()
		{
			UserManagobject.select_dropdown(status_box_xpath, inactive_xpath);
		}
		
		@Then("Match displaying record msz for values")
		public void Match_displaying_record_msz_for_values() {
			ProductKeyPageObject.verifies_partial_txt_record(ProductKeyPageObject.displayrecordpartialtxt, "Displaying 1-20 of");
		}
}
		

