package oneup.pages;

import oneup.module.Popup;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.spi.ObjectThreadContextMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import actions.ElementActions;
import driverfactory.DriverFactory;
import junit.framework.Assert;

public class ProfilePageObject {
	
	public static int sleep  =5000;
	private static By btnDropDown = By.xpath("//app-header/div[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/i[1]");
	private static By linkMyProfile = By.xpath("//app-header/div[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[2]/a[1]");
	private static By header = By.xpath("//h3[contains(text(),'MY PROFILE')]");
	private static By inputSection =By.xpath("//input[@id='section']");
	private static By inputRollNumber =By.xpath("//input[@id='rollNumber']");
	private static By btnUpdate =By.xpath("//button[contains(text(),'UPDATE')]");
	private static By btnGotoSchool =By.xpath("//button[contains(text(),'GO TO MY STUDY')]");
	
	
	private static By msgSection =By.xpath("//div[contains(text(),'Section is required')]");
	private static By msgRollno =By.xpath("//div[contains(text(),'Roll No. is required')]");
	
	private static By modelWindow =By.xpath("//div[@class='modal-body']");
	private static By modelWindowClose =By.xpath("//button[@class='close pointer']");
	private static By modelWindowFrame =By.xpath("//div[@class='modal-body']//iframe");
	private static By linkOneup =By.xpath("//li[@class='nav-item active']");
	private static By linkAboutus =By.xpath("//li[@routerlink='/oneup-about-us']");
	private static By linkTalenthunt =By.xpath("//li[@routerlink='/TalentHunt2020']");
	private static By linkGlobaloffering =By.xpath("//li[@routerlink='/oneup-global-offering']");
	
	private static By linkDemotest =By.xpath("//li[@routerlink='/auth/registration']");
	private static By btnRegister =By.xpath("//button[@class='btn btn-success']");
	private static By linkMyStudy =By.xpath("//a[@class='nav-link pointer text-uppercase active']");
	private static By linkMyRevision =By.xpath("//a[contains(text(),'MY REVISION')]");
	private static By linkMyTest=By.xpath("//a[contains(text(),'My Test')]");
	private static By linkMyReport =By.xpath("//a[contains(text(),'My Report')]");
	private static By linkRemedial =By.xpath(" //a[contains(text(),'Remedial')]");
	private static By linkMySchool =By.xpath("//a[contains(text(),'MY SCHOOL')]");
	private static By linkHomework =By.xpath("//a[contains(text(),'HOMEWORK')]");
	private static By linkProfile =By.xpath("//i[@class='fa fa-user-circle-o']");
	// QUICK Links
	
	
	public static List<String> listquicklink()    
	{ 	
		List<String> list = new ArrayList<String>();
		list.add("//h4[contains(text(),'Quick Links')]");
		list.add("//li[contains(text(),'Privacy Policy')]");
		list.add("//li[contains(text(),'Terms & Conditions')]");
		return(list);
	}

	public static List<String> listConnectWithUs()    
	{ 	
		List<String> list = new ArrayList<String>();
		list.add("//i[@class='fa fa-facebook-square']");
		list.add("//i[@class='fa fa-linkedin-square']");
		list.add("//i[@class='fa fa-youtube-square']");
		list.add("//i[@class='fa fa-twitter-square']");
		list.add("//i[@class='fa fa-instagram']");
		return(list);
	}
	
