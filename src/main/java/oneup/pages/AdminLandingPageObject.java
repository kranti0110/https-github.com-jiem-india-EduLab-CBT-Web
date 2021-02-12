package oneup.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import actions.ElementActions;

public class AdminLandingPageObject {

	public static int sleep  =5000;
	private static  By masterdatamenu =By.xpath("//body/app-root[1]/app-admin-home[1]/div[1]/div[1]/div[1]/app-side-menu[1]/aside[1]/div[3]/ul[1]/li[3]/a[1]");	
	private static  By exammenu  =By.xpath("/html/body/app-root/app-admin-home/div/div/div[1]/app-side-menu/aside/div[3]/ul/div[1]/ul/li[3]");

	private static By usermenu = By.xpath("//span[@class='fa fa-users mr-2']");
	private static By product_manag_xpath = By.xpath("//span[@class='fa fa-product-hunt mr-2']");
	private static By exam_unlock_manag_xpath = By.xpath("//span[@class='fa fa-unlock-alt mr-2']");
	private static By school_manag_xpath = By.xpath("//span[@class='fa fa-university mr-2']");

	private static By productKeyManagement = By.xpath("//body/app-root[1]/app-admin-home[1]/div[1]/div[1]/div[1]/app-side-menu[1]/aside[1]/div[3]/ul[1]/li[7]/a[1]");
	
	private static By examTemplateManagement = By.xpath("(//li)[7]");
	
	public static void navigate_exam() {
		ElementActions.click(masterdatamenu);
		
		List<WebElement> text = ElementActions.getDriver().findElements(exammenu);
		text.get(0).click();
	}
	

	public static void navigate_user() {
		ElementActions.click(masterdatamenu);
		ElementActions.getDriver().findElement(usermenu).click();
		
	}
	
	public static void navigate_prod_key_manag() {
		ElementActions.getDriver().findElement(product_manag_xpath).click();
	}
	
	public static void navigate_exam_unlock_management() {
		ElementActions.getDriver().findElement(exam_unlock_manag_xpath).click();
	}
	
	public static void navigate_school_management() {
		ElementActions.click(masterdatamenu);
		ElementActions.getDriver().findElement(school_manag_xpath).click();
	}
	
	public static void navigate_exam_template_management() {
		ElementActions.click(masterdatamenu);
		ElementActions.click(examTemplateManagement);
	}
	

	public static void navigate_productKeyManagement() {
		ElementActions.getDriver().findElements(productKeyManagement);
		ElementActions.click(productKeyManagement);

	}
	
	
	
	
}
