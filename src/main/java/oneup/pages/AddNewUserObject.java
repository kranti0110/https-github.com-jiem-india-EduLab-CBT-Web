package oneup.pages;

import org.openqa.selenium.By;

public class AddNewUserObject {

	
	//Page Locators
	
	public static By email_error_msz = By.xpath("//div[text()= 'Please enter a valid email address']");
	public static By firstname_error_msz = By.xpath("//div[text()= 'First Name is required ']");
	public static By lastname_error_msz = By.xpath("//div[text()= 'Last Name is required ']");
	
}
