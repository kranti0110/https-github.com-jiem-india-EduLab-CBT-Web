/**
 * 
 */
package oneup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author amruta bisain
 *
 */
public class LoginPage extends Basemainpage{

	//page locators
	private By emailid =By.id("loginEmail");
	private By password =By.id("loginPassword");
//	private By captcha =By.className("rc-anchor-center-item rc-anchor-checkbox-holder");
	private By captcha =By.xpath("//span[@class = 'recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-expired']");
	private By loginButton =By.id("btn btn-success");
	private By header = By.id("product-form-title");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}



	// Getter for the login page

	/**
	 * @return the emailid
	 */
	public WebElement getEmailid() {
		return getElement(emailid);
	}



	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}


	/**
	 * @return the captcha
	 */
	public WebElement getCaptcha() {
		return getElement(captcha);
	}

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}

	public String getLoginPageTitle(){
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	/**
	 * 
	 * @param usernamr
	 * @param pwd
	 * @return
	 */
	public HomePageObject doLogin (String username,String pwd){
		getEmailid().sendKeys(username);
		getPassword().sendKeys(pwd);
		
		
//		getCaptcha().click();
		getLoginButton().click();
		return getInstance(HomePageObject.class);
	}



	/**
	 * 
	 * @return
	 */
	public HomePageObject doLogin (){
		getEmailid().sendKeys("");
		getPassword().sendKeys("");
//		getCaptcha().click();
		getLoginButton().click();
		return getInstance(HomePageObject.class);
	}
	
	//username : amruta@gmail.com
	public void doLogin (String userCred){
		if (userCred.contains("username"))
		{
			getEmailid().sendKeys(userCred.split(":")[1].trim());
		}else if (userCred.contains("password")) {
			getEmailid().sendKeys(userCred.split(":")[1].trim());
		}
		
		getLoginButton().click();
	}
	
}
	
