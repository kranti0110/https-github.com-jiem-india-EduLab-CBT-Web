/**
 * 
 */
package oneup.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import actions.ElementActions;
import driverfactory.DriverFactory;
import junit.framework.Assert;

/**
 * @author amruta bisain
 *
 */
public class HomePageObject extends Basemainpage{

	//page locators
	private static By linkOneup =By.xpath("//app-oneup-header/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]']");
	private static By linkAboutus =By.xpath("//li[@routerlink='/oneup-about-us']");
	private static By linkTalenthunt =By.xpath("//li[@routerlink='/TalentHunt2020']");
	private static By linkGlobaloffering =By.xpath("//li[@routerlink='/oneup-global-offering']");
	private static By header = By.xpath(" //body//h1[1]");
	private static By linkDemotest =By.xpath("//li[@routerlink='/auth/registration']");
	private static By btnRegister =By.xpath("//button[@class='btn btn-success']");
	private static By titleHomepageMath = By.xpath("//h3[contains(text(),'Mathematics')]");
	private static By titleHomepageScience = By.xpath("//h3[contains(text(),'Science')]");
	private static By ignoreScreen = By.xpath("//div[@class='container-fluid home-banner-area']//div[@class='col-md-12']");
	public static int sleep  =2000;
	
	
	
	public static List<String> listMenuLinks()    
	{ 	
		List<String> list = new ArrayList<String>();
		//list.add("/html[1]/body[1]/app-root[1]/app-oneup-home[1]/app-oneup-header[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]");
		list.add("//a[contains(text(),'About Us')]");
		list.add("//a[contains(text(),'Talent Hunt 2020')]");
		list.add("//a[contains(text(),'Global Offering')]");
		list.add("//a[contains(text(),'Login')]");
		list.add("//button[contains(text(),'Register')]");
		return(list);
	}
	
	
	public static List<String> listquicklink()    
	{ 	
		List<String> list = new ArrayList<String>();
		list.add("//a[contains(text(),'Contact Us')]");
		list.add("//li[contains(text(),'Privacy Policy')]");
		list.add("//li[contains(text(),'Terms & Conditions')]");
		return(list);
	}

	public static List<String> listConnectWithUs()    
	{ 	
		List<String> list = new ArrayList<String>();
		list.add("/html[1]/body[1]/app-root[1]/app-oneup-home[1]/app-oneup-footer[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/i[1]");
		list.add("/html[1]/body[1]/app-root[1]/app-oneup-home[1]/app-oneup-footer[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/i[1]");
		list.add("//body/app-root[1]/app-oneup-home[1]/app-oneup-footer[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]/i[1]");
		list.add("/html[1]/body[1]/app-root[1]/app-oneup-home[1]/app-oneup-footer[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/i[1]");
		list.add("/html[1]/body[1]/app-root[1]/app-oneup-home[1]/app-oneup-footer[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]/i[1]");
		return(list);
	}
	
	public static List<String> lisDownloadOneUpApp()    
	{ 	
		List<String> list = new ArrayList<String>();
		list.add("/html[1]/body[1]/app-root[1]/app-oneup-home[1]/app-oneup-footer[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/img[1]");
		list.add("/html[1]/body[1]/app-root[1]/app-oneup-home[1]/app-oneup-footer[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]");
		return(list);
	}
	

	
	public HomePageObject(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getHeader() {
		return getElement(header);
	}
	
	//Page actions
	public String getHomePageHeader() {
		return getPageHeader(header);
	}
	public String getHomePageTitle(){
		System.out.println("IN THE oneUpHomePage.JAVA ");
		return getPageTitle();
	}
	public WebElement getLinkDemotest() {
		return getElement(linkDemotest);
	}
	
	public WebElement getLinkOneup() {
		return getElement(linkOneup);
	}

	public WebElement getLinkAboutus() {
		return getElement(linkAboutus);
	}
	
	public WebElement getLinkTalenthunt() {
		return getElement(linkTalenthunt);
	}
	
	public WebElement getLinkGlobaloffering() {
		return getElement(linkGlobaloffering);
	}
	
	public WebElement getBtnRegister() {
		return getElement(btnRegister);
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

	public static  void validateMainMenuAccess() throws InterruptedException {
		try
		{
			Actions action = new Actions(DriverFactory.getDriver());
			System.out.println("********************* validateMainMenuAccess Home Page screen.*********************");
			System.out.println(listMenuLinks().size());
			System.out.println(StringUtils.substringBetween(listMenuLinks().get(0), "'", "'"));
		
			for (int i = 0; i < listMenuLinks().size(); i++) 
			{
				System.out.println(listMenuLinks().get(i));
				ElementActions.getDriver().findElement(By.xpath(listMenuLinks().get(i))).click();
				Thread.sleep(sleep);
				ElementActions.getDriver().manage().timeouts().implicitlyWait(sleep, TimeUnit.SECONDS);
				ElementActions.getDriver().navigate().back();
				Thread.sleep(sleep);
				action.sendKeys(Keys.ESCAPE).build().perform();
				Thread.sleep(sleep);
			}
		
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
	
	
	
	public static void ignoreSceen() {
		ElementActions.click(ignoreScreen);
	
	}
}
