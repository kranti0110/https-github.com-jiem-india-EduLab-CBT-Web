package oneup.stepdef;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import oneup.pages.StudentHomePagePageObject;

public class StudentHomePageStepDef {

	
	@Then("^verify the available quickLinks on student home page$")
	public void verify_the_available_quickLinks_on_student_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		StudentHomePagePageObject.validateQuickLinks();
	}

	@Then("^verify the quickLinks can be accessed on student home page$")
	public void verify_the_quickLinks_can_be_accessed_on_student_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		StudentHomePagePageObject.validateQuickLinksAccess();
	}

	@Then("^verify the Connect With Us Links can be accessed on student home page$")
	public void verify_the_Connect_With_Us_Links_can_be_accessed_on_student_home_page() throws Throwable {
		StudentHomePagePageObject.validateConnectWithUsAccess();
	}
	
	@Then("^verify the download links can be accessed on student home page$")
	public void verify_the_download_links_can_be_accessed_on_student_home_page() throws Throwable {
		StudentHomePagePageObject.validateDownloadOneUpAppAccess();
	}
	
	@Then("^verify the available Connect With Us on student home page$")
	public void verify_the_available_Connect_With_Us_on_student_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		StudentHomePagePageObject.validateConnectWithUs();
	}

	@Then("^verify the available Download OneUp App on student home page$")
	public void verify_the_available_Download_OneUp_App_on_student_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		StudentHomePagePageObject.validateDownloadApps();
	}
	
	@Then("^verify the maths contents are available$")
	public void verify_the_maths_contents_are_available() throws Throwable {
		System.out.print("StudentHomePageStepDef:Im an in the StudentHomePageStepDef --verify_the_maths_contents_are_available " );
		StudentHomePagePageObject.validateNumberofMathsTopics();
		StudentHomePagePageObject.validateFrame();
	}	
	
	@Then("^verify the science contents are available$")
	public void verify_the_science_contents_are_available() throws Throwable {
		System.out.print("StudentHomePageStepDef:Im an in the StudentHomePageStepDef --verify_the_science_contents_are_available " );
		StudentHomePagePageObject.validateNumberofScienceTopics();
		StudentHomePagePageObject.validateFrame();
	}
	
	@Then("^verify the available links on student home page$")
	public void verify_the_available_links_on_student_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("StudentHomePageStepDef:Im an in the StudentHomePageStepDef --verify_the_available_links_on_student_home_page " );
		StudentHomePagePageObject.validateLinks();
	}
	
	
	@Then("^verify the link  \"([^\"]*)\"$")
	public void verify_the_link(String arg1, DataTable datatable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		   List<List<String>> ls  = datatable.raw();
		   for(List<String> l : ls) {
			   for(String h : l) {
				   System.out.println(h);
			   }
		   }
	}
	
}	
