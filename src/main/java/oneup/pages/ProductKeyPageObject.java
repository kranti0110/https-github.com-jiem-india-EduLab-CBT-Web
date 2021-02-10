package oneup.pages;


import org.openqa.selenium.By;


import actions.ElementActions;

import static org.junit.jupiter.api.Assertions.assertTrue;



public class ProductKeyPageObject {
	
	public static By displayrecordpartialtxt = By.xpath("//*[contains(text(),'Displaying 1-')]");
	public static By prod_key_id = By.id("productKey");
	
	//Locators of Add new product key page
	public static By product_type_dropbox = By.xpath("//ngx-select[@placeholder='-- Select Product Type --']//div[@class='ngx-select dropdown']");
	public static By product_type_dropbox_value = By.xpath("//li[@class='ngx-select__item-group ng-star-inserted'][2]");
	
	public static By grade_dropbox = By.xpath("//ngx-select[@placeholder='-- Select Grade --']//div[@class = 'ngx-select dropdown']");
	public static By grade_dropbox_value = By.xpath("//li[@class='ngx-select__item-group ng-star-inserted'][1]");
	
	public static By subject_dropbox = By.xpath("//span[@class='dropdown-btn']");
	
	//Selecting subject Mathsmatics
	public static By subject_dropbox_value = By.xpath("(//li[@class='multiselect-item-checkbox ng-star-inserted'])[2]");
	
	
	//clicking on start date field box
	public static By start_date_box = By.xpath("(//button[@class='mat-icon-button mat-button-base'])[1]");
	public static By to_date_box = By.xpath("(//button[@class='mat-icon-button mat-button-base'])[2]");
	
	//Selecting todays date
	public static By date_today = By.xpath("//div[@class='mat-calendar-body-cell-content mat-calendar-body-selected mat-calendar-body-today']");
	
	//Selecting next day date
	public static By date_next_day = By.xpath("(//td[@class='mat-calendar-body-cell ng-star-inserted'])[1]");
			
	//confirming and closing date calendar
//	public static By tick_date = By.xpath("//button[@class='ng-tns-c10-3 mat-button mat-icon-button mat-button-base mat-primary']");
	public static By tick_date1 = By.xpath("//*[@id=\"cdk-overlay-0\"]/ngx-mat-datetime-content/div[2]/button[2]/span/mat-icon");
	public static By tick_date2 = By.xpath("(//span[@class=\"mat-button-wrapper\"])[13]");
	//No of users box
	public static By users = By.xpath("//input[@formcontrolname='noofUsers']");
	
	//edit btn click
	public static By edit_btn_xpath = By.xpath("//button[@class='btn btn-success ng-star-inserted']");
	
	//Status text box
	public static By status_box_xpath = By.xpath("//div[@class='ngx-select__disabled']");
	
	//Product key box
	public static By product_key_box = By.xpath("//input[@placeholder='Enter Product Key']");
	
	//Get school name
	public static By get_school_name = By.xpath("(//td[@class='ng-star-inserted'])[2]");
	
	// Get prod key
	public static By get_prod_key_xpath = By.xpath("//*[contains(text(),'HH010602000001')]");
	

	
	// Below defining methods
	public static void verifies_partial_txt(By get_txt_ele_name) {
		String actualString = ElementActions.getText(get_txt_ele_name);
		System.out.println(actualString);
		assertTrue(actualString.contains("Displaying 1-1 of"), "Did not display 1 of 1 record");
	}
	
	public static void verifies_partial_txt_record(By get_txt_ele_name, String display_msz) {
		String actualString = ElementActions.getText(get_txt_ele_name);
		System.out.println(actualString);
		assertTrue(actualString.contains(display_msz), "Did not display expected record");
	}
	
	public static void send_keys(By locator, String sendkeys_value) {
		ElementActions.sendKeys(locator, sendkeys_value );
	}
	
	public static void select_calendar_date(By cal_box, By date, By tick_btn) throws InterruptedException {
		Thread.sleep(2000);
		ElementActions.click(cal_box);
		Thread.sleep(2000);
		ElementActions.click(date);
		Thread.sleep(2000);
		ElementActions.click(tick_btn);
//		ElementActions.sendKeys(tick_btn, Keys.ENTER);
	}
	
	public static void click_element(By locator) {
		ElementActions.click(locator);
	}
	
	  public static void is_ele_enable(By locator_name) {
		  boolean is_enable = ElementActions.isElementEnabled(locator_name);
		  if (is_enable == true) {
			  System.out.println("Element is enabled");
		   }
		   
		  else {
			  System.out.println(locator_name +" Element is not enabled");
		   }
	   }
	
	
	
	public static void select_dropdown(By drop_down_box, By drop_down_value) {
		ElementActions.click(drop_down_box);
		ElementActions.click(drop_down_value);
	}
	
	
	public static void get_text(By locator) {
		ElementActions.getText(locator);
	}

}
