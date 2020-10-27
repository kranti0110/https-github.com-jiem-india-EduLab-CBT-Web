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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import actions.ElementActions;
import driverfactory.DriverFactory;
import junit.framework.Assert;

public class StudentHomePagePageObject {
	
	public static int sleep  =3000;
	private static By titleHomepageMath = By.xpath("//h3[contains(text(),'Mathematics')]");
	private static By titleHomepageScience = By.xpath("//h3[contains(text(),'Science')]");
	private static By txtInvalidUser =By.xpath("//span[contains(text(),'Invalid username or password')]");
	private static By rptBoxMathscontent =By.xpath("//h5[contains(text(),'Multiplication of Integers - Introduction')]");
	private static By rptBoxSciencecontent =By.xpath(" //h5[contains(text(),'Introduction to Motion')]");
	private static By modelWindow =By.xpath("//div[@class='modal-body']");
	private static By modelWindowClose =By.xpath("//button[@class='close pointer']");
	private static By modelWindowFrame =By.xpath("//div[@class='modal-body']//iframe");
	private static By linkOneup =By.xpath("//li[@class='nav-item active']");
	private static By linkAboutus =By.xpath("//li[@routerlink='/oneup-about-us']");
	private static By linkTalenthunt =By.xpath("//li[@routerlink='/TalentHunt2020']");
	private static By linkGlobaloffering =By.xpath("//li[@routerlink='/oneup-global-offering']");
	private static By header = By.xpath(" //body//h1[1]");
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
	
	
	
	public StudentHomePagePageObject() {
		System.out.print("*************************************** Im an in the CONSTRUCTOR ***************************************" );
		studentHomePageElements.put("titleHomepageMath","//h3[contains(text(),'Mathematics')]");
		System.out.print( studentHomePageElements.get("titleHomepageMath"));
	}
	

	public static void validateNumberofScienceTopics() throws InterruptedException{
		System.out.print("Im an in the validateNumberofScienceTopics" );
		ElementActions.getDriver().manage().timeouts().implicitlyWait(sleep, TimeUnit.SECONDS);
		ElementActions.getDriver().findElement(rptBoxSciencecontent);
		ElementActions.doubleclick(rptBoxSciencecontent);
		Thread.sleep(700);
		displayPopup();
	}

	
	
	public static void validateNumberofMathsTopics() throws InterruptedException {
		System.out.print("Im an in the validateNumberofMathsTopics" );
		ElementActions.getDriver().manage().timeouts().implicitlyWait(sleep, TimeUnit.SECONDS);
		ElementActions.getDriver().findElement(rptBoxMathscontent);
		ElementActions.doubleclick(rptBoxMathscontent);
		Thread.sleep(700);
		displayPopup();

	}
	
	public static void waitTillenabled (By item) {
		WebDriverWait wait = new WebDriverWait(driver1, sleep);
		wait.until(ExpectedConditions.elementToBeClickable(item));
	}
	
	
	 public static Popup displayPopup() {
		    WebElement displayPopupButton = ElementActions.getDriver().findElement(modelWindow);
		    displayPopupButton.click();
		    return new Popup(driver1);
		  }
	
	public static void validateMath(String expected) {
		System.out.print("Im an in the validateTitle" );
		String actual = ElementActions.getText(titleHomepageMath);
//		String actual = ElementActions.getText(header);
		System.out.print(actual );
		Assert.assertEquals(expected, actual);
	}
	
	public static void validateScience(String expected) {
		System.out.print("Im an in the validateTitle" );
		String actual = ElementActions.getText(titleHomepageScience);
//		String actual = ElementActions.getText(header);
		System.out.print(actual );
		Assert.assertEquals(expected, actual);
	}
	
	public static void validateError(String expected) {
		System.out.print("Im an in the validateTitle" );
		String actual = ElementActions.getText(txtInvalidUser);
//		String actual = ElementActions.getText(header);
		System.out.print(actual );
		Assert.assertEquals(expected, actual);
	}

	public static String viewFrame() {
	    WebElement doneLabel = driver1.findElement(modelWindowFrame);
	    System.out.print(doneLabel );
	    System.out.print(" ####################################### I am in viewFrame method ####################################### "  );
	    System.out.print(doneLabel.getText());
	    System.out.print(doneLabel.getTagName());
	    System.out.print(doneLabel.getAttribute("href"));
	    return doneLabel.getTagName();
	  }

	public static void validateFrame() throws InterruptedException {
		System.out.print(" ####################################### I am in validateFrame method ####################################### "  );
		System.out.print(viewFrame());
		Assert.assertTrue(viewFrame().contains("frame"));
		displayPopup().close();
	  }
	
	
	public static void validateLinks() {
	try
		{
			ElementActions.getElement(linkMyStudy).isDisplayed();
			ElementActions.getElement(linkMyRevision).isDisplayed();
			ElementActions.getElement(linkMyTest).isDisplayed();
			ElementActions.getElement(linkMyReport).isDisplayed();
			ElementActions.getElement(linkRemedial).isDisplayed();
			ElementActions.getElement(linkMySchool).isDisplayed();
			ElementActions.getElement(linkHomework).isDisplayed();
			ElementActions.getElement(linkProfile).isDisplayed();
		}
	 catch(Exception e){
		System.out.println(" Error while validating the Links on Home Page screen.");
		e.printStackTrace();
	 }
	}
	
