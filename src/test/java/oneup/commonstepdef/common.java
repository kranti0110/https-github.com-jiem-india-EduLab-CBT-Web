package oneup.commonstepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverfactory.DriverFactory;

public class common {
	
	WebDriverWait wait = new WebDriverWait( DriverFactory.getDriver(),15);
	
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	}

	public WebElement getElement(By locator){
		WebElement element = null;
		try {
			waitForElementPresent(locator);
			element = DriverFactory.getDriver().findElement(locator);
			return element;
		}
		catch(Exception e){
			System.out.println(" Error while creating the element "+ locator.toString());
			e.printStackTrace();
		}
		return element;
	}

	public void waitForElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		}
	catch(Exception e){
		System.out.println(" Error occoured while waiting the element "+ locator.toString());
		e.printStackTrace();
	}
	
	}


	public void waitForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		}
	catch(Exception e){
		System.out.println(" Error occoured while waiting the title "+ title);
		e.printStackTrace();
	}
	
	}


}
