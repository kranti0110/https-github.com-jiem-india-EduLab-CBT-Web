package oneup.pages;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import actions.ElementActions;
import oneup.report.Assert;

public class RegistrationPageObject {

	//page locators
	public static int sleep  =5000;
	private static By linkRegister =By.xpath("//button[contains(text(),'Register')]");
	private static By txtRegistrationPageHeader= By.xpath("//h4[contains(text(),'REGISTRATION FORM')]");
	private static By txtfirstName=By.xpath("//input[@id='mat-input-0']");
	private static By txtlastName=By.xpath("//input[@id='mat-input-1']");
	private static By txtemail=By.xpath("//input[@id='email']");
	private static By txtMobile=By.xpath("//input[@id='mobile']");
	private static By txtSchoolName=By.xpath("//input[@id='currentSchoolName']");
	private static By txtCPCCode=By.xpath("//input[@id='cpcCode']");
	private static By dropDownGrade=By.xpath("//mat-select[@id='mat-select-0']");
	private static By txtCity=By.xpath("//input[@id='city']");
	private static By dropDownCountry=By.xpath("//mat-select[@id='mat-select-1']");
	private static By checkBoxTnC=By.xpath("//body/app-root[1]/app-oneup-registration[1]/div[1]/div[1]/form[1]/div[9]/li[1]/input[1]");
	private static By btnRegister=By.xpath("//button[contains(text(),'Register')]");
	private static By btnProceedForVerification = By.xpath("//button[contains(text(),'Proceed For Verification')]"); 
	
	
	public static void navigate_Registration() {
		System.out.print("Im an in the navigate_Register\n " );
		ElementActions.click(linkRegister);
	}

	public static void validateRegistrationPageHeader(String arg1) {
		System.out.print("Im an in the validatePageHeader\n");
		String actPageHeader=ElementActions.getText(txtRegistrationPageHeader);
		Assert.assertEquals(arg1, actPageHeader, "validateHeader"); 
		System.out.println(arg1 + "  " + actPageHeader);
	}
	
	public static void validateTitle(String arg1) {
		System.out.print("Im an in the validateTitle\n");
		String currentPageTitle= driverfactory.DriverFactory.getDriver().getTitle();
	    System.out.println("\n"+currentPageTitle);
	    System.out.println("\n"+arg1);
		Assert.assertEquals(arg1, currentPageTitle, "validateTitle");
	}
	
	@SuppressWarnings("deprecation")
	public static void validateProceedButtonDisabledTnCDisabled() {
		System.out.print("Im an in the validateProceedButton/n");
		boolean currentState=ElementActions.isElementEnabled(btnRegister);
		junit.framework.Assert.assertEquals(false,currentState);
	}
	
	@SuppressWarnings("deprecation")
	public static void validateProceedButtonDisabledTnCEnabled() {
		System.out.print("Im an in the validateProceedButton/n");
		ElementActions.click(checkBoxTnC);
		boolean currentState=ElementActions.isElementEnabled(btnRegister);
		junit.framework.Assert.assertEquals(false,currentState);
	}
		
	public static void validateDefaultFocus() {
		boolean Result=false;
		System.out.print("I'm an in the validateDefaultFocus\n");
		WebElement wActual = driverfactory.DriverFactory.getDriver().switchTo().activeElement();
		System.out.println("Actual =" + wActual.getAttribute("id"));
		ElementActions.click(txtfirstName);
		WebElement wExpected= driverfactory.DriverFactory.getDriver().switchTo().activeElement();
		System.out.println("Expected =" + wExpected.getAttribute("id"));
		if (wActual==wExpected)
		{			Result=true; 	}
		Assert.assertTrue(Result);
	}
		
		
	public static void enterData(List<Map<String, String>> ls) {
		System.out.print("OneUP:LoginPageObject: Im an in the LoginPageObject.java class" );

		for(int i=0; i<ls.size(); i++) {
			ElementActions.sendKeys(txtfirstName, ls.get(i).get("First Name"));
			ElementActions.sendKeys(txtlastName, ls.get(i).get("Last Name"));
			ElementActions.sendKeys(txtemail, ls.get(i).get("email"));
			ElementActions.sendKeys(txtMobile, ls.get(i).get("Phone No"));
			ElementActions.sendKeys(txtSchoolName, ls.get(i).get("School Name"));
			ElementActions.sendKeys(txtCPCCode, ls.get(i).get("Discount Code"));
			ElementActions.sendKeys(dropDownGrade, ls.get(i).get("Grade"));
			ElementActions.sendKeys(txtCity, ls.get(i).get("City"));
			ElementActions.sendKeys(dropDownCountry, ls.get(i).get("Country"));
			ElementActions.getDriver().manage().timeouts().implicitlyWait(sleep, TimeUnit.SECONDS);
			
			ElementActions.click(checkBoxTnC);
			ElementActions.click(btnProceedForVerification);
			CodeVerificationPageObject.validateCodeVerificationPageHeader("CODE VERIFICATION");
			ElementActions.getDriver().manage().timeouts().implicitlyWait(sleep, TimeUnit.SECONDS);
			
		}
	}

		
	


	
}
