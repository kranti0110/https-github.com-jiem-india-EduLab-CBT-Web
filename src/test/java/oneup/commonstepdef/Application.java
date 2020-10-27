package oneup.commonstepdef;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import driverfactory.DriverFactory;
import helper.AUTApplication;
import oneup.report.Reporter;

public class Application {
	
	private static By ignoreScreen = By.xpath("//div[@class='container-fluid home-banner-area']//div[@class='col-md-12']");

	@Given("^Open \"([^\"]*)\"$")
	public void open(String arg1) throws Throwable {
		

		
		System.out.print("Oneup:Application :Im an in the Application --open " );
		
		AUTApplication.openAutApplication(arg1);
		Reporter.addInformation("Applciation Launch", arg1);
//		
//		
//		String parent = DriverFactory.getDriver().getWindowHandle();;
//        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
//        WebElement push_to_create = wait.until(ExpectedConditions.elementToBeClickable(ignoreScreen));
//        push_to_create.sendKeys(Keys.ESCAPE).build().perform();

		Actions action = new Actions(DriverFactory.getDriver());
		action.sendKeys(Keys.ESCAPE).build().perform();
		System.out.print("Oneup:Application :Post the  openAutApplication statement " + arg1);

	}
}
