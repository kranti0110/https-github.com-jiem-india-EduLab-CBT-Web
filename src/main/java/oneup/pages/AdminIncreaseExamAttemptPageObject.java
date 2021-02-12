package oneup.pages;

import org.openqa.selenium.By;

import actions.ElementActions;
import oneup.report.Assert;

public class AdminIncreaseExamAttemptPageObject {

	private static By IncExamAttemptMenu=By.xpath("//span[@class='fa fa-repeat mr-2']");
	private static By txtPageheader=By.xpath("//h3[text()='Increase Exam Attempt']");
	private static By EmailID=By.xpath("//input[@id='email']");
	private static By Resetntn=By.xpath("//button[@type='submit']");
	private static By Reattemptrequestprocessedsuccessfully=By.xpath("//span[text()='Reattempt request processed successfully.']");
	private static By Userdoesnotexist=By.xpath("//span[text()='User does not exist']");

	public static void clickOnIncExamAttemptMenu() {
		ElementActions.click(IncExamAttemptMenu);
		
	}

	public static void verifyPageheader(String expected) {
		String actual = ElementActions.getText(txtPageheader);
		Assert.assertEquals(expected, actual,"\ncheck Pageheader");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
		
	}

		public static void enterData(String EmailIDvalue) {
		ElementActions.sendKeys(EmailID, EmailIDvalue);

		}

		public static void clickonResetbtn() {
			ElementActions.click(Resetntn);
			
		}

		public static void Verifymsg(String expected) {
			String actual = ElementActions.getText(Reattemptrequestprocessedsuccessfully);
			Assert.assertEquals(expected, actual,"\ncheck Reattemptrequestprocessedsuccessfully.");
			System.out.println("\nExpected: "+ expected);
			System.out.println("\nActual: "+ actual);
			
			
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
		
	

}
