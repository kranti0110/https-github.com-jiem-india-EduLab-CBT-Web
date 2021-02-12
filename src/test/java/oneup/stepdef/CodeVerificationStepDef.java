package oneup.stepdef;


import java.util.List;
import java.util.Map;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.CodeVerificationPageObject;
import oneup.pages.RegistrationPageObject;

public class CodeVerificationStepDef
{
	@Then("^verify the codeVerificationPageHeader as \"([^\"]*)\"$")
	public void verify_the_codeVerificationPageHeader_as(String arg1) throws Throwable {
		CodeVerificationPageObject.validateCodeVerificationPageHeader("CODE VERIFICATION");
	}
	
	
	   	
	
	    
}

	   
	


