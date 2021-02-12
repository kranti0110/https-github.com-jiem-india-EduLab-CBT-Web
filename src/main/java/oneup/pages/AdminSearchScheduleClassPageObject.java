package oneup.pages;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;

import actions.ElementActions;
import oneup.report.Assert;

public class AdminSearchScheduleClassPageObject {

	
	private static By Searchdropdown=By.xpath("//button[@type='button']");
	private static By Searchbtn=By.xpath("(//button[@type='submit'])[1]");
	private static By DateErrorMsg=By.xpath("//div[text()='Date is required ']");
	private static By schoolErrorMsg=By.xpath("//div[text()='School name is required ']");
	private static By GradeErrorMsg=By.xpath("//div[text()='Grade is required ']");
	private static By SectionErrorMsg=By.xpath("//div[text()='Section is required ']");
	private static By CrossIcon=By.xpath("//span[@class='fa fa-times close-top-btn']");
	private static By txtpageheader=By.xpath("//p[text()='Time Table not found please specify search criteria ']");
	private static By deleteconfmessage=By.xpath("//div[text()=' Are you sure you want to delete scheduled class? ']");
	private static By deleteicon=By.xpath("//span[@title='Delete class']");
	private static By Canceldelete=By.xpath("//button[@class='btn btn-default']");
	private static By txtSearchclass=By.xpath("//span[text()='Algebra -']");
	private static By deletebtn=By.xpath("//button[@class='btn btn-danger']");
	private static By sessionlink=By.xpath("//a[text()='https://www.google.com/ ']");
	private static By txtStarttime=By.xpath("(//span[@class='ng-star-inserted'])[5]");
	private static By txtEndtime=By.xpath("(//span[@class='ng-star-inserted'])[6]");
	private static By header=By.xpath("//p[@style='text-align:center; font-weight: 500;font-size: 1rem;']");
	
	
	public static void select_dropdown(By drop_down_box, By drop_down_value) {
		ElementActions.click(drop_down_box);
		ElementActions.click(drop_down_value);
	}
	
	
	public static void clickOnAdvSearch() {
		ElementActions.click(Searchdropdown);
		
	}

	public static void clickonSearchbtn() {
		ElementActions.click(Searchbtn);
		
	}

	public static void verifyErrorMsgForDate(String expected) {
		String actual = ElementActions.getText(DateErrorMsg);
		Assert.assertEquals(expected, actual,"\ncheck ErrorMsgForDate");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}

	public static void verifyErrorMsgforsclName(String expected) {
		String actual = ElementActions.getText(schoolErrorMsg);
		Assert.assertEquals(expected, actual,"\ncheck ErrorMsgforsclName");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}

	public static void verifyerrormsgforgrade(String expected) {
		String actual = ElementActions.getText(GradeErrorMsg);
		Assert.assertEquals(expected, actual,"\ncheck errormsgforgrade");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}

	public static void verifyErrorMsgForSection(String expected) {
		String actual = ElementActions.getText(SectionErrorMsg);
		Assert.assertEquals(expected, actual,"\ncheck ErrorMsgForSection");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}


	public static void clickOnCrossIcon() {
		ElementActions.click(CrossIcon);
		
	}
	
	public static void Verifypageheader(String expected) {
		String actual = ElementActions.getText(txtpageheader);
		Assert.assertEquals(expected, actual,"\ncheck pageheader");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}


	public static void verifySearchclass(String expected) throws Throwable {
		Thread.sleep(5000);
		String actual = ElementActions.getText(txtSearchclass);
		Assert.assertEquals(expected, actual,"didnotdisplaysearchresult");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}


	public static void clickOndelete() {
		ElementActions.click(deleteicon);
		
	}


	public static void VerifydeleteConMsg(String expected) {
		String actual = ElementActions.getText(deleteconfmessage);
		Assert.assertEquals(expected, actual,"\ncheck deleteconfmessage");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}


	public static void clickOnCancel() {
		ElementActions.click(Canceldelete);
		
	}


	public static void NevigatetoScheduleClassList() throws Throwable {
		Thread.sleep(3000);
		String TestCurntURL = ElementActions.getDriver().getCurrentUrl();
		System.out.println(TestCurntURL);
		assertEquals("https://oneuptest.net/#/list-schedule-class", TestCurntURL);
		
	}


	public static void clickOndeletebtn() {
		ElementActions.click(deletebtn);
		
	}


	public static void ClickOnsessionLink()   {
		ElementActions.click(sessionlink);		
	}


	public static void NevigatetoSessionLink()   { 
		ArrayList<String> tabs = new ArrayList<String> (ElementActions.getDriver().getWindowHandles());
		//ElementActions.getDriver().getWindowHandles()
		ElementActions.getDriver().switchTo().window(tabs.get(1));
		String TestCurntURL = ElementActions.getDriver().getCurrentUrl();
		System.out.println(TestCurntURL);
		assertEquals("https://www.google.com/", TestCurntURL);
	
	}
		

	public static void verifyStarttime(String expected) {
		String actual = ElementActions.getText(txtStarttime);
		Assert.assertEquals(expected, actual,"\ncheck txtStarttime");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}


	public static void verifyEndtime(String expected) {
		String actual = ElementActions.getText(txtEndtime);
		Assert.assertEquals(expected, actual,"\ncheck txtEndtime");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
		
	}


	public static void verifyheader() {
    ElementActions.getDriver().findElement(header).isDisplayed();
		
	
		
	}
	

	

}

		
	
		
	


