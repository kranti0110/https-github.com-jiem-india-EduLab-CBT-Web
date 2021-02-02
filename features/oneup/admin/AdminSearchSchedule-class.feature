@smoke @oneup_smoke
Feature:   Admin Search Schedule Class feature

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
    When User navigates to  Schedule Class menu

  @current
  Scenario: Search class-verify Blank search without selecting any field
  When User clicks on advance search dropdown
  And  Click on search button
  Then Verify the Error msg for date as "Date is required"
  Then Verify The error msg for school name as "School name is required"
  Then Verify the error msg For grade as "Grade is required"
  Then Verify the error Msg for section as "Section is required"
  
  @current
  Scenario: Search class-search schedule class
  When User clicks on advance search dropdown
  And Select date from calendar control
  And Select school name
  And Select Grade
  And Select Section
  Then Click on search button
  #Then verify the page header as "Time Table for Tuesday, February 2, 2021, School : Vidya Vikas Vidyalay, Grade : 6, Section : A"
  Then verify the search class "Algebra -"
  #Then verify Satrt time "Start Time (10:00 AM)"
  #Then verify End time "End Time  (11:00 AM)"
  Then click on the session link
  #Then Session link should be open in new tab
  
  @current
  Scenario: close search-Click on cross icon to close the search when search resullt are shown
  When User clicks on advance search dropdown
  And Select date from calendar control
  And Select school name
  And Select Grade
  And Select Section
  Then Click on search button
  Then Click on cross icon
  #Then Verify the page header "Time Table not found please specify search criteria"
  
  @notdone
  Scenario: Search for the class which is not yet schedule-invalid search
  When User clicks on advance search dropdown
  And Select future date for which homework is not schedule
  And Select school name
  And Select Grade
  And Select Section
  Then Click on search button
  Then Verify the page header "Time Table not found please specify search criteria"
  
  
  @current
  Scenario: Delete Class-verify cancel delete operation
  When User clicks on advance search dropdown
  And Select date from calendar control
  And Select school name
  And Select Grade
  And Select Section
  Then Click on search button
  Then verify the search class "Algebra -"
  #Then verify Satrt time "10:00 AM"
  #Then verify End time "11:00 AM"
  Then click on delete icon
  Then verify the confirmation msg as "Are you sure you want to delete scheduled class?"
  Then click on cancel
  Then user nevigate to schudule class list
  
  @current
  Scenario: Delete Class-verify delete operation
  When User clicks on advance search dropdown
  And Select date from calendar control
  And Select school name
  And Select Grade
  And Select Section
  Then Click on search button
  Then verify the search class "Algebra -"
  Then click on delete icon
  Then verify the confirmation msg as "Are you sure you want to delete scheduled class?"
  Then click on delete
  Then Verify the page header "Time Table not found please specify search criteria"
  
  
  
  
  
  
  
  
  
  
  
  
    
    
    
   
    