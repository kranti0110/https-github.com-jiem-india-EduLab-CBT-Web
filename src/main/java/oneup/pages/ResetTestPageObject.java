package oneup.pages;

import org.openqa.selenium.By;

import actions.ElementActions;
import oneup.report.Assert;

public class ResetTestPageObject {

	
	private static By txtPagetitle=By.xpath("//h3[text()='Reset Test']");
	private static By ResetTestMenu=By.xpath("//span[@class='fa fa-refresh mr-2']");
	private static By EmailID=By.xpath("//input[@id='email']");
	private static By Resetbtn=By.xpath("//button[@type='submit']");
	private static By Userdoesnotexist=By.xpath("//span[text()='User does not exist']");
	private static By Datacleared=By.xpath("//span[text()='Data cleared.']");
	private static By clickonMyTest=By.xpath("//a[@id='my-test']");
	private static By TakeTest=By.xpath("(//a[@class='view-test-btn'])[1]");
	private static By clickonReadyforTest=By.xpath("//button[@id='start-test']");
	private static By clickonnext=By.xpath("//button[@id='next-question']");
	private static By clickonAbort=By.xpath("//i[@id='abort-test']");
	private static By clickonYesToAbort=By.xpath("//button[@id='confirmation-abort']");
	private static By ResumeTest=By.xpath("(//div[@style='color:green;text-align: center;'])[1]");
	private static By ClickontandC=By.xpath("//input[@id='accept-terms']");
	

	public static void clickonResetTest() {
		ElementActions.click(ResetTestMenu);
		
	}


	public static void verifyPageHeader(String expected) {
		String actual = ElementActions.getText(txtPagetitle);
		Assert.assertEquals(expected, actual,"\ncheck Pagetitle");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}
	
	public static void enterData(String EmailIDvalue) {
		ElementActions.sendKeys(EmailID, EmailIDvalue);

	}


	public static void clickonResetbtn() {
		ElementActions.click(Resetbtn);
		
	}


	public static void enterinvalidData(String invalidEmailIDvalue) {
		ElementActions.sendKeys(EmailID, invalidEmailIDvalue);
	}


	public static void Verifyerrormsgforinvalidid(String expected) {
			System.out.print("Im an in the Verify error msg for invalid id" );
			String actual = ElementActions.getText(Userdoesnotexist);
			System.out.print(actual );
			Assert.assertEquals(expected, actual, actual);
		
		}


	public static void Verifymsg(String expected) {
		System.out.print("Im an in the Verify msg" );
		String actual = ElementActions.getText(Datacleared);
		System.out.print(actual );
		Assert.assertEquals(expected, actual, actual);
		
	}


	public static void nevigatetoMytest() {
		ElementActions.click(clickonMyTest);
		
	}


	public static void clickOnMathtakeTestbtn() {
		ElementActions.click(TakeTest);
		
	}


	public static void ClickonReadyforTest() {
		ElementActions.click(clickonReadyforTest);
		
	}


	public static void ClickOnnext() {
		ElementActions.click(clickonnext);
		
	}


	public static void clickonAbort() {
		ElementActions.click(clickonAbort);
		
	}


	public static void clickonYesToAbort() {
		ElementActions.click(clickonYesToAbort);
		
	}


	public static void verifyMathsTestbtnname(String expected) {
		String actual = ElementActions.getText(ResumeTest);
		Assert.assertEquals(expected, actual,"\ncheck ResumeTest");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}


	public static void verifyMathsTestbtnafterReset(String expected) {
		String actual = ElementActions.getText(TakeTest);
		Assert.assertEquals(expected, actual,"\ncheck TakeTest");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}


	public static void ClickontandC() {
		ElementActions.click(ClickontandC);
		
	}
		
	
	
}