	public static List<String> lisDownloadOneUpApp()    
	{ 	
		List<String> list = new ArrayList<String>();
		list.add("//div[@class='social-media-icons mobile-app-icons']//ul//li//a//img");
		list.add("//div[@class='social-media-icons mobile-app-icons']//ul");
		return(list);
	}

	
	  public static List<String> myNumbers()    {
		    List<String> numbers = new ArrayList<String>();
		    numbers.add("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
		    numbers.add("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[3]/center[1]/input[1]");
		    return(numbers);
		   }
	

	private static By txtquicklink =By.xpath("//h4[contains(text(),'Quick Links')]");
	private static By linkPrivacy =By.xpath("//li[contains(text(),'Privacy Policy')]");
	private static By linkTermsandConditions =By.xpath("//li[contains(text(),'Terms & Conditions')]");
	//Connect With Us
	private static By txtConnectWithUs =By.xpath("//h4[contains(text(),'Connect With Us')]");
	private static By linkfacebook =By.xpath("//i[@class='fa fa-facebook-square']");
	private static By linklinkedin =By.xpath("//i[@class='fa fa-linkedin-square']");
	private static By linkyoutube =By.xpath("//i[@class='fa fa-youtube-square']");
	private static By linktwitter =By.xpath("//i[@class='fa fa-twitter-square']");
	private static By linkinstagram =By.xpath("//i[@class='fa fa-instagram']");
	
	//Download OneUp App
	private static By txtDownload =By.xpath("//h4[contains(text(),'Download OneUp App')]");
	private static By linkAndroid =By.xpath("//div[@class='social-media-icons mobile-app-icons']//ul//li//a//img");
	private static By linkIOS =By.xpath("//div[@class='social-media-icons mobile-app-icons']//ul");
	
	private static WebDriver driver1  = DriverFactory.getDriver();

	public static HashMap<String, String> studentHomePageElements = new HashMap<String, String>();
	
	
	
	public ProfilePageObject() {
		System.out.print("*************************************** Im an in the CONSTRUCTOR ***************************************" );
		studentHomePageElements.put("titleHomepageMath","//h3[contains(text(),'Mathematics')]");
		System.out.print( studentHomePageElements.get("titleHomepageMath"));
	}
	

	
	 	public static void navigate_profile() {
	 		ElementActions.click(btnDropDown);
	 		ElementActions.click(linkMyProfile);
		  }
	
		public static void validateHeader(String arg1) {
			System.out.print("Im an in the validateHeader/n");
			System.out.print("Expected :: "+arg1);
			String actPageHeader=ElementActions.getText(header);
			System.out.print("Actual :: "+actPageHeader);
			Assert.assertEquals(arg1, actPageHeader); 		
		}
		
		public static void updateProfile(String section, String roolno) {
	
			System.out.print("updateProfile methode" );
			ElementActions.sendKeys(inputSection, section);
			ElementActions.sendKeys(inputRollNumber, roolno);
			ElementActions.click(btnUpdate);
		}
		
		public static void validatGoSchool() {
//			try
//			{	
				ElementActions.getElement(btnGotoSchool).isDisplayed();
				ElementActions.click(btnGotoSchool);
//			}
//			catch(Exception e){
//				System.out.println("Error while validating the Links on Home Page screen.");
//				e.printStackTrace();
//			 }
		}
		
		public static void validatUpdateButton() {
//			try
//			{	
				ElementActions.getDriver().findElement(btnUpdate);
				ElementActions.getElement(btnUpdate).isEnabled();
//			}
//			catch(Exception e){
//				System.out.println("Error while validating the Links on Home Page screen.");
//				e.printStackTrace();
//			 }
		}
			
		
		public static void clearFields() {
//			try
//			{	
				ElementActions.getDriver().findElement(inputSection).clear();
				ElementActions.getDriver().findElement(inputRollNumber).clear();
				ElementActions.sendKeys(inputSection, Keys.BACK_SPACE);
				ElementActions.sendKeys(inputRollNumber, Keys.BACK_SPACE);
				ElementActions.click(btnUpdate);
//				System.out.println("Validate update button ");
//				System.out.println(ElementActions.getElement(btnUpdate).isEnabled());
				
//				
//			}
//			catch(Exception e){
//				System.out.println("Error while validating the Links on Home Page screen.");
//				e.printStackTrace();
//			 }
		}
		
		public static void validateMandatoryMsg() {
//			try
//			{	
				ElementActions.getDriver().findElement(msgRollno).isDisplayed();
				ElementActions.getDriver().findElement(msgSection).isDisplayed();
				
//			}
//			catch(Exception e){
//				System.out.println("Error while validating the Links on Home Page screen.");
//				e.printStackTrace();
//			 }
		}

	

}
