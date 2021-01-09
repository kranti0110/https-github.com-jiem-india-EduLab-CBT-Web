package oneup.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import actions.ElementActions;

public class AdminLandingPageObject {

	public static int sleep  =5000;
	private static  By masterdatamenu =By.xpath("//body/app-root[1]/app-admin-home[1]/div[1]/div[1]/div[1]/app-side-menu[1]/aside[1]/div[3]/ul[1]/li[3]/a[1]");	
	private static  By exammenu  =By.xpath("/html/body/app-root/app-admin-home/div/div/div[1]/app-side-menu/aside/div[3]/ul/div[1]/ul/li[3]");
	private static By productKeyManagement = By.xpath("//body/app-root[1]/app-admin-home[1]/div[1]/div[1]/div[1]/app-side-menu[1]/aside[1]/div[3]/ul[1]/li[7]/a[1]");
	
	public static void navigate_exam() {
		ElementActions.click(masterdatamenu);
		
		List<WebElement> text = ElementActions.getDriver().findElements(exammenu);
		text.get(0).click();
	}
	
	public static void navigate_productKeyManagement() {
		ElementActions.getDriver().findElements(productKeyManagement);
		ElementActions.click(productKeyManagement);
		
		
		
		
	}
	
}
