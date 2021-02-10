package oneup.pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import actions.ElementActions;

public class UserManagobject {
	
	//page locators
	
	public static By MasterData = By.xpath("//a[@aria-controls='mstersubmenu']");
	
	public static By UserManagement = By.xpath("//span[@class='fa fa-users mr-2']");
	
	private static By RecordBox = By.xpath("/html/body/app-root/app-user-management/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/select");
	
	private static By RecordValue = By.xpath("//option[@value = '20']");
	
	private static By Record_display_xpath = By.xpath("//div[@class='col-md-6 text-left']");

	private static By Email = By.xpath("//input[@id = 'loginEmail']");
		
	private static By Password = By.xpath("//input[@id = 'loginPassword']");
	
	public static By Submit = By.xpath("//button[@class = 'btn btn-success']");
	
	private static By Dropdownbtn = By.xpath("//button[@class='btn btn-default dropdown-toggle']");
	
	public static By Firstname = By.xpath("//input[@id = 'firstName']");
	
	public static By Lastname = By.xpath("//input[@formcontrolname='lastName']");
	
	private static By email = By.id("email");
	
	private static By Role = By.xpath("//ngx-select[@placeholder='-- Select Role --']//div[@class='ngx-select dropdown']");
	private static By Role_value_student = By.xpath("//li[@class='ngx-select__item-group'][1]");
	
	public static By School_name = By.xpath("//ngx-select[@placeholder='-- Select School Name --']//div[@class = 'ngx-select dropdown']");
	public static By School_name_value = By.xpath("//span[text()='HH01 - HHCP']");
	
	public static By school_name_advn_search = By.xpath("(//div[@class='ngx-select__toggle btn form-control'])[2]");
	private static By searchbtn = By.xpath("//button[@class='btn btn-primary']");
	
// Locators for scenarios add new user
	private static By addnewuser = By.xpath("//button[@data-target='#add-school-modal']");
	public static By notebox = By.id("notes");
	private static By savebtn = By.xpath("//button[@type='submit']");
	private static By search_txt_box = By.xpath("//input[@placeholder='Type to search...']");
	private static By first_name_elem = By.xpath("//td[@style='text-transform: capitalize;' and text() = 'Prakhar']");
	private static By user_list_btn = By.xpath("//button[@class='btn btn-success'][1]");
	private static By delete_icon = By.xpath("//span[@title='Delete User']");
	
	// Locators for search box scenarios
	private static By popup_delete_btn = By.xpath("//button[@class='btn btn-danger']");
	public static By fst_name_xpath = By.xpath("(//td)[2]");
	public static By lst_name_xpath = By.xpath("(//td)[3]");
	public static By email_name_xpath=By.xpath("(//td)[4]");
	public static By role_value_xpath=By.xpath("(//td)[5]");
	public static By school_value_xpath=By.xpath("(//td)[6]");
	
	
	//Locator if edit icon
	public static By edit_icon = By.xpath("(//span[@title='Edit User'])[1]");
	
	// Locators of edit details page
	
	public static By edit_school_txt_box = By.xpath("//input[@class='form-control']");
	public static By edit_email_txt_box = By.xpath("//input[@formcontrolname='email']");
	public static By usr_list_xpath = By.xpath("//button[@type='submit' ][1]");


	
	// Defining methods
	
	public static void clickMasterData() {
		ElementActions.click(MasterData);
//		MasterData.click();
	}
	
	public static void clickUserManagement() {
		ElementActions.click(UserManagement);
//		UserManagement.click();
	}
	
	public static void clickRecordBox() {
		ElementActions.click(RecordBox);
//		RecordBox.click();
	}
	
	public static void clickRecordValue() {
		ElementActions.click(RecordValue);
//		RecordValue.click();
	}
	
	//Methods for scenario 2nd
	public static void clickdropdown() {
		ElementActions.click(Dropdownbtn);
//		Dropdownbtn.click();
	}
	
