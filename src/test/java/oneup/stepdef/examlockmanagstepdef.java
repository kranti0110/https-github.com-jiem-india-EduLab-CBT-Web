package oneup.stepdef;

import org.openqa.selenium.By;

import com.sun.xml.bind.v2.model.core.Element;

import actions.ElementActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.AdminLandingPageObject;
import oneup.pages.BasicMethod;

public class examlockmanagstepdef {
	
	// Defining locators
	private static By exam_lock_status = By.xpath("(//span[@class = 'fa fa-pencil'])[8]");
	
	public static By School_name = By.xpath("//ngx-select[@placeholder='-- Select School Name --']//div[@class = 'ngx-select dropdown']");
	public static By School_name_value = By.xpath("//span[text()='HH01 - HHCP']");
	
	public static By grade_dropbox = By.xpath("//ngx-select[@placeholder='-- Select Grade --']//div[@class = 'ngx-select dropdown']");
	public static By grade_dropbox_value = By.xpath("//span[text()='6']");
	
	
	private static By searchbtn = By.xpath("//button[@class='btn btn-success']");
	
	public static By edit_icon_maths_xpath = By.xpath("(//span[@data-toggle = 'tooltip'])[2]");
	public static By lock_btn_xpath = By.xpath("//button[@class='btn btn-danger']");
	
	public static By edit_icon_science_xpath = By.xpath("(//span[@data-toggle = 'tooltip'])[5]");
	public static By unlock_exam_xpath = By.xpath("//button[@class='btn btn-success']");
	
	
	//Locators of student login portal
	public static By my_test_xpath = By.xpath("(//a[@class='nav-link pointer text-uppercase'])[2]");
	public static By take_test_maths = By.id("Mathematics");
	public static By take_test_science = By.id("Science");
	public static By usr_name_xpath = By.xpath("(//input[@formcontrolname='loginEmail'])");
	public static By pass_xpath = By.xpath("(//input[@formcontrolname='loginPassword'])");
	
	//xpaths for logout from admin potal
	
	public static By logout_dropdown_xpath = By.xpath("//i[@class='fa fa-angle-down']");
	public static By logout_btn_xpath = By.xpath("//i[@class='fa fa-sign-out']");
	
	
	@When("^User navigates to Exam unlock management$")
	public void user_navigates_to_Exam_unlock_management() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AdminLandingPageObject.navigate_exam_unlock_management();
	   
	}

	@Given("^Admin is on exam unlock management tab$")
	public void admin_is_on_exam_unlock_management_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual_url_string = "https://oneuptest.net/#/examUnlock/list";
		BasicMethod.verifies_url(actual_url_string);
	  
	}

	@When("^Admin selects school from dropdown$")
	public void admin_selects_school_from_dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BasicMethod.select_dropdown(School_name, School_name_value);
	   
	}

	@When("^Admin selects grade from dropdown$")
	public void admin_selects_grade_from_dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BasicMethod.select_dropdown(grade_dropbox, grade_dropbox_value);
	}
	
	@Then ("click on exam unlock search buttons")
	public void click_on_search_buttons() throws Throwable{
		BasicMethod.click_element(searchbtn);
	}

	@When("^Click on edit icon to lock the maths exam$")
	public void click_on_edit_icon_to_lock_the_exam() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   String title_value = ElementActions.getDriver().findElement(edit_icon_maths_xpath).getAttribute("title");
	   BasicMethod.lock_exam(title_value, edit_icon_maths_xpath, lock_btn_xpath);   
	}
	
	@When("Click on edit icon to lock the science exam")
	public void Click_on_edit_icon_to_lock_the_science_exam() throws Throwable{
		   String title_value = ElementActions.getDriver().findElement(edit_icon_science_xpath).getAttribute("title");
		   BasicMethod.lock_exam(title_value, edit_icon_science_xpath, lock_btn_xpath);
	}
	
	@When("Click on edit icon to unlock the maths exam")
	public void Click_on_edit_icon_to_unlock_the_maths_exam() throws Throwable{
		   String title_value = ElementActions.getDriver().findElement(edit_icon_maths_xpath).getAttribute("title");
		   System.out.println("Unlocking Maths exam");
		   BasicMethod.unlock_exam(title_value, edit_icon_maths_xpath, unlock_exam_xpath);
		   Thread.sleep(3000);
		   
	}
	
	
	@When("Click on edit icon to unlock the science exam")
	public void Click_on_edit_icon_to_unlock_the_science_exam() throws Throwable{
		   String title_value = ElementActions.getDriver().findElement(edit_icon_science_xpath).getAttribute("title");
		   System.out.println("Unlocking science exam");
		   BasicMethod.unlock_exam(title_value, edit_icon_science_xpath, unlock_exam_xpath);
		   Thread.sleep(3000);
	}

	@Then("^Title should be unlock the exam$")
	public void title_should_be_unlock_the_exam() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Title should be unlock the exam");

	}

	@When("^Logout from admin portal$")
	public void logout_from_admin_portal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.select_dropdown(logout_dropdown_xpath, logout_btn_xpath);
	    Thread.sleep(3000);
	}

	@Then("^User should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual_url_string = "https://oneuptest.net/#/auth/login";
	    BasicMethod.verifies_url(actual_url_string);
	}

	@When("^User enters username \"([^\"]*)\"$")
	public void user_enters_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.send_keys(usr_name_xpath, arg1);
	}

	@When("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.send_keys(pass_xpath, arg1);
	}

	@Then("^User should be on My Study tab$")
	public void user_should_be_on_My_Study_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String actual_url_string = "https://oneuptest.net/#/student/study";
		BasicMethod.verifies_url(actual_url_string);
	}

	@Then("^Clicks on My Test tab$")
	public void clicks_on_My_Test_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.click_element(my_test_xpath);
	}

	@Then("^Check take Test button for Mathematics$")
	public void Check_take_Test_button_for_Mathematics() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside -- Take Test for Maths--");
	    BasicMethod.is_ele_displayed(take_test_maths);
	}

	@Then("^Check take Test button for Science$")
	public void Check_take_Test_button_for_Science() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside -- Take Test for Science--");
		BasicMethod.is_ele_displayed(take_test_science);
	   
	}


}
