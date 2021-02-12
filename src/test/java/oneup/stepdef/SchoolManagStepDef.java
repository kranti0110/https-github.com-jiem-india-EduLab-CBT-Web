package oneup.stepdef;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.By;
import actions.ElementActions;
import cucumber.api.java.en.*;
import oneup.pages.AdminLandingPageObject;
import oneup.pages.BasicMethod;

public class SchoolManagStepDef {
	
	public static By add_new_schl_save_xpath = By.xpath("//button[@class='btn btn-success']");
	public static By schl_name_xpath =By.xpath("//input[@name='school name']");
	public static By schl_website_xpath =By.xpath("//input[@name='school website']");
	public static By schl_address_xpath =By.xpath("//textarea[@name='address']");
	
	public static By country_box_xpath = By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[1]");
	public static By country_value = By.xpath("//a//span[text()='India']");
	
	public static By state_box_xpath = By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[2]");
	public static By state_value = By.xpath("//span[text()='Uttarakhand']");
	
	public static By zone_box_xpath = By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[3]");
	public static By zone_value = By.xpath("//span[text()='North']");
	
	public static By city_box_xpath = By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[4]");
	public static By city_value = By.xpath("//a//span[text()='Dehradun']");
	
	public static By pincode_xpath =By.xpath("//input[@name='pin code']");
	
	public static By contact_person_xpath =By.xpath("//input[@name='Contact person']");
	public static By email_xpath = By.xpath("//input[@name='Contact Email']");
	public static By contact_no_xpath = By.xpath("(//input[@type='tel'])[1]");
	
	public static By contact_email_xpath = By.xpath("//input[@name='Contact person']");
	public static By fax_xpath = By.xpath("//input[@name='fax number']");
	
	public static By sales_contact_name_xpath = By.xpath("//input[@name='salesContactName']");
	public static By sales_contact_no_xpath = By.xpath("(//input[@type='tel'])[2]");
	
	public static By notes_xpath = By.xpath("//textarea[@formcontrolname='notes']");
	public static By edit_btn = By.xpath("//button[@class='btn btn-success'][2]");
	public static By scl_code = By.xpath("(//td)[2]");
	
	// Locators for advance search fields
	
	public static By advn_schl_code = By.id("schoolCode");
	public static By advn_schl_name = By.id("schoolName");
	//Below are the step defpublic static By schl_name_xpath =By.xpath("//input[@name='school name']");

	
	@When("^User navigates to School Management$")
	public void user_navigates_to_School_Management() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    AdminLandingPageObject.navigate_school_management();
	}

	@Given("^Admin should be in school management tab$")
	public void admin_should_be_in_school_management_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual_url_string = "https://oneuptest.net/#/school-management";
	    BasicMethod.verifies_url(actual_url_string);
	}

	@When("^Clicks on Add New School$")
	public void clicks_on_Add_New_School() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.click_element(add_new_schl_save_xpath);
	}

	@Then("^Admin should land on add new school page$")
	public void admin_should_land_on_add_new_school_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual_url_string = "https://oneuptest.net/#/add-school";
	    BasicMethod.verifies_url(actual_url_string);
	}

	@Then("^Enter School name \"([^\"]*)\"$")
	public void enter_School_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ElementActions.getDriver().findElement(schl_name_xpath).clear();
	    BasicMethod.send_keys(schl_name_xpath, arg1);
	}

	@Then("^Enter school website \"([^\"]*)\"$")
	public void enter_school_website(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.send_keys(schl_website_xpath, arg1);
	}

	@Then("^Enter school address \"([^\"]*)\"$")
	public void enter_school_address(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    String maxlength =ElementActions.getDriver().findElement(schl_address_xpath).getAttribute("maxlength");
	    
		if (maxlength.equals("160")) {
			System.out.println("Max character limit is 160");
			BasicMethod.send_keys(schl_address_xpath, arg1);  	
	    }
		
		else {
			System.out.println("In address field maximum character limit should be 160");
			
		}	
		
	}

	@Then("^Enter Country$")
	public void enter_Country() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.select_dropdown(country_box_xpath, country_value);
	}

	@Then("^Enter State$")
	public void enter_State() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.select_dropdown(state_box_xpath, state_value);
	}

	@Then("^Zone$")
	public void zone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.select_dropdown(zone_box_xpath, zone_value);
	}

	@Then("^City$")
	public void city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.select_dropdown(city_box_xpath, city_value);
	}

	@Then("^Pin Code \"([^\"]*)\"$")
	public void pin_Code(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.send_keys(pincode_xpath, arg1);
	}

	@Then("^Contact Person \"([^\"]*)\"$")
	public void contact_Person(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.send_keys(contact_person_xpath, arg1);
	}

	@Then("^Contact number \"([^\"]*)\"$")
	public void contact_number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String maxlength =ElementActions.getDriver().findElement(contact_no_xpath).getAttribute("maxlength");
		if (maxlength.equals("10")) {
			System.out.println("Max character limit is 10");
			BasicMethod.send_keys(contact_no_xpath, arg1); 	
	    }
		
		else {
			System.out.println("In contact number field maximum character limit is " +maxlength+ " but it should be 10");
			BasicMethod.send_keys(contact_no_xpath, arg1);
			
		}
	    
	}

	@Then("^contact mail id \"([^\"]*)\"$")
	public void contact_mail_id(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.send_keys(email_xpath, arg1);
	}

	@Then("^Fax Number \"([^\"]*)\"$")
	public void fax_Number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.send_keys(fax_xpath, arg1);
	}

	@Then("^Sales conatact name \"([^\"]*)\"$")
	public void sales_conatact_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.send_keys(sales_contact_name_xpath, arg1);
	}

	@Then("^Sales contact number \"([^\"]*)\"$")
	public void sales_contact_number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    String maxlength =ElementActions.getDriver().findElement(sales_contact_no_xpath).getAttribute("maxlength");
		if (maxlength.equals("10")) {
			System.out.println("Max character limit is 10");
			BasicMethod.send_keys(sales_contact_no_xpath, arg1); 	
	    }
		
		else {
			System.out.println("In sales contact number field maximum character limit is " +maxlength+ " but it should be 10");
			BasicMethod.send_keys(sales_contact_no_xpath, arg1);
			
		}
	    
	}

	@And("^Notes \"([^\"]*)\"$")
	public void notes(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasicMethod.send_keys(notes_xpath, arg1);
	}
	
	
	
	@Then("Admin should be on edit school page")
		public void Admin_should_be_on_edit_school_page() throws Throwable{
			String curnt_url = ElementActions.getDriver().getCurrentUrl();
			assertTrue(curnt_url.contains("https://oneuptest.net/#/edit-school"), "URL didn't matched");	
	}

	@When("clicks at school management edit btn")
	public void clicks_at_school_management_edit_btn() throws Throwable{
		ElementActions.click(edit_btn);
	}
	
	
	@Given("^Enter school code \"([^\"]*)\"$")
	public void enter_school_code(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ElementActions.sendKeys(advn_schl_code, arg1);
	}

	@Given("^Enter school name \"([^\"]*)\"$")
	public void enter_school_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ElementActions.sendKeys(advn_schl_name, arg1);
	}

	@Then("^Match the school code$")
	public void match_the_school_code() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000); 
	    assertEquals("AU05", ElementActions.getText(scl_code), "School code did not matched");
	    
	    
	}
	
	
	@Then("^In school management match the school name value$")
	public void In_school_management_match_the_school_name_value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			
			By test = By.xpath("(//td[3])[1]");
			assertEquals("Prakhar Automation", ElementActions.getText(test), "School Name did not matched");
			
		}
		
		

	
}