	public static void validateQuickLinks() {
	try
		{
			ElementActions.getElement(txtquicklink).isDisplayed();
			ElementActions.getElement(linkPrivacy).isDisplayed();
			ElementActions.getElement(linkTermsandConditions).isDisplayed();

		}
	 catch(Exception e){
		System.out.println(" Error while validating the Links on Home Page screen.");
		e.printStackTrace();
	 }
	}
	
	public static void validateConnectWithUs() {
	try
		{
			ElementActions.getElement(txtConnectWithUs).isDisplayed();
			ElementActions.getElement(linkfacebook).isDisplayed();
			ElementActions.getElement(linklinkedin).isDisplayed();
			ElementActions.getElement(linkyoutube).isDisplayed();
			ElementActions.getElement(linktwitter).isDisplayed();
			ElementActions.getElement(linkinstagram).isDisplayed();
		}
	 catch(Exception e){
		System.out.println(" Error while validating the Links on Home Page screen.");
		e.printStackTrace();
	 }
	}
	
	public static void validateDownloadApps() {
	try
		{
			ElementActions.getElement(txtDownload).isDisplayed();
			ElementActions.getElement(linkPrivacy).isDisplayed();
			ElementActions.getElement(linkAndroid).isDisplayed();
		}
	 catch(Exception e){
		System.out.println(" Error while validating the Links on Home Page screen.");
		e.printStackTrace();
	 }
	}
	
	
	public static  void validateQuickLinksAccess() throws InterruptedException {
		try
		{
			System.out.println("********************* validateQuickLinksAccess Student Home Page screen.*********************");
			System.out.println(listquicklink().size());
			System.out.println(StringUtils.substringBetween(listquicklink().get(0), "'", "'"));
		
			for (int i = 0; i < listquicklink().size(); i++) 
			{
				System.out.println(listquicklink().get(i));
				ElementActions.getDriver().findElement(By.xpath(listquicklink().get(i))).click();
				Thread.sleep(sleep);
				ElementActions.getDriver().manage().timeouts().implicitlyWait(sleep, TimeUnit.SECONDS);
				ElementActions.getDriver().navigate().back();
				Thread.sleep(sleep);
			}
		
		  }
		 catch(Exception e){
			System.out.println(" Error while validating the Links on Home Page screen.");
			e.printStackTrace();
		 	}
	}

	public static  void validateConnectWithUsAccess() throws InterruptedException {
		try
		{
			System.out.println("********************* validateConnectWithUsAccess Student Home Page screen.*********************");
			System.out.println(listConnectWithUs().size());
			System.out.println(StringUtils.substringBetween(listConnectWithUs().get(0), "'", "'"));
		
			for (int i = 0; i < listConnectWithUs().size(); i++) 
			{
				System.out.println(listConnectWithUs().get(i));
				ElementActions.getDriver().findElement(By.xpath(listConnectWithUs().get(i))).click();
				Thread.sleep(sleep);
				ElementActions.getDriver().manage().timeouts().implicitlyWait(sleep, TimeUnit.SECONDS);
				ElementActions.getDriver().navigate().back();
				Thread.sleep(sleep);
			}
		
		  }
		 catch(Exception e){
			System.out.println(" Error while validating the Links on Home Page screen.");
			e.printStackTrace();
		 	}
	}
	
	
	
	public static  void validateDownloadOneUpAppAccess() throws InterruptedException {
		try
		{
			System.out.println("********************* validateDownloadOneUpAppAccess Student Home Page screen.*********************");
			System.out.println(lisDownloadOneUpApp().size());
			System.out.println(StringUtils.substringBetween(lisDownloadOneUpApp().get(0), "'", "'"));
		
			for (int i = 0; i < lisDownloadOneUpApp().size(); i++) 
			{
				System.out.println(lisDownloadOneUpApp().get(i));
				ElementActions.getDriver().findElement(By.xpath(lisDownloadOneUpApp().get(i))).click();
				Thread.sleep(sleep);
				ElementActions.getDriver().manage().timeouts().implicitlyWait(sleep, TimeUnit.SECONDS);
				ElementActions.getDriver().navigate().back();
				Thread.sleep(sleep);
			}
		
		  }
		 catch(Exception e){
			System.out.println(" Error while validating the Links on Home Page screen.");
			e.printStackTrace();
		 	}
	}
	
	
	public static void click_link(By link) {
		
		System.out.print("Im an in the click_link " );
		ElementActions.click(link);
		System.out.print( studentHomePageElements.get("titleHomepageMath"));
	}
	
	

}
