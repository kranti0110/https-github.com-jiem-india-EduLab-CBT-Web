package oneup.pages;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import actions.ElementActions;
import oneup.report.Assert;

public class AdminExamPageObject {

	//page locators
	private static int sleep  =5000;
	private static  By masterdatamenu =By.xpath("//body/app-root[1]/app-admin-home[1]/div[1]/div[1]/div[1]/app-side-menu[1]/aside[1]/div[3]/ul[1]/li[3]/a[1]");
	private static  By exammenu  =By.xpath("/html/body/app-root/app-admin-home/div/div/div[1]/app-side-menu/aside/div[3]/ul/div[1]/ul/li[3]");
	private static  By search =By.xpath("//body/app-root[1]/app-exam-management[1]/app-exam-list[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	private static  By addexambutton =By.xpath("//body/app-root[1]/app-exam-management[1]/app-exam-list[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]");
	private static  By pageTitle =By.xpath("//h3[contains(text(),'CREATE EXAM')]");
	

	private static  By examName =By.xpath("/html/body/app-root/app-exam-management/app-create-exam/div/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/input");
	private static  By examType =By.xpath("/html/body/app-root/app-exam-management/app-create-exam/div/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/ngx-select/div/div[2]/div");
	private static  By examTemplate =By.xpath("//ngx-select[@formcontrolname='examTemplateId']");
	private static  By grade =By.xpath("/html/body/app-root/app-exam-management/app-create-exam/div/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div/div/div[4]/div/ngx-select/div/div[2]/div");
	private static  By subject =By.xpath("//ngx-select[@formcontrolname='subjectId']//div");
	private static  By notes =By.xpath("//*[@id=\"notes\"]");
	private static  By questionBank =By.xpath("/html/body/app-root/app-exam-management/app-create-exam/div/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div/div/div[6]/div/ngx-select/div/div[2]/div");
	private static  By listofchapters=By.xpath("//ng-multiselect-dropdown[@formcontrolname='chapterIdList']//div");
	private static  By selectAll =By.xpath("//ng-multiselect-dropdown/div/div[2]/ul[1]/li/div");
	
	private static  By createexambutton=By.xpath("//body/app-root[1]/app-exam-management[1]/app-create-exam[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/button[2]");
	
	private static  By successfulexamSaveText=By.xpath("/html/body/app-root/app-exam-management/app-show-exam/div/div/div[2]/div/div[1]/div/div/div/h3");
	
	//search Exam
	
	private static  By searchexam=By.xpath("/html/body/app-root/app-exam-management/app-exam-list/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[1]/input");
	private static  By searchResult=By.xpath("/html/body/app-root/app-exam-management/app-exam-list/div/div/div[2]/div/div[2]/div/div/table/tbody/tr/td");
	private static  By searchCloseBtn=By.xpath("//body/app-root[1]/app-exam-management[1]/app-exam-list[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]");
	
	private static  By searchResultString=By.xpath("//body/app-root[1]/app-exam-management[1]/app-exam-list[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h6[1]");
	private static  By recordPerPageDropDown=By.xpath("/html/body/app-root/app-exam-management/app-exam-list/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div[1]/select");
	private static  By listPerPageLink1=By.xpath("/html/body/app-root/app-exam-management/app-exam-list/div/div/div[2]/div/div[2]/div/section/ngb-pagination/ul/li[2]/a");
	private static  By listPerPageLink2=By.xpath("/html/body/app-root/app-exam-management/app-exam-list/div/div/div[2]/div/div[2]/div/section/ngb-pagination/ul/li[3]/a");
	private static  By listPreviousPageLink =By.xpath("/html/body/app-root/app-exam-management/app-exam-list/div/div/div[2]/div/div[2]/div/section/ngb-pagination/ul/li[1]/a/i");
	private static  By listNextPageLink =By.xpath("/html/body/app-root/app-exam-management/app-exam-list/div/div/div[2]/div/div[2]/div/section/ngb-pagination/ul/li[7]/a");
			
	public static void addExam() {
		ElementActions.click(addexambutton);
		
	}
	
	public static void validatePageLink() {
		ElementActions.getDriver().manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		Assert.assertTrue(ElementActions.isElementExist(listPerPageLink1));
		Assert.assertTrue(ElementActions.isElementExist(listPerPageLink2));
	}
	public static void navigatePage1() {
		ElementActions.getDriver().manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		ElementActions.click(listPerPageLink1);
		searchResult();
	}
	
	public static void navigatePage2() {
		ElementActions.click(listPerPageLink2);
		searchResult2();
	}
	
	public static void navigateNextPage() {
		navigatePage1();
		ElementActions.click(listNextPageLink);
		searchResult2();
	}
	
	public static void navigatePreviousPage() {
		navigatePage2();
		ElementActions.click(listPreviousPageLink);
		searchResult();
	}
	
	public static void searchResult2() {
		ElementActions.getDriver().manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		System.out.print("************getText searchResult2*********** "+ ElementActions.getText(searchResultString));
		System.out.print("************isElementExist searchResult2*********** "+ ElementActions.isElementExist(searchResultString));
		
		Assert.assertTrue(ElementActions.getText(searchResultString).contains("Displaying 11-20"));
	}
	
	public static void searchResult() {
		ElementActions.getDriver().manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		System.out.print("************getText searchResult *********** "+ ElementActions.getText(searchResultString));
		System.out.print("************isElementExist searchResult*********** "+ ElementActions.isElementExist(searchResultString));
		System.out.print("************getText searchResult*********** "+ ElementActions.getText(searchResultString).contains("Displaying 1-10"));
		Assert.assertTrue(ElementActions.getText(searchResultString).contains("Displaying 1-10"));
	}
	public static void closeSearch() throws InterruptedException {	
		ElementActions.click(searchCloseBtn);
		Thread.sleep(500);
	}
	
	public static void searchExam(String examName) throws InterruptedException {    
		ElementActions.getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		ElementActions.sendKeys(searchexam, examName);
		ElementActions.sendKeys(searchexam, Keys.ENTER);
		Thread.sleep(500);
	}
	
	public static void validateSavedExam(String exam)
	{
		ElementActions.getDriver().findElement(successfulexamSaveText);
	}
	
	
	public static void validateExam(List<List<String>> list) throws InterruptedException 
	{
		
		ElementActions.getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      // getting the list of elements with the xpath
	     List<WebElement> menuList = ElementActions.getDriver().findElements(searchResult);
	     
			for(int i=0; i<list.size(); i++) {

				System.out.print("************List from feature file *********** "+ list);
			}
	
	      for( int j = 0; j< list.size();j++)
		      {
		    	  WebElement tablelist =menuList.get(j);
		    	  String innerHtml = tablelist.getAttribute("innerHTML");
		    	  System.out.print("************Inner String Menulist *********** "+ innerHtml);
		    	  System.out.print("************List from listValue in array *********** " +j +"  "+ list.get(0).get(j));
		    	  System.out.print("validateExam" + innerHtml  + j);
		    	  Assert.assertEquals(list.get(0).get(j), innerHtml, "Validate the search result !!!");
		    	  

		    	}		    	  
		       
	      
	}
	
	public static void validateTitle(String expected) {
		String actual = ElementActions.getText(pageTitle);
		System.out.print(actual );
		Assert.assertEquals(expected, actual,"Validated Title");
	}
//	public static void enterData(List<Map<String, String>> list) throws InterruptedException {
//		
//		
//		System.out.print("enterData" );
//		// Create the object of the Select class
//		Actions actions = new Actions(ElementActions.getDriver());
//
//		   
//		for(int i=0; i<list.size(); i++) {
//			ElementActions.sendKeys(examName, list.get(i).get("Exam Name"));
//			WebElement examTypeselectBox = ElementActions.getDriver().findElement(By.xpath("//ngx-select[@formcontrolname=\"examType\"]"));
//			WebElement examTemplateSelectBox = ElementActions.getDriver().findElement(examTemplate);
//			WebElement gradeSelectBox = ElementActions.getDriver().findElement(grade);
//			WebElement subjectSelectBox = ElementActions.getDriver().findElement(subject);
//			WebElement questionBankSelectBox = ElementActions.getDriver().findElement(questionBank);
//			WebElement listofchaptersSelectBox = ElementActions.getDriver().findElement(listofchapters);
//
//			
//			//actions.moveToElement(selectBox).click().build().perform();
//			System.out.print(list.get(i).get("Exam Type"));
//			System.out.print(list.get(i).get("Exam Template"));
//			System.out.print(list.get(i).get("Grade"));
//			System.out.print(list.get(i).get("Subject"));
//			actions.moveToElement(examTypeselectBox).sendKeys(list.get(i).get("Exam Type"));
//			actions.moveToElement(examTemplateSelectBox).sendKeys(list.get(i).get("Exam Template"));
//			Thread.sleep(500);
//			actions.moveToElement(gradeSelectBox).sendKeys(list.get(i).get("Grade"));
//			actions.moveToElement(subjectSelectBox).sendKeys(list.get(i).get("Subject"));
//			Thread.sleep(500);
//			actions.moveToElement(questionBankSelectBox).sendKeys(list.get(i).get("Question Bank"));
//			Thread.sleep(500);
//			actions.moveToElement(listofchaptersSelectBox).sendKeys(list.get(i).get("List of chapters"));
//			
////			Select examTypeDropdown = new Select(ElementActions.getDriver().findElement(examType));
////			List<WebElement> quantityButton = ElementActions.getDriver().findElements(examType);
////			// Select the option using the visible text
////			System.out.print("List ExamType"  + quantityButton);
////			System.out.print("Select ExamType"  + examTypeDropdown);
//			
//			System.out.print(examTypeselectBox);
//			//WebElement examTypeDropdown = ElementActions.getDriver().findElement(By.xpath("//*[@optionvaluefield=\"examTypeList\"]"));
//
//			//Select selectValue = new Select(examTypeDropdown);
//			//ElementActions.getDriver().findElement(examType).sendKeys(list.get(i).get("Exam Type"));
//			//selectValue.selectByValue(list.get(i).get("Exam Type"));
//			Thread.sleep(500);
////			ElementActions.sendKeys(examType, list.get(i).get("Exam Type"));
////			ElementActions.sendKeys(examTemplate, list.get(i).get("Exam Template"));
////			ElementActions.sendKeys(grade, list.get(i).get("Grade"));
////			ElementActions.sendKeys(subject, list.get(i).get("Subject"));
////
////			ElementActions.sendKeys(questionBank, list.get(i).get("Question Bank"));
////			ElementActions.sendKeys(listofchapters, list.get(i).get("List of chapters"));
//			ElementActions.sendKeys(notes, list.get(i).get("Notes"));
//			
//			ElementActions.click(createexambutton);
//			Thread.sleep(1000);
//			ElementActions.getDriver().manage().timeouts().implicitlyWait(sleep, TimeUnit.SECONDS);
//			ElementActions.getDriver().navigate().back();
//		}
//	}
	
	public static void enterData(List<Map<String, String>> list) throws InterruptedException {
		
		Actions actions = new Actions(ElementActions.getDriver());
//		System.out.print("enterData" +list);
//		System.out.print("list 0" +list.get(0).get("Exam Type"));

		   
		for(int i=0; i<list.size(); i++) {
			
			//actions.moveToElement(selectBox).click().build().perform();
//			System.out.print("************FOR LOOP Exam Type"+ list.get(i).get("Exam Type"));
//			System.out.print("************FOR LOOP Exam Template"+list.get(i).get("Exam Template"));
//			System.out.print(list.get(i).get("Grade"));
//			System.out.print(list.get(i).get("Subject"));
			
			ElementActions.sendKeys(examName, list.get(i).get("Exam Name"));

			ElementActions.getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
//			WebElement examTypeselectBox = ElementActions.getDriver().findElement(examType);
//			WebElement examTemplateSelectBox = ElementActions.getDriver().findElement(examTemplate);
			ElementActions.getDriver().findElement(examType).click();
			
			OptionsClick(By.xpath("//ul[@class='ngx-select__choices dropdown-menu show']//li//a//span"),list.get(i).get("Exam Type"));
			
			//ElementActions.getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			ElementActions.getDriver().findElement(examTemplate).click();
			
			OptionsClick(By.xpath("//ul[@class='ngx-select__choices dropdown-menu show']//li//a//span"),list.get(i).get("Exam Template"));
			
			ElementActions.getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			ElementActions.getDriver().findElement(grade).click();
			
			OptionsClick(By.xpath("//ul[@class='ngx-select__choices dropdown-menu show']//li//a//span"),list.get(i).get("Grade"));
			
			ElementActions.getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			ElementActions.getDriver().findElement(subject).click();
			
			OptionsClick(By.xpath("//ul[@class='ngx-select__choices dropdown-menu show']//li//a//span"),list.get(i).get("Subject"));
			
			ElementActions.getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			ElementActions.getDriver().findElement(questionBank).click();
			
			OptionsClick(By.xpath("//ul[@class='ngx-select__choices dropdown-menu show']//li//a//span"),list.get(i).get("Question Bank"));
			
			ElementActions.getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			ElementActions.getDriver().findElement(listofchapters).click();
			ElementActions.getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			ElementActions.getDriver().findElement(selectAll).click();
			Thread.sleep(3000);
			
			//OptionsClick(By.xpath("//ul[@class='ngx-select__choices dropdown-menu show']//li//a//span"),list.get(i).get("List of chapters"));
			
			
			ElementActions.sendKeys(notes, list.get(i).get("Notes"));
			
			ElementActions.click(createexambutton);
			Thread.sleep(3000);
			
	
		}
	}
	
	public static void OptionsClick(By element,String testToSelect)
	{

			ElementActions.getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		      // getting the list of elements with the xpath
		      List<WebElement> menuList = ElementActions.getDriver().findElements(element);

		      
		      for( int j = 0; j< menuList.size();j++){
		      {
		    	  WebElement dropdnlist =menuList.get(j);
		    	  String innerHtml = dropdnlist.getAttribute("innerHTML");
		    	  System.out.print("OptionsClick testToSelect  " + testToSelect  );
		    	  if(innerHtml.contentEquals(testToSelect))
		    		{
		    		  dropdnlist.click();
		    		  System.out.print("OptionsClick element innerHtml " + innerHtml  + j);
		    		}		    	  
		    	  
		      }
		    	  
		    	  }
	
		}
	
	
}
