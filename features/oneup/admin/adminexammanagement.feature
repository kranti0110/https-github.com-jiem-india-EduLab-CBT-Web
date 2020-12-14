@smoke @oneup_smoke
Feature:  Exam Management

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
	When User navigates to Exam page
	
  @bat
  Scenario: VerifyExamManagement_pagetitle
    Then verify the pagetitle as "OneUp-Adaptive Assessment Test"

  @bat
  Scenario: VerifyExamManagement- Add new exam - Page Header
  	When User clicks add new exam
    Then verify the pageheader is "CREATE EXAM"
  
#  @bat1
#  Scenario: VerifyExamManagement- Add new exam - Create valid data
#  	When User clicks add new exam
#    Then User adds the valid data
#      | Exam Name | Exam Type | Exam Template | Subject   | Grade | Question Bank | List of chapters | Notes   |
#      | AMS EXAM | B2CFreeTest | B2CSampleTestTemplate | Science   | 10| Science_10_Premium_QB | Motion | Notes for 10 student from Automation   |
#    Then the exam is saved succefully 
   
    @bat
  Scenario: VerifyExamManagement- Add new exam - Create valid data
  	When User clicks add new exam
    Then User adds the valid data
      | Exam Name | Exam Type | Exam Template | Subject   | Grade | Question Bank | List of chapters | Notes   |
      | AUTO_EXAM_Valid | B2CFreeTest | B2CSampleTestTemplate | Science   | 10| Science_10_Premium_QB | Motion | Notes for 10 student from Automation   |
    Then the exam is saved succefully  "AUTO_EXAM_Valid"
    
    
    
  @bat
  Scenario: VerifyExamManagement- Search exam - 
  	When User tries to search the exam "AUTO_EXAM_Valid"
    Then User gets the record
    | 1  | AUTO_EXAM_Valid | B2CFreeTest | 10   | Science | 

  @bat
  Scenario: VerifyExamManagement- Close button on seach exam - 
  	When User tries to search the exam "AUTO_EXAM_Valid"
    Then close button to check all result
  
  @bat
  Scenario: VerifyExamManagement- List exam on page - 
    Then exams are listed with page navigation options
    Then check the link loads new list of exams
 
   @bat
  Scenario: VerifyExamManagement- List exam on page use < and > arrows
#    Then exams are listed with page navigation options
    Then check the next and previous options works fine
     
  