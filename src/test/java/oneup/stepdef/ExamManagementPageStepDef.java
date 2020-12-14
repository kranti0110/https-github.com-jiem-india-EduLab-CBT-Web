package oneup.stepdef;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oneup.pages.AdminExamPageObject;
import oneup.pages.AdminLandingPageObject;

public class ExamManagementPageStepDef {

	@When("^User navigates to Exam page$")
	public void user_navigates_to_Exam_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AdminLandingPageObject.navigate_exam();
	}

	@When("^User clicks add new exam$")
	public void user_clicks_add_new_exam() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    AdminExamPageObject.addExam();
	}

	@Then("^verify the pageheader is \"([^\"]*)\"$")
	public void verify_the_pageheader_is(String title) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    AdminExamPageObject.validateTitle(title);
	}

	@Then("^User adds the valid data$")
	public void user_adds_the_valid_data(DataTable arg1) throws Throwable {
		List<Map<String, String>> list = arg1.asMaps(String.class, String.class);
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).get("Exam Type"));
//			System.out.println(list.get(i).get("Exam Template"));
//			System.out.println(list.get(i).get("Subject"));
//			System.out.println(list.get(i).get("Grade"));
//		}
		System.out.println("user_adds_the_valid_data"+ list);
		AdminExamPageObject.enterData(list);
	}
	
//	@Then("^User adds the valid data$")
//	public void user_adds_the_valid_data(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//		   List<List<String>> ls  = arg1.raw();
//		   for(List<String> l : ls) {
//			   for(String h : l) {
//				   System.out.println(h);
//			   }
//		   }
//		   AdminExamPageObject.enterData(ls);
//	}

	@Then("^the exam is saved succefully$")
	public void the_exam_is_saved_succefully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("the_exam_is_saved_succefully" );	
		
	}

	@Then("^the exam is saved succefully  \"([^\"]*)\"$")
	public void the_exam_is_saved_succefully(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AdminExamPageObject.validateSavedExam(arg1);
		System.out.print(arg1+ "the_exam_is_saved_succefully" );
	}

	
	
	@When("^User tries to search the exam \"([^\"]*)\"$")
	public void user_tries_to_search_the_exam(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print(arg1 + "user_tries_to_search_the_exam" );
	    AdminExamPageObject.searchExam(arg1);
	}
	
	@Then("^User gets the record$")
	public void user_gets_the_record(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		
//		List<Map<String, String>> list = arg1.asMaps(String.class, String.class);
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).get("Exam Type"));
//			System.out.println(list.get(i).get("Exam Template"));
//			System.out.println(list.get(i).get("Subject"));
//			System.out.println(list.get(i).get("Grade"));
//		}
//		System.out.println("user_adds_the_valid_data"+ list);
		AdminExamPageObject.validateExam(data);
	}

	@Then("^close button to check all result$")
	public void close_button_to_check_all_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AdminExamPageObject.closeSearch();
		AdminExamPageObject.searchResult();
	}
	

	@Then("^exams are listed with page navigation options$")
	public void exams_are_listed_with_page_navigation_options() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AdminExamPageObject.validatePageLink();
	}
	
	@Then("^check the link loads new list of exams$")
	public void check_the_link_loads_new_list_of_exams() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   AdminExamPageObject.navigatePage1();
	}

	@Then("^check the next and previous options works fine$")
	public void check_the_next_and_previous_options_works_fine() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AdminExamPageObject.navigateNextPage();
		AdminExamPageObject.navigatePreviousPage();
	}



}	
