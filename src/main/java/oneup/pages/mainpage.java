package oneup.pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class mainpage {

	WebDriver driver;
	WebDriverWait wait;
	
	//comment the above 2 lines and uncomment below 2 lines to use Chrome
	//System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	
	public mainpage(WebDriver driver){
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver,15);
	}
	
	//abstract methods
	public abstract String getPageTitle();
	
	public abstract String getPageHeader(By locator);
	
	public abstract WebElement getElement(By locator);
	
	
	public abstract void waitForElementPresent(By locator);
	
	public abstract void waitForPageTitle(String title);
	
	
	//generics methods 
	public <Tmainpage extends Basemainpage> Tmainpage getInstance(Class<Tmainpage> pageClass){
		
		try{
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);	
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}
	
	
}
