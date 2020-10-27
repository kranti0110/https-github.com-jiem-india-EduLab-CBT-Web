package oneup.pages;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import actions.ElementActions;
import driverfactory.DriverFactory;
import oneup.report.Assert;
import oneup.report.Reporter;

public class RegistrationPageObject {


	//page locators
	public static int sleep  =5000;
	private static By linkRegister =By.xpath("//button[contains(text(),'Register')]");
	private static By textPageHeader= By.xpath("//h4[contains(text(),'REGISTRATION FORM')]");
		
	private static By txtfirstName=By.xpath("//input[@id='mat-input-0']");
	private static By txtlastName=By.xpath("//input[@id='mat-input-1']");
	private static By txtemail=By.xpath("//body/app-root[1]/app-oneup-registration[1]/div[1]/div[1]/form[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]");
	private static By txtMobile=By.xpath("//input[@id='mobile']");
	private static By btnRegister=By.xpath("//button[contains(text(),'Proceed for Verification')]");
	
	
	public static void navigate_Registration() {
		System.out.print("Im an in the navigate_Register/n " );
		ElementActions.click(linkRegister);
		
	}

	public static void validateHeader(String arg1) {
		System.out.print("Im an in the validateHeader/n");
		String actPageHeader=ElementActions.getText(textPageHeader);
		Assert.assertEquals(arg1, actPageHeader, "validateHeader"); 
		
	}
	
	public static void enterData(List<Map<String, String>> list) {
		System.out.print("OneUP:LoginPageObject: Im an in the LoginPageObject.java class" );
//		navigate_login();
		
//		System.out.println(list.get(i).get("First Name"));
//		System.out.println(list.get(i).get("Last Name"));
//		System.out.println(list.get(i).get("email"));
//		System.out.println(list.get(i).get("Phone No"));
		for(int i=0; i<list.size(); i++) {
			ElementActions.sendKeys(txtfirstName, list.get(i).get("First Name"));
			ElementActions.sendKeys(txtlastName, list.get(i).get("Last Name"));
			ElementActions.sendKeys(txtemail, list.get(i).get("email"));
			ElementActions.sendKeys(txtMobile, list.get(i).get("Phone No"));
			ElementActions.click(btnRegister);
			ElementActions.getDriver().manage().timeouts().implicitlyWait(sleep, TimeUnit.SECONDS);
			ElementActions.getDriver().navigate().back();
		}
	}


	
}
