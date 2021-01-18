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
    
     
  
