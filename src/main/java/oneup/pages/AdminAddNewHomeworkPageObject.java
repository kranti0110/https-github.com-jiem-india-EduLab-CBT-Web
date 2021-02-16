package oneup.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.ElementActions;
import driverfactory.DriverFactory;
import oneup.report.Assert;

public class AdminAddNewHomeworkPageObject {

	private static By ScheduleHW=By.xpath("//a[text()=' Schedule Homework']");
	private static By AddNewHW=By.xpath("//button[@class='btn btn-success']");
	private static By ADDNEWHOMEWORK=By.xpath("//h3[text()='ADD NEW HOMEWORK']");
	private static By Topic=By.xpath("//input[@id='topic']");
	private static By Message=By.xpath("//textarea[@id='message']");
	private static By HWDuedate=By.xpath("//span[text()='15']");
	private static By SaveNewHW=By.xpath("//button[@type='submit']");
	private static WebDriver driver1= DriverFactory.getDriver();
	private static By BrowseQuestionWorksheet=By.xpath("//input[@formcontrolname='questionSheetURL']");
	private static By browseFile=By.xpath("//input[@id='file']");
	private static By OpenButton=By.xpath("//input[@id='file']");
	private static By Dateisrequired=By.xpath("//div[text()='Date is required ']");
	private static By Schoolnameisrequired=By.xpath("//div[text()='School name is required ']");
	private static By Gradeisrequired=By.xpath("//div[text()='Grade is required ']");
	private static By Topicisrequired=By.xpath("//div[text()='Topic is required ']");
	private static By EnableAnswerKeyDateisrequired=By.xpath("//div[text()='Enable Answer Key Date is required ']");
	private static By Cancelbtn=By.xpath("//button[text()=' Cancel']");
	private static By AdvanceSearch=By.xpath("//button[@type='button']");
	private static By Searchbtn=By.xpath("//button[text()=' Search ']");
	private static By Sectionisrequired=By.xpath("//div[text()='Section is required ']");
	private static By DeleteIcon=By.xpath("//span[@title='Delete Homework']");
	private static By Areyousureyouwanttodeletescheduledhomework=By.xpath("//div[text()=' Are you sure you want to delete scheduled homework? ']");
	private static By Cancel=By.xpath("//button[@class='btn btn-default']");
	private static By Delete=By.xpath("//button[@class='btn btn-danger']");
	private static By Homeworkhaventaddedyet=By.xpath("//p[@style='font-weight: 500;font-size: 1.0rem;']");

	public static void nevigateToScheduleHW() {
		ElementActions.click(ScheduleHW);
		
	}

	public static void ClickOnAddNewHW() {
		ElementActions.click(AddNewHW);
		
	}

	public static void NevigateToadddNewHWpage() {
		String TestCurntURL = ElementActions.getDriver().getCurrentUrl();
		System.out.println(TestCurntURL);
		assertEquals("https://oneuptest.net/#/homework/create", TestCurntURL);
		
	}

	public static void verifyPageHeader(String expected) {
		String actual = ElementActions.getText(ADDNEWHOMEWORK);
		Assert.assertEquals(expected, actual,"Page header did not match");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}
	
	public static void select_dropdown(By drop_down_box, By drop_down_value) {
		ElementActions.click(drop_down_box);
		ElementActions.click(drop_down_value);
	}

	public static void enterData(String Messagevalue,String Topicvalue) {
		ElementActions.sendKeys(Message, Messagevalue);
		ElementActions.sendKeys(Topic, Topicvalue);
		
	}

//	public static void SelectHWDueDate() {
//		ElementActions.click(HWDuedate);
		
//	}

	public static void clickOnSave() {
		ElementActions.click(SaveNewHW);
		
	}

	

	public static void SelectAnswerKeys() {
		
		
	}

	public static void verifydateerrormsg(String expected) {
		String actual = ElementActions.getText(Dateisrequired);
		Assert.assertEquals(expected, actual,"Error msg did not match");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}

	public static void verifyschoolerrormsg(String expected) {
		String actual = ElementActions.getText(Schoolnameisrequired);
		Assert.assertEquals(expected, actual,"Error msg did not match");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
		
	}

	public static void verifygradeErrormsg(String expected) {
		String actual = ElementActions.getText(Gradeisrequired);
		Assert.assertEquals(expected, actual,"Error msg did not match");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}

	public static void verifyTopicerrormsg(String expected) {
		String actual = ElementActions.getText(Topicisrequired);
		Assert.assertEquals(expected, actual,"Error msg did not match");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
	}

	public static void verifyHWduedateerrormsg(String expected) {
		String actual = ElementActions.getText(EnableAnswerKeyDateisrequired);
		Assert.assertEquals(expected, actual,"Error msg did not match");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}

	public static void ClickOncancel() {
		ElementActions.click(Cancelbtn);
		
	}

	public static void NevigatetoHWListpage() {
		String TestCurntURL = ElementActions.getDriver().getCurrentUrl();
		System.out.println(TestCurntURL);
		assertEquals("https://oneuptest.net/#/homework/list", TestCurntURL);
		
	}

	public static void clickOnAdvancesearch() {
		ElementActions.click(AdvanceSearch);
		
	}

	public static void clickonSearch() {
		ElementActions.click(Searchbtn);
		
	}

	public static void verifySectionerrormsg(String expected) {
		String actual = ElementActions.getText(Sectionisrequired);
		Assert.assertEquals(expected, actual,"Error msg did not match");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
		
	}

	public static void clickonDeleteicon() {
		ElementActions.click(DeleteIcon);
	}

	public static void verifydeleteconfmsg(String expected) {
		String actual = ElementActions.getText(Areyousureyouwanttodeletescheduledhomework);
		Assert.assertEquals(expected, actual,"confirmation msg did not match");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}

	public static void clickOnCancelfordelete() {
		ElementActions.click(Cancel);
		
	}

	public static void clickOndelete() {
		ElementActions.click(Delete);
		
	}

	public static void pageheader(String expected) {
		String actual = ElementActions.getText(Homeworkhaventaddedyet);
		Assert.assertEquals(expected, actual,"page header did not match");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}
	
	

}
