@smoke @oneup_smoke
Feature:  Class Teacher Management

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
    When User navigates to Master Data
	  When User navigates to class teacher management page

  @current
  Scenario: Verify class teacher Management- CREATE CLASS TEACHER - Page Title
  	When User clicks CREATE CLASS TEACHER button
    Then check the pagetitle as "CREATE CLASS TEACHER"
   
    @current
  Scenario: VerifyClassTeacherManagement- CreateClassTeacher - Create valid data
  	When User clicks CREATE CLASS TEACHER
  	Then User should be on Create Class Teacher page
    And Select school name from dropdown
    And Select teacher name from dropdown
    And Select grade from dropdown
    And Select section from dropdown
    Then click on Save
    Then the class teacher is saved succefully  "AUTO_CLASSTEACHER_Valid"
    
  @current
  Scenario: VerifyClassTeacherManagement- Search class teacher -
    When user clicks on advance search 
    And Select school name from dropdown
    And Select teacher name from dropdown
    And Select grade from dropdown
    And Select section from dropdown
    Then User gets the search record 
    Then click on close button to check all records
    Then verify all records are displayed
      
    @current
    Scenario: Verify cancel button on create class teacher page
    When User clicks CREATE CLASS TEACHER
    When click on cancel button
    Then user should nevigate to class teacher management page
    Then Verify the record per page
    
    @current
    Scenario: Verify the Create Class Teacher blank data
    When User clicks CREATE CLASS TEACHER
    Then User clicks on Save button without selecting any data
    And Verify create class teacher mandatory messages
    
    @current
    Scenario: View Class teacher-Verify the page header
    When User clicks on class teacher name link
    Then Verify the page header as "CLASS TEACHER DETAILS"
    
    @current
    Scenario: Class teacher details-Verify that user nevigates to class teacher list by clicking class teacher list button
    When User clicks on class teacher name link
    When User clicks Class Teacher List button
    Then User nevigates to Class teacher mangement scrren
    
    @current
    Scenario: Edit class teacher-Verify the page header
    When User clicks on edit icon on class teacher mng page
    Then Validate page header as "EDIT CLASS TEACHER"
    
    @current
    Scenario: Edit class teacher-Verify that user can edit the class teacher info
    When User clicks on edit icon on class teacher mng page
    And Select school name from dropdown list
    And Select teacher name from dropdown list
    And Select grade from dropdown list
    And Select section from dropdown list
    Then Click on Update button
    Then The class teacher data gets updated succefully
    
    @current
    Scenario: ClassTeacherManagement-verify next page link > 
    When User is on second page
    Then verify second page records
    Then Click on next page link
    Then verify records on next page
    
    @current
    Scenario: ClassTeacherManagement-Verify Previous page link <
    When User is on second page
    Then Click on Previous page link
    Then Verify records on previous page
    
    @current
    Scenario: Delete Class teacher-verify cancel delete class teacher operation
    When User clicks on delete icon
    Then verify delete confirmation message as "Are you sure you want to delete this Class Teacher?"
    Then Click on cancel
    And Nevigate to Class Teacher Mng Page
    
    @current
    Scenario: Delete Class teacher-verify delete operation
    When User clicks on delete icon
    Then Click on Delete
    Then Record should get deleted
    
    
    
    
    
     
  
