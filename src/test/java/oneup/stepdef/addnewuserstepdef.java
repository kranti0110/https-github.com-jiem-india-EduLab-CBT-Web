package oneup.stepdef;

import java.util.List;

import actions.ElementActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import oneup.pages.UserManagobject;
import cucumber.api.DataTable;


public class addnewuserstepdef  {

	
// locators
	


	@Then("^admin fills test data$")
	public void admin_fills_test_data(DataTable fieldvalues) throws Throwable {
		List<List<String>> data = fieldvalues.raw();
		UserManagobject.new_user_data(data.get(0).get(0), data.get(0).get(1), data.get(0).get(2));
//		UserManagobject.new_user_data(data.get(1).get(0), data.get(1).get(1), data.get(1).get(2), data.get(1).get(3));
		Thread.sleep(5000);
	}
	
	@Then("admin should land on show user page")
	public void admin_should_land_on_show_user_page() {
		UserManagobject.verifies_page_url("https://oneuptest.net/#/show-user", ElementActions.getDriver().getCurrentUrl());
	}
	
	@Then("admin should be remain on create user page")
	public void admin_should_be_remain_on_create_user_page() {
		UserManagobject.verifies_page_url("https://oneuptest.net/#/create-user", ElementActions.getDriver().getCurrentUrl());
		
	}
	
	@Then("Admin should remain in edit user page")
	public void Admin_should_remain_in_edit_user_page() {
		UserManagobject.verifies_page_url("https://oneuptest.net/#/edit-user", ElementActions.getDriver().getCurrentUrl());
		
	}
	
	@And("clicks on edit icon")
	public void clicks_on_edit_icon() {	
		UserManagobject.click_edit_icon();	
	}
	
	@Then("admin should be on edit user page")
	public void admin_should_be_on_edit_user_page() {
		UserManagobject.verifies_page_url(ElementActions.getDriver().getCurrentUrl(), "https://oneuptest.net/#/edit-user");
	}
	
	@And("check school name is editable")
	public void check_school_name_is_editable() {
		UserManagobject.is_ele_enable(UserManagobject.edit_school_txt_box);
	}
	
	@And("check email field is editable")
	public void check_email_field_is_editable() {
		
		UserManagobject.is_ele_enable(UserManagobject.edit_email_txt_box);
	}
	
	

}
