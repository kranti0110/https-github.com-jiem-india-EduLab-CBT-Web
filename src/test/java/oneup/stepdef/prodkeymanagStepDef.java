package oneup.stepdef;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import actions.ElementActions;
import cucumber.api.java.en.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.AdminLandingPageObject;
import oneup.pages.BasicMethod;
import oneup.pages.ProductKeyPageObject;
import oneup.pages.UserManagobject;

public class prodkeymanagStepDef {
	
	// Defining locators
	
	public static By grade_dropbox_value = By.xpath("(//a[@class='ngx-select__item dropdown-item'])[1]");
	public static By prod_key_value = By.id("schoolproductkey");
	String fetched_prod_key;
	// Publish Icon
	public static By publish_icon = By.xpath("//span[@title='Publish Product Key']");
	
	
	// Defining Methods
	
	@When("Admin navigates to Product key management")
	public static void Admin_navigates_to_Product_key_management() throws Throwable {
		AdminLandingPageObject.navigate_prod_key_manag();
		Thread.sleep(3000);
	}
	
	
	@Given("^Admin is on Product key management tab$")
	public void admin_is_on_Product_key_management_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expurl = "https://oneuptest.net/#/product/list-product";
	 
	   UserManagobject.verifies_page_url(expurl, ElementActions.getDriver().getCurrentUrl());
	}

	@When("^Clicks on Add Product Key$")
	public void clicks_on_Add_Product_Key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UserManagobject.click_add_new_user();
		Thread.sleep(3000);
	    
	}

	@Then("^Admin should land on create Product Key page$")
	public void admin_should_land_on_create_Product_Key_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expurl = "https://oneuptest.net/#/product/create-product";
		UserManagobject.verifies_page_url(expurl, ElementActions.getDriver().getCurrentUrl());
	    
	}

	@Then("^Selects Product Type$")
	public void selects_Product_Type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UserManagobject.select_dropdown(ProductKeyPageObject.product_type_dropbox, ProductKeyPageObject.product_type_dropbox_value);
	}

	@Then("^Selects School Name$")
	public void selects_School_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UserManagobject.select_dropdown(UserManagobject.School_name, UserManagobject.School_name_value);
	}

	@Then("^Selects Grade$")
	public void selects_Grade() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UserManagobject.select_dropdown(ProductKeyPageObject.grade_dropbox, ProductKeyPageObject.grade_dropbox_value);
	}

	@Then("^Selects Subject$")
	public void selects_Subject() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Selecting subject");
		UserManagobject.select_dropdown(ProductKeyPageObject.subject_dropbox, ProductKeyPageObject.subject_dropbox_value);
	    
	}

	@Then("^Start Date$")
	public void start_Date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Selecting start date");
		ProductKeyPageObject.select_calendar_date(ProductKeyPageObject.start_date_box, ProductKeyPageObject.date_today, ProductKeyPageObject.tick_date1);  
	
	}

	@Then("^To Date$")
	public void to_Date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ProductKeyPageObject.select_calendar_date(ProductKeyPageObject.to_date_box, ProductKeyPageObject.date_next_day, ProductKeyPageObject.tick_date2); 
	}

	@Then("^No of Users \"([^\"]*)\"$")
	public void no_of_Users(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Clearing no of users");
		ElementActions.getDriver().findElement(ProductKeyPageObject.users).clear();
		ProductKeyPageObject.send_keys(ProductKeyPageObject.users, arg1);   
	}


	@Then("^Click save button$")
	public void click_save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ElementActions.click(UserManagobject.Submit);
		Thread.sleep(3000);
		
	   
	}

	@Then("^Admin is on show product page$")
	public void admin_is_on_show_product_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expurl = "https://oneuptest.net/#/product/show-product";
		UserManagobject.verifies_page_url(expurl, ElementActions.getDriver().getCurrentUrl());
	    
	}

	@Then("^clicks on edit$")
	public void clicks_on_edit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ProductKeyPageObject.click_element(ProductKeyPageObject.edit_btn_xpath);
	}

	@Then("^Admin should be on edit product page$")
	public void admin_should_be_on_edit_product_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expurl = "https://oneuptest.net/#/product/edit-product";
		UserManagobject.verifies_page_url(expurl, ElementActions.getDriver().getCurrentUrl());
	    
	}

	@Then("^Verify status should be disabled$")
	public void verify_status_should_be_disabled() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ProductKeyPageObject.is_ele_enable(ProductKeyPageObject.status_box_xpath);
	}

	@Then("^click update button$")
	public void click_update_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ProductKeyPageObject.click_element(UserManagobject.Submit);
		Thread.sleep(3000);
	    
	}

	@Then("^Match displaying record msz$")
	public void match_displaying_record_msz() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ProductKeyPageObject.verifies_partial_txt(ProductKeyPageObject.displayrecordpartialtxt);
	}

	@Given("^Click for Advance Search$")
	public void click_for_Advance_Search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UserManagobject.clickdropdown();
	   
	}

	@When("^Enters Product Key \"([^\"]*)\"$")
	public void enters_Product_Key(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ProductKeyPageObject.send_keys(ProductKeyPageObject.prod_key_id, arg1);
	    
	}

	@When("^Admin search text value \"([^\"]*)\"$")
	public void Admin_search_text_value(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   UserManagobject.enter_in_search_box(arg1);
		   Thread.sleep(3000);
	}

	@When("^Selects school name from dropdown$")
	public void selects_school_name_from_dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ProductKeyPageObject.select_dropdown(ProductKeyPageObject.subject_dropbox, ProductKeyPageObject.subject_dropbox_value);
		
	 
	}

	@Then("^Match the school name value$")
	public void match_the_school_name_value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		for (int i=1; i<4; i++) {
			
			
			By test = By.xpath("(//td[3])[%s]".formatted(i));
			System.out.println(test);
//			ProductKeyPageObject.get_text(test);
			assertEquals("HHCP", ElementActions.getText(test), "School Name did not matched");
			
		}
		
		
	  
	}

	@When("^Selects grade from dropdown$")
	public void selects_grade_from_dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ProductKeyPageObject.select_dropdown(ProductKeyPageObject.grade_dropbox, grade_dropbox_value);
		Thread.sleep(3000);
	}

	@Then("^Match the grade values$")
	public void match_the_grade_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		for (int i=1; i<4; i++) {
			
			By test = By.xpath("/html/body/app-root/app-product-management/app-list-product/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[%s]/td[4]".formatted(i));
			System.out.println(test);
			
			ProductKeyPageObject.get_text(test);
			assertEquals("4", ElementActions.getText(test), "Grade value did not matched");
			
		}
	}

	
	@And("Get product key")
	public void Get_prod_key() throws Throwable{
		fetched_prod_key = ElementActions.getText(prod_key_value);
		System.out.println("Fetched prod key value is " + fetched_prod_key);

	}
	
	@And("Admin search generated product key")
	public void Admin_search_generated_product_key() throws Throwable{
		UserManagobject.enter_in_search_box(fetched_prod_key);
	}
	
	@And("Publish the product")
	public void Publish_the_product() throws Throwable{
		BasicMethod.click_prod_key_publish_icon(publish_icon, UserManagobject.Submit);
		
	}
	
	@And("Click on product key list")
	public void Click_on_product_key_list() throws Throwable {
		ElementActions.click(UserManagobject.Submit);
	}
	
	
	
	

}
