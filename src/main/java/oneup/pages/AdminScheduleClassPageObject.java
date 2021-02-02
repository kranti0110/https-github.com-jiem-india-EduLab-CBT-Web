package oneup.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import actions.ElementActions;
import oneup.report.Assert;

public class AdminScheduleClassPageObject {

	private static By TimeTablenotfoundpleasespecifysearchcriteria=By.xpath("//p[@class='codyhouse']");
	private static By ScheduleClass=By.xpath("/html/body/app-root/app-admin-home/div/div/div[1]/app-side-menu/aside/div[3]/ul/li[4]");
	private static By AddNewClassbtn=By.xpath("//button[@class='btn btn-success']");
	private static By txtPageheader=By.xpath("//h3[text()='ADD NEW CLASS']");
	private static By clickonZoomoption=By.xpath("(//input[@formcontrolname='meetingType'])[1]");
	private static By clickOnSave=By.xpath("//button[@class='btn btn-success']");
	private static By MeetingURL=By.xpath("//textarea[@class='form-control ng-untouched ng-pristine ng-invalid']");
	private static By Message=By.xpath("//textarea[@formcontrolname='message']");
	private static By Topic=By.xpath("//input[@formcontrolname='topic']");
	private static By CancelBtn=By.xpath("//button[@class='btn btn-default mr-4']");
	private static By schoolerrormessage=By.xpath("//span[text()='Error: Please Select School']");
	private static By txtSectionisrequired=By.xpath("//div[text()='Section is required ']");
	private static By txtsubjectisrequired=By.xpath("//div[text()='subject is required ']");
	private static By txtTimeTablefor=By.xpath("//p[@class='codyhouse ng-star-inserted']");
	
	
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

	public static void verifyPageHeader(String expected) {
			String actual = ElementActions.getText(txtPageheader);
			Assert.assertEquals(expected, actual,"\ncheck Pageheader");
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

	public static void clickOnSave() {
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
	
	public static void Verifyheaderafteraddingclass(String expected) {
		String actual = ElementActions.getText(txtTimeTablefor);
		Assert.assertEquals(expected, actual,"\ncheck TimeTablefor");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}

	public static void verifysectionerrormsg(String expected) {
		String actual = ElementActions.getText(txtSectionisrequired);
		Assert.assertEquals(expected, actual,"\ncheck Sectionisrequired");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}

	public static void verifysubjecterrormsg(String expected) {
		String actual = ElementActions.getText(txtsubjectisrequired);
		Assert.assertEquals(expected, actual,"\ncheck subjectisrequired");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}
	
	

}

		
	
		
	


