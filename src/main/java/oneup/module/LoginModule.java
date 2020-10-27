package oneup.module;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;

import actions.ElementActions;
import driverfactory.DriverFactory;
import helper.JIEMTestDataPortal;
import oneup.pages.LoginPage;
import oneup.pages.LoginPageObject;
import vo.Credential;

public class LoginModule {

	private static By ignoreScreen = By.xpath("//div[@class='container-fluid home-banner-area']//div[@class='col-md-12']");

		public static void login(String cred) {
			
			
//			ElementActions.click(ignoreScreen);
			
//			WebDriver driver = null;
//			ElementActions.sendKeys(Keys.ESCAPE, "arg1");
//			Object driver = null;
//			Actions action = new Actions((WebDriver) driver);
//			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.print("OneUP:LoginModule: Im an in the LoginModule.java class" );
			Credential credObj = JIEMTestDataPortal.getCredential(cred);
			
//			WebDriver driver = DriverFactory.getDriver();
//			LoginPage lg = new LoginPage(driver);
			LoginPageObject.login(credObj.getUsername(), credObj.getPassword());
			
		
	}

}
