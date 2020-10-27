package oneup.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import actions.ElementActions;
import driverfactory.DriverFactory;
import oneup.report.Assert;
import oneup.report.Reporter;

public class LoginPageObject {


	//page locators
	private static By emailid =By.id("loginEmail");
	private static By password =By.id("loginPassword");
//	private By captcha =By.className("rc-anchor-center-item rc-anchor-checkbox-holder");
	private static  By captcha =By.xpath("//span[@class = 'recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-expired']");
	private static  By loginButton =By.xpath("//button[@type ='submit']");
	private static By header = By.xpath("//div[@ class= 'product-form-title' ]");
	private static By invalidusernote = By.xpath("//div [@class='alert-danger']");
	private static By linkDemotest =By.xpath("//li[@routerlink='/auth/registration']");
//	private static By linkLogin =By.xpath("/html/body/app-root/app-auth/app-register/div/div/div/div/div[2]/form/div[4]/a");
	private static By linkLogin =By.xpath("//a[contains(text(),'Login')]");
	
	public static int sleep  =5000;
	private static By titleHomepageMath = By.xpath("//h3[contains(text(),'Mathematics')]");
	private static By titleHomepageScience = By.xpath("//h3[contains(text(),'Science')]");
	private static By txtInvalidUser =By.xpath("//span[contains(text(),'Invalid username or password')]");

	private static By linkForgetPassword =By.xpath("//a[contains(text(),'Forgot Password?')]");
	private static By txtForgetPassword = By.xpath("//h3[contains(text(),'FORGOT PASSWORD')]");
	private static By txtboxForgetPasswordemail = By.xpath("//input[@id='verifyEmail']");
	private static By buttonSendVerificationCode = By.xpath("//button[@class='btn btn-success']");
	private static By txtCodeVerification = By.xpath("//label[contains(text(),'Enter code received on email')]");
	
	public static void login(String username, String passwordTxt) {
		System.out.print("OneUP:LoginPageObject: Im an in the LoginPageObject.java class" );
//		navigate_login();
		ElementActions.sendKeys(emailid, username);
		ElementActions.sendKeys(password, passwordTxt);
		ElementActions.click(loginButton);
		DriverFactory.getDriver();
		ElementActions.getDriver().getTitle();
	}
	
	public static void navigate_login() {
		System.out.print("Im an in the navigate_login " );
//		ElementActions.click(linkDemotest);
		ElementActions.click(linkLogin);
		
	}
	
	public static void navigate_forgetpassword() {
		System.out.print("Im an in the navigate_forgetpassword " );
//		ElementActions.click(linkDemotest);
		ElementActions.click(linkForgetPassword);
		
	}
	
	public static void navigate_verification_code(String email) {
		System.out.print("Im an in the navigate_forgetpassword " );
		ElementActions.getDriver().manage().timeouts().implicitlyWait(sleep, TimeUnit.SECONDS);
//		ElementActions.click(linkDemotest);
		ElementActions.sendKeys(txtboxForgetPasswordemail, email);
		ElementActions.click(buttonSendVerificationCode);
		ElementActions.getDriver().manage().timeouts().implicitlyWait(sleep, TimeUnit.SECONDS);
	}
	
	
	
	public static void validateTitle(String expected) {
		System.out.print("Im an in the validateTitle" );
		String actual = ElementActions.getDriver().getTitle();
//		String actual = ElementActions.getText(header);
		System.out.print(actual );
		Assert.assertEquals(expected, actual,"validateTitle");
	}
	
	
	public static void validateHeader(String expected) {
		System.out.print("Im an in the validateHeader" );
		String headerLocal = expected.toUpperCase();
		
		System.out.print(headerLocal);
		String actual =null;
		if (headerLocal.contains("FORGOT"))
		{
			actual = ElementActions.getText(txtForgetPassword);
		}
		else if (headerLocal.contains("EXISTING"))
		{
			actual = ElementActions.getText(header);
		}

		System.out.print(actual );
		Assert.assertEquals(expected, actual,"validateHeader");
	}
	


	public static void validateForgetPasswordHeader(String expected) {
		System.out.print("Im an in the validateTitle" );
		String actual = ElementActions.getText(txtForgetPassword);
//		String actual = ElementActions.getText(header);
		System.out.print(actual );
		Assert.assertEquals(expected, actual,"validateForgetPasswordHeader");
	}
	
	public static void validateError(String expected) {
		System.out.print("Im an in the validateTitle" );
		String actual = ElementActions.getText(txtInvalidUser);
//		String actual = ElementActions.getText(header);
		System.out.print(actual );
		Assert.assertEquals(expected, actual,"validateError");
	}

	public static void validateMath(String expected) {
		System.out.print("Im an in the validateTitle" );
		String actual = ElementActions.getText(titleHomepageMath);
//		String actual = ElementActions.getText(header);
		System.out.print(actual );
		Assert.assertEquals(expected, actual,"validateMath");
	}
	
	public static void validateScience(String expected) {
		System.out.print("Im an in the validateTitle" );
		String actual = ElementActions.getText(titleHomepageScience);
//		String actual = ElementActions.getText(header);
		System.out.print(actual );
		Assert.assertEquals(expected, actual,"validateMath");
	}
	
	public static void validateCodeVerification() {
		System.out.print("Im an in the validateTitle" );
		String actual = ElementActions.getText(txtCodeVerification);
//		String actual = ElementActions.getText(header);
		System.out.print(actual );
		
		Assert.assertEquals("Enter code received on email", actual,"validateCodeVerification");
	}

}
