package oneup.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import org.junit.Assert;

public class Demo {
	WebDriver driver = null;

	@Given("Student is on oneup login page")
	public void Student_is_on_oneup_login_page() {
		System.out.println("Inside - Student is on oneup login page");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://oneuptest.net/#/auth/login");
		
	}

	@When("Student enters valid username and password")
	public void student_enters_valid_username_and_password() {
		System.out.println("Inside - student enter valid user and pass");
		driver.findElement(By.xpath("//input[@id = 'loginEmail']")).sendKeys("abhinavpandey104@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'loginPassword']")).sendKeys("Talent@123");	
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside - clicks on login button");
		driver.findElement(By.xpath("//button[@class = 'btn btn-success']")).click();
	}

	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
		System.out.println("Inside user navigates to home page");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String CurntURL = driver.getCurrentUrl();
		System.out.println(CurntURL);
		Assert.assertEquals("http://oneuptest.net/#/student/demo-study", CurntURL);
		
	}
	
	// Running Scenario - 1
	
	@Given("Student is on demo study tab and clicks on Test Tab")
	public void student_is_on_demo_study_tab_and_clicks_on_test_tab() {
		driver.findElement(By.xpath("//li[@class='nav-item'][1]")).click();
	}
	
	@Then("user navigates to Demo test tab")
	public void user_navigates_to_demo_test_tab() {
		String TestCurntURL = driver.getCurrentUrl();
		System.out.println(TestCurntURL);
		Assert.assertEquals("http://oneuptest.net/#/student/home", TestCurntURL);
		
	}
	
	@And("clicks on yellow strip link")
	public void clicks_on_yellow_strip_link( ) {
		driver.findElement(By.xpath("//span[text() = ' CLICK HERE TO ACTIVATE PRODUCT ']")).click();
		String prod_page_link = driver.getCurrentUrl();
		Assert.assertEquals("http://oneuptest.net/#/student/register-product", prod_page_link);
		driver.close();
	}
	
	
	// Running scenario - 2
	@Given("Student is on demo test tab and clicks on report tab")
	public void Student_is_on_demo_test_tab_and_clicks_on_report_tab() {
		driver.findElement(By.xpath("//li[@class='nav-item'][2]")).click();
	}
	
	@Then("student navigates to Demo report tab")
	public void student_navigates_to_Demo_report_tab() {
	
		String CrntURL = driver.getCurrentUrl();
		Assert.assertEquals("http://oneuptest.net/#/student/demo-reports", CrntURL);
	}
	
	@And("clicks on view result")
	public void clicks_on_view_result() {
//		driver.findElement(By.xpath("//h5")).click(); Focus is changing thats why commented
		System.out.println("Inside- clicks on view result");
	}

	@Then("user should redirect to sample pdf report")
	public void user_should_redirect_to_sample_pdf_report() {
		System.out.println("Inside - user should redirect to sample pdf report");
		String curntURL = driver.getCurrentUrl();
		System.out.println(curntURL);
		driver.close();
	}
	
	//Running scenario - 3
	@Given ("Student is on demo report tab and clicks on remedial tab")
	public void Student_is_on_demo_report_tab_and_clicks_on_remedial_tab() {
		driver.findElement(By.xpath("//li[@class='nav-item'][3]")).click();
	}
	
	@Then("Student navigates to Demo remedial tab")
	public void Student_navigates_to_Demo_remedial_tab() {
		String CurntURL = driver.getCurrentUrl();
		Assert.assertEquals("http://oneuptest.net/#/student/demo-remedial", CurntURL);
	}
	
	@And("Matches the text on webpage")
	public void Matches_the_text_on_webpage() {
		String remedial_actual_txt = driver.findElement(By.xpath("//div[@class='pt-4']")).getText();
		String remedial_expected_txt = "Remedial data is not available. You can see remedial details in this section, once you complete your test(s).";
		Assert.assertEquals(remedial_actual_txt, remedial_expected_txt );
		driver.close();
	}

	
	//Code for scenario 4
	@When("Student logged in oneup portal and clicks on profile icon")
	public void Student_logged_in_oneup_portal_and_clicks_on_profile_icon() {
		driver.findElement(By.xpath("//div[@class='profile-area']")).click();
	}
	
	@Then("Profile options should be visibile")
	public void Profile_options_should_be_visibile() {
		driver.findElement(By.xpath("//i[@class='fa fa-user-circle-o']")).click();;
		
		WebElement xpath_prod_active = driver.findElement(By.xpath("//li[@role= 'menuitem'][1]"));
		
		String txt = xpath_prod_active.getText();
		System.out.println(txt);
		Assert.assertEquals("Product Activation", txt);
//		xpath_prod_active.click();
//		String prod_page_link = driver.getCurrentUrl();
//		Assert.assertEquals("http://oneuptest.net/#/student/register-product", prod_page_link);
//		driver.navigate().back();
	
		//Getting text of My profile 
		WebElement xpath_my_profile = driver.findElement(By.xpath("//li[@role= 'menuitem'][2]"));
		String profile_txt = xpath_my_profile.getText();
		System.out.println(profile_txt);
		Assert.assertEquals("My Profile", profile_txt);
		
		//Getting text of logout
		WebElement xpath_logout = driver.findElement(By.xpath("//li[@role= 'menuitem'][14]"));
		String logout_txt = xpath_logout.getText();
		System.out.println(logout_txt);
		Assert.assertEquals("Log Out", logout_txt);
		driver.close();
		
	}
	
}

