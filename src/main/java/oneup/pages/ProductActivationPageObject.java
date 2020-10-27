package oneup.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import actions.ElementActions;
import junit.framework.Assert;

public class ProductActivationPageObject {
	
	public static int sleep  =5000;
	private static By btnDropDown = By.xpath("//app-header/div[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/i[1]");
	private static By linkProductActication = By.xpath("//app-header/div[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[1]/a[1]");
	private static By header = By.xpath("//h3[contains(text(),'PRODUCT ACTIVATION')]");
	private static By inputUserKey =By.xpath("//input[@id='userKey']");
	private static By inputProductKey =By.xpath("//input[@id='productKey']");
	private static By btnRegister =By.xpath("//button[contains(text(),'REGISTER')]");
	private static By btnGotoProfile =By.xpath("//button[contains(text(),'GO TO MY PROFILE')]");
	
	private static By lnkMoreDetails =By.xpath("//a[contains(text(),'click here')]");
	
	private static By msgProductKey =By.xpath("//div[contains(text(),'Product key is required')]");
	private static By msgUserKey =By.xpath("//div[contains(text(),'User key is required')]");
	private static By msgValidKey =By.xpath("//span[contains(text(),'Please enter a valid product key')]");
	private static By msgMultipleTimes =By.xpath("//span[contains(text(),'You cannot register the same product multiple time')]");
	private static String msgContactSoon = "Our team will contact you shortly";
	
	public static void validateProductHeader(String arg1) {
		System.out.print("Im an in the validateHeader/n");
		System.out.print("Expected :: "+arg1);
		String actPageHeader=ElementActions.getText(header);
		System.out.print("Actual :: "+actPageHeader);
		Assert.assertEquals(arg1, actPageHeader); 		
	}

	 	public static void navigateActivationPage() {
	 		ElementActions.click(btnDropDown);
	 		ElementActions.click(linkProductActication);
		  }
	
		
		public static void updateProductKey(String productkey, String userkey) {
	
			System.out.print("updateProfile methode" );
			ElementActions.sendKeys(inputProductKey, productkey);
			ElementActions.sendKeys(inputUserKey, userkey);
			ElementActions.click(btnRegister);
		}
		
		public static void validatGotoProfile() {

				ElementActions.getElement(btnGotoProfile).isDisplayed();
				ElementActions.click(btnGotoProfile);

		}
		
		public static void validatRegisterButton() {

				ElementActions.getDriver().findElement(btnRegister);
				ElementActions.getElement(btnRegister).isEnabled();

		}
			
		
		public static void clearFields() {
				ElementActions.getDriver().findElement(inputUserKey).clear();
				ElementActions.getDriver().findElement(inputProductKey).clear();
				ElementActions.click(btnRegister);

		}
		
		public static void validateMandatoryMsg() {

				ElementActions.getDriver().findElement(msgProductKey).isDisplayed();
				ElementActions.getDriver().findElement(msgUserKey).isDisplayed();

		}
		public static void validateValidKeyMsg() {

			ElementActions.getDriver().findElement(msgValidKey).isDisplayed();
		}

		public static void validateMultipleTimesMsg() {

			ElementActions.getDriver().findElement(msgMultipleTimes).isDisplayed();
		}
	

}
