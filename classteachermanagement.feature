@smoke @oneup_smoke
Feature:  Class Teacher Management

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
    When User navigates to Master Data
	  When User navigates to class teacher management page

  @bat
  Scenario: Verify class teacher Management- CREATE CLASS TEACHER - Page Title
  	When User clicks CREATE CLASS TEACHER button
    Then check the pagetitle as "CREATE CLASS TEACHER"
   
    @bat
  Scenario: VerifyClassTeacherManagement- CreateClassTeacher - Create valid data
  	When User clicks CREATE CLASS TEACHER
  	Then User should be on Create Class Teacher page
    And Select school name from dropdown
    And Select teacher name from dropdown
    And Select grade from dropdown
    And Select section from dropdown
    Then the class teacher is saved succefully  "AUTO_CLASSTEACHER_Valid"
    
  @bat
  Scenario: VerifyClassTeacherManagement- Search class teacher -
    When user clicks on advance search 
    And Select school name from dropdown
    And Select teacher name from dropdown
    And Select grade from dropdown
    And Select section from dropdown
    Then User gets the search record 
    Then click on close button to check all records
    Then verify all records are displayed
      
  @bat
  Scenario: VerifyClassTeacherManagement- List class teacher on page - 
    Then class teachers are listed with page navigation options
    Then check the link loads the list of class teachers
 
   @bat
  Scenario: VerifyClassTeacherManagement- List class teacher use < and > arrows
    When User is on second page
    Then check  next and previous options works fine
    
    @bat
    Scenario: Verify cancel button on create class teacher page
    When User clicks CREATE CLASS TEACHER
    When click on cancel button
    Then user should nevigate to class teacher management page
    Then Verify the record per page
    
    @bat
    Scenario: Verify the Create Class Teacher blank data
    When User clicks CREATE CLASS TEACHER
    Then User clicks on Save button without selecting any data
    And Verify create class teacher mandatory messages
    
    @bat
    Scenario: View Class teacher-Verify the page header
    When User clicks on class teacher name link
    Then Verify the page header as "CLASS TEACHER DETAILS"
    
    @bat
    Scenario: Class teacher details-Verify that user nevigates to class teacher list by clicking class teacher list button
    When User clicks on class teacher name link
    When User clicks Class Teacher List button
    Then User nevigates to Class teacher mangement scrren
    
    @bat
    Scenario: Edit class teacher-Verify the page header
    When User clicks on edit icon on class teacher mng page
    Then Validate page header as "EDIT CLASS TEACHER"
    
    @bat
    Scenario: Edit class teacher-Verify that user can edit the class teacher info
    When User clicks on edit icon on class teacher mng page
    And Select school name from dropdown list
    And Select teacher name from dropdown list
    And Select grade from dropdown list
    And Select section from dropdown list
    Then Click on Update button
    Then The class teacher data gets updated succefully
    
    
     
  
