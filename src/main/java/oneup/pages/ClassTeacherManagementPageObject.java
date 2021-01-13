package oneup.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sun.tools.javac.util.List;

import actions.ElementActions;
import oneup.report.Assert;


public class ClassTeacherManagementPageObject {

	private static By listPerPageLink1=By.xpath("(//a[@class='page-link'])[2]");
	private static By listPerPageLink2=By.xpath("(//a[@class='page-link'])[3]");
	private static By listNextPageLink=By.xpath("(//a[@class='page-link'])[5]");
	private static By listPreviousPageLink=By.xpath("(//a[@class='page-link'])[1]");
	private static By searchResultString=By.xpath("/html/body/app-root/app-class-teacher-association-management/app-class-teacher-association-list/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/i");
	private static By Section=By.xpath("/html/body/app-root/app-class-teacher-association-management/app-class-teacher-association-management-create/div/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div/div/div[4]/div/ngx-select/div/div[2]/div/span[1]/span");
	private static By grade=By.xpath("/html/body/app-root/app-class-teacher-association-management/app-class-teacher-association-management-create/div/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div/div/div[3]/div/ngx-select/div/div[2]/div/span[1]/span");
	private static By TeacherName=By.xpath("/html/body/app-root/app-class-teacher-association-management/app-class-teacher-association-management-create/div/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/ngx-select/div/div[2]/div/span[1]/span");
	private static By SchoolName=By.xpath("/html/body/app-root/app-class-teacher-association-management/app-class-teacher-association-management-create/div/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/ngx-select/div/div[2]/div/span[1]/span");
	private static By MasterData=By.xpath("//a[@aria-controls='mstersubmenu']");
	private static By txtPagetitle= By.xpath("//h3[contains(text(),'Create CLASS TEACHER')]");
	private static By advancesearch= By.xpath("//button[@class='btn btn-default dropdown-toggle']");
	private static By closesearchbutton= By.xpath("//span[@class='fa fa-times close-top-btn']");
	private static By get_txt_ele_name= By.xpath("//*[contains(text(),'Displaying 1-')]");
	private static By secondpage=By.xpath("(//a[@class='page-link'])[3]");
	
	

	public static void navigate_classTeacherManagementpage() {
		System.out.print("Im an in the navigate_classTeacherManagementpage" );
		By ClassTeacherManagementbutton=By.xpath("//*[@id=\"mstersubmenu\"]/ul/li[5]");
		ElementActions.click(ClassTeacherManagementbutton);
	}

	public static void clicks_CREATECLASSTEACHER() {
		By CREATECLASSTEACHERbutton=By.xpath("//button[@class='btn btn-success']");
		ElementActions.click(CREATECLASSTEACHERbutton);
		
	}


	public static void verifyPageLink() {
		ElementActions.getDriver().manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		Assert.assertTrue(ElementActions.isElementExist(listPerPageLink1));
		Assert.assertTrue(ElementActions.isElementExist(listPerPageLink2));
	
	}

	public static void navigatePage1() {
		ElementActions.getDriver().manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		ElementActions.click(listPerPageLink1);
		searchResult();
	}
	

	public static void searchResult() {
		ElementActions.getDriver().manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		System.out.print("************getText searchResult *********** "+ ElementActions.getText(searchResultString));
		System.out.print("************isElementExist searchResult*********** "+ ElementActions.isElementExist(searchResultString));
		System.out.print("************getText searchResult*********** "+ ElementActions.getText(searchResultString).contains("Displaying 1-10"));
		Assert.assertTrue(ElementActions.getText(searchResultString).contains("Displaying 1-10"));
		
	}

	public static void navigatePage2() {
		ElementActions.click(listPerPageLink2);
		searchResult2();
	}
	
	private static void searchResult2() {
		ElementActions.getDriver().manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		System.out.print("************getText searchResult2*********** "+ ElementActions.getText(searchResultString));
		System.out.print("************isElementExist searchResult2*********** "+ ElementActions.isElementExist(searchResultString));
		
		Assert.assertTrue(ElementActions.getText(searchResultString).contains("Displaying 11-20"));
	
		
	}

	public static void navigateNextPage(By get_txt_ele_name) {
		ElementActions.click(secondpage);
		ElementActions.click(listNextPageLink);
		String actualString = ElementActions.getText(get_txt_ele_name);
		System.out.println(actualString);
		assertTrue(actualString.contains("Displaying 21-21 of"), "Did not display 21 of 21 record");
	
	}	
	
	public static void navigatePreviousPage() {
		ElementActions.click(secondpage);
		ElementActions.click(listPreviousPageLink);
		String actualString = ElementActions.getText(get_txt_ele_name);
		System.out.println(actualString);
		assertTrue(actualString.contains("Displaying 1-10 of"), "Did not display 1 of 10 record");
	}
	
	
	public static void enterData(String schoolnamevalue, String teachername, String gradevalue, String sectionvalue) throws InterruptedException {
		ElementActions.sendKeys(SchoolName, schoolnamevalue);
		ElementActions.sendKeys(TeacherName, teachername);
		ElementActions.sendKeys(grade, gradevalue);
		ElementActions.sendKeys(Section, sectionvalue);
	}
	
	public static void select_dropdown(By drop_down_box, By drop_down_value) {
		ElementActions.click(drop_down_box);
		ElementActions.click(drop_down_value);
	}
	
	
	public static void verifyCreateClassTeacherPage() throws Throwable {
		Thread.sleep(3000);
		String TestCurntURL = ElementActions.getDriver().getCurrentUrl();
		System.out.println(TestCurntURL);
		assertEquals("https://oneuptest.net/#/classTeacherAssociation/create", TestCurntURL);
		
	}

	public static void navigate_MasterData() {
		ElementActions.click(MasterData);
		
	}

	public static void checkPagetitle(String expected) {
		String actual = ElementActions.getText(txtPagetitle);
		Assert.assertEquals(expected, actual,"\ncheck Pagetitle");
		System.out.println("\nExpected: "+ expected);
		System.out.println("\nActual: "+ actual);
		
	}

	public static void clicksonadvancesearch() {
		ElementActions.click(advancesearch);
		
	}

	public static void getsearchrecord() {
		String TestCurntURL = ElementActions.getDriver().getCurrentUrl();
		System.out.println(TestCurntURL);
		assertEquals("https://oneuptest.net/#/classTeacherAssociation/list", TestCurntURL);
		
	}

	public static void verifyclosesearchbutton() {
		ElementActions.click(closesearchbutton);
		
	}

	public static void verifyallrecords() {
		String TestCurntURL = ElementActions.getDriver().getCurrentUrl();
		System.out.println(TestCurntURL);
		assertEquals("https://oneuptest.net/#/classTeacherAssociation/list", TestCurntURL);
		
	}

	public static void verifysecondpage() {
		ElementActions.click(secondpage);
		
	}

	
		
	
	
}
		
	
	

	

	

	
	

	

	

	
	