	public static void enterfirstname(String firstnamevalue) {
//		ElementActions.sendKeys(Firstname, Keys.BACK_SPACE);
		ElementActions.sendKeys(Firstname, firstnamevalue);
	
	}
	
	public static void clicksearchbtn() {
		ElementActions.click(searchbtn);
//		searchbtn.click();
	}
	
	// Scenario 3
	
	public static void enterlastname(String lastnamevalue) {
		ElementActions.click(Lastname);
		ElementActions.sendKeys(Lastname, lastnamevalue);
	}
	
	public static void entermailid(String emailvalue) {
		ElementActions.sendKeys(email, emailvalue);
	}
	
	public static void selectrole() {
		ElementActions.click(Role);
		ElementActions.click(Role_value_student);
	}
	
	public static void selectschoolname() {
		
		boolean enabled = ElementActions.isElementEnabled(School_name);
		if (enabled == true) {
			ElementActions.click(School_name);
			ElementActions.click(School_name_value);
		}
		
		else {
			System.out.println("School name text box is not editable");
		}
	}
	
	public static void advance_search_school_name() {
		ElementActions.click(school_name_advn_search);
		ElementActions.click(School_name_value);
	}
		
	// Method to check element is enable or not
		
   public static void is_ele_enable(By locator_name) {
	   boolean is_enable = ElementActions.isElementEnabled(locator_name);
	   if (is_enable == true) {
		   System.out.println("Element is enabled");
	   }
	   
	   else {
		   System.out.println(locator_name +" Element is not enabled");
	   }
   }
	
	
	public static void enternotetext(String notemsz) {
		ElementActions.sendKeys(notebox, notemsz);
	}
	
	public static void clicksave() {
		ElementActions.click(savebtn);
		ElementActions.getDriver().getCurrentUrl();
	}
	
	public static void verifies_page_url(String expurl, String actualurl) {
		assertEquals(expurl, actualurl);
	}

	public static void click_add_new_user() {
		ElementActions.click(addnewuser);
	}
	
	public static void enter_in_search_box(String textboxvalue) {
		ElementActions.sendKeys(search_txt_box, textboxvalue);
		ElementActions.sendKeys(search_txt_box,Keys.ENTER);
	}
	
	public static void text_assertion(String actual_txt_value, By get_txt_ele_name,String assert_error_msz) {
		assertEquals(actual_txt_value, ElementActions.getText(get_txt_ele_name), assert_error_msz);
	}
	
	public static void click_user_list_btn() {
		ElementActions.click(user_list_btn);
	}
	
	public static void get_txt() {
		ElementActions.getText(first_name_elem);
	}
	
	public static void click_del_icon() throws InterruptedException {
		ElementActions.click(delete_icon);
		Thread.sleep(3000);
		ElementActions.click(popup_delete_btn);
	}
	
	public static void time_stamp(String emailprefix) {
		 // Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("MMddyyyyHHmmss");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 String useemail = emailprefix+date1+"@gmail.com";
		 ElementActions.sendKeys(email, useemail);
		
	}
	
	public static void get_display_record_text() {
		ElementActions.getText(Record_display_xpath);
	}
	
	public static void new_user_data(String firstname, String lastnamevalue, String noteboxtext) throws InterruptedException {
//		assertEquals(ElementActions.getText(Firstname), "First Name is required");
		ElementActions.sendKeys(Firstname, firstname);
		
//		assertEquals(ElementActions.getText(Lastname), "Last Name is required");
		ElementActions.sendKeys(Lastname, lastnamevalue);

		
		ElementActions.sendKeys(notebox, noteboxtext);

	}
	
	public static void select_dropdown(By drop_down_box, By drop_down_value) {
		ElementActions.click(drop_down_box);
		ElementActions.click(drop_down_value);
	}
	
	public static void click_edit_icon() {
		ElementActions.click(edit_icon);
	}
}
