package oneup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.ElementActions;
import driverfactory.DriverFactory;

public class StudentHomeworkPageObject {
	//Page Factory - Object Repository
	
	private static By homeworkUrl =By.xpath("//a[text()=' HOMEWORK ']");
	private static By downloadUrl =By.xpath("//a[text()='Download WorkSheet']");
	private static By UploadUrl =By.xpath("//input[@id='file']");
	private static By browseFile=By.xpath("//input[@id='file']");
	private static By uploadButton=By.xpath("//button[@type='button' and @class='btn btn-success']");	
	private static WebDriver driver1  = DriverFactory.getDriver();
				
				public static String verifyHomePageTitle() {
					 return ElementActions.getDriver().getTitle();
				}
				public static void clickHomeworkLink() {
					
					try {
						
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ElementActions.getElement(homeworkUrl).click();
					
				}
				
				public static void clickDownloadLink() {
					//boolean answer=downloadUrl.isDisplayed();
					WebDriverWait wait = new WebDriverWait(driver1,30);
					wait.until(ExpectedConditions.elementToBeClickable(ElementActions.getElement(downloadUrl)));
					ElementActions.getElement(downloadUrl).click();
					//Actions act =  new Actions(driver);
					//act.moveToElement(downloadUrl).click().perform();
					//downloadUrl.click();
					//TestBase.driver.switchTo().window("OneUp-Adaptive Assessment Test");
					
					
				}

				public static void clickUploadLink() {
					WebDriverWait wait = new WebDriverWait(driver1,30);
					wait.until(ExpectedConditions.elementToBeClickable(ElementActions.getElement(UploadUrl)));
					ElementActions.getElement(UploadUrl).click();	
					ElementActions.getElement(browseFile).sendKeys("C:\\Users\\krant\\eclipse-workspace\\BddPractice\\MyAnswer.docx");
					wait.until(ExpectedConditions.elementToBeClickable(uploadButton));
					ElementActions.getElement(uploadButton).click();
				}
}
