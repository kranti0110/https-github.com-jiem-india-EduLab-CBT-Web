package oneup.pages;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import actions.ElementActions;
import oneup.report.Assert;

public class CodeVerificationPageObject {

	//page locators
	public static int sleep  =5000;
	private static By linkResend =By.xpath("//u[contains(text(),'Resend')]");
	private static By linkClickHere =By.xpath("//u[contains(text(),'Click here')]");
	public static By txtCodeVerificationPageHeader= By.xpath("//h3[contains(text(),'CODE VERIFICATION')]");
	private static By btnVerify= By.xpath("//button[contains(text(),'VERIFY')]");
	private static By txtEnterCode= By.xpath("//input[@id='verificationCode']");
	
		
		public static void validateCodeVerificationPageHeader(String arg1) {
		System.out.print("Im an in the validateCodeVerificationPageHeader\n");
		String actPageHeader=ElementActions.getText(txtCodeVerificationPageHeader);
		Assert.assertEquals(arg1, actPageHeader, "validateCodeVerificationHeader"); 
	}
	
	public static void validateTitle(String arg1) {
		System.out.print("Im an in the validateTitle\n");
		String currentPageTitle= driverfactory.DriverFactory.getDriver().getTitle();
	    System.out.println("\n"+currentPageTitle);
	    System.out.println("\n"+arg1);
		Assert.assertEquals(arg1, currentPageTitle, "validateTitle");
	}
	
			
	public static void validateDefaultFocus() {
		boolean Result=false;
		System.out.print("I'm an in the validateDefaultFocus\n");
		WebElement wActual = driverfactory.DriverFactory.getDriver().switchTo().activeElement();
		System.out.println("Actual =" + wActual.getAttribute("id"));
		ElementActions.click(txtEnterCode);
		WebElement wExpected= driverfactory.DriverFactory.getDriver().switchTo().activeElement();
		System.out.println("Expected =" + wExpected.getAttribute("id"));
		if (wActual==wExpected)
		{			Result=true; 	}
		Assert.assertTrue(Result);
	}
		
		
	
			
		
		}
	

		
	


	
