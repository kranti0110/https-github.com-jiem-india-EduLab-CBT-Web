package oneup.pages;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import actions.ElementActions;

public class SclAdminScheduleClassPageObject {
	
		private static By TimeTablenotfoundpleasespecifysearchcriteria=By.xpath("//p[@class='codyhouse']");
		private static By ScheduleClass=By.xpath("//span[@class='fa fa-calendar mr-2']");
		private static By AddNewClassbtn=By.xpath("//button[@class='btn btn-success']");
		private static By txtPageheader=By.xpath("//h3[text()='ADD NEW CLASS']");
		private static By clickonZoomoption=By.xpath("(//input[@formcontrolname='meetingType'])[1]");
		private static By clickOnSave=By.xpath("//button[@class='btn btn-success']");
		private static By MeetingURL=By.xpath("//textarea[@class='form-control ng-untouched ng-pristine ng-invalid']");
		private static By Message=By.xpath("//textarea[@formcontrolname='message']");
		private static By Topic=By.xpath("//input[@formcontrolname='topic']");
		private static By CancelBtn=By.xpath("//button[@class='btn btn-default mr-4']");
		private static By txtSectionisrequired=By.xpath("//div[text()='Section is required ']");
		private static By txtsubjectisrequired=By.xpath("//div[text()='subject is required ']");
		private static By headerafteraddingclass=By.xpath("//p[@style='text-align:center; font-weight: 500;font-size: 1rem;']");
		private static By txtErrorEventalreadyExist=By.xpath("//span[text()='Error: Event already Exist']");
		private static By txtmeetingURLisrequired=By.xpath("//div[text()='meetingURL is required ']");
		
		
		public static void navigatetoScheduleClass() {
			ElementActions.click(ScheduleClass);
			
		}

		public static void VerifyMessage(String expected) {
			System.out.print("Im an in the validate message On landing to schedule class menu" );
			String actual = ElementActions.getText(TimeTablenotfoundpleasespecifysearchcriteria);
			System.out.print(actual );
			Assert.assertEquals(expected, actual, actual);
		
		}

		public static void ClickOnAddNewClassbtn() {
			ElementActions.click(AddNewClassbtn);
			
		}

		public static void nevigatetoAddNewClassPage() throws Throwable { 
				Thread.sleep(3000);
				String TestCurntURL = ElementActions.getDriver().getCurrentUrl();
				System.out.println(TestCurntURL);
				assertEquals("https://oneuptest.net/#/schedule-class", TestCurntURL);
				
			}

		public static void verifypageHeader(String expected) {
				String actual = ElementActions.getText(txtPageheader);
				Assert.assertEquals(expected, actual,"did not display expected page header");
				System.out.println("\nExpected: "+ expected);
				System.out.println("\nActual: "+ actual);
				
			}
		
		public static void select_dropdown(By drop_down_box, By drop_down_value) {
			ElementActions.click(drop_down_box);
			ElementActions.click(drop_down_value);
		}

		public static void clickOnOnlineMeetingUsingOption() {
			ElementActions.click(clickonZoomoption);
		}

		public static void clickOnSave() throws Throwable {
			ElementActions.click(clickOnSave);
		}

		public static void enterData(String MeetingURLvalue, String Messagevalue, String Topicvalue) {
			ElementActions.sendKeys(MeetingURL, MeetingURLvalue);
			ElementActions.sendKeys(Message, Messagevalue);
			ElementActions.sendKeys(Topic, Topicvalue);
			
		}

		public static void clickOnCancel() {
			ElementActions.click(CancelBtn);
			
		}

		public static void nevigateToTimeTable() throws Throwable { 
			Thread.sleep(3000);
			String TestCurntURL = ElementActions.getDriver().getCurrentUrl();
			System.out.println(TestCurntURL);
			assertEquals("https://oneuptest.net/#/list-schedule-class", TestCurntURL);
			
		}
		
		public static void Verifyheaderafteraddingclass() {
			ElementActions.getDriver().findElement(headerafteraddingclass).isDisplayed();
			
		}

		public static void verifysectionerrormsg(String expected) {
			String actual = ElementActions.getText(txtSectionisrequired);
			Assert.assertEquals(expected, actual,"did not display Section is required");
			System.out.println("\nExpected: "+ expected);
			System.out.println("\nActual: "+ actual);
			
		}

		public static void verifysubjecterrormsg(String expected) {
			String actual = ElementActions.getText(txtsubjectisrequired);
			Assert.assertEquals(expected, actual,"did not display subject is required");
			System.out.println("\nExpected: "+ expected);
			System.out.println("\nActual: "+ actual);
			
		}

		public static void verifyerrormsgforexisting(String expected) {
			String actual = ElementActions.getText(txtErrorEventalreadyExist);
			Assert.assertEquals(expected, actual,"did not display txt Error Event already Exist");
			System.out.println("\nExpected: "+ expected);
			System.out.println("\nActual: "+ actual);
			
		}

		public static void verifyurlerrormsg(String expected) {
		String actual = ElementActions.getText(txtmeetingURLisrequired);
		Assert.assertEquals(expected, actual,"did not didplay meeting url");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
					
		}
		

		}		
		
		

	

			
		

