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
	private static By ProfileIcon=By.xpath("//i[@title='User profile']");
	private static By LogOut=By.xpath("//i[@class='fa fa-sign-out']");
	private static By Mytest=By.xpath("//a[@id='my-test']");
	private static By TakeTest=By.xpath("(//a[@class='view-test-btn'])[1]");
	private static By TandC=By.xpath("//input[@id='accept-terms']");
	private static By YestforTest=By.xpath("//button[@id='start-test']");
	private static By Next=By.xpath("//button[@id='next-question']");
	private static By Abort=By.xpath("//i[@id='abort-test']");
	private static By YestoAbort=By.xpath("//button[@id='confirmation-abort']");
	private static By Resumetest=By.xpath("//a[text()='RESUME TEST ']");
	private static By Maxretriesexceededfortakingtheexam=By.xpath("//div[text()=' Max retries exceeded for taking the exam. ']");
	private static By SciTakeTest=By.xpath("(//a[@class='view-test-btn'])[1]");
	
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

		public static void clickonuserprofile() {
			ElementActions.click(ProfileIcon);
			
		}

		public static void clickOnLogOut() {
			ElementActions.click(LogOut);
			
		}

		public static void ClickOnMyTest() {
			ElementActions.click(Mytest);
			
		}

		public static void CliclOnMathsTakeTest() {
			ElementActions.click(TakeTest);
			
		}

		public static void ClickOnTandC() {
			ElementActions.click(TandC);
			
		}

		public static void ClickOnReadyForTestbtn() {
			ElementActions.click(YestforTest);
			
		}

		public static void ClickOnNextbtn() {
			ElementActions.click(Next);
			
		}

		public static void ClickOnAbort() {
			ElementActions.click(Abort);
			
		}

		public static void ClickOnYesToAbort() {
			ElementActions.click(YestoAbort);
			
		}

		public static void ClickOnResumeTest() {
			ElementActions.click(Resumetest);
			
		}

		public static void verifyTheResumeText(String expected) {
			String actual = ElementActions.getText(Maxretriesexceededfortakingtheexam);
			Assert.assertEquals(expected, actual,"text did not match");
			System.out.println("\nExpected: "+ expected);
			System.out.println("\nActual: "+ actual);
			
		}

		public static void clickOnScitakeTestbtn() {
			ElementActions.click(SciTakeTest);
			
		}

		
		
	

}
