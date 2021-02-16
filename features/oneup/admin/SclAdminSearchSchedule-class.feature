@smoke @oneup_smoke
Feature:   SclAdmin Search Schedule Class feature

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_School_ADMIN"
    When User navigates to  Schedule Class 
    
  @bat
  Scenario: Search class-verify Blank search without selecting any field
  When user clicks on advance search dropdown
  And  click on search button
  Then verify the Error msg for date as "Date is required"
  Then verify the error msg For grade as "Grade is required"
  Then verify the error Msg for section as "Section is required"
  
  @bat
  Scenario: Search class-search schedule class
  When user clicks on advance search dropdown
  And select date from calendar control
  And select Grade
  And select Section
  Then click on search button
  #Then verify the page header as "Time Table for Tuesday, February 2, 2021, School : Vidya Vikas Vidyalay, Grade : 6, Section : A"
  Then verify search class "Plants -"
  #Then Verify Satrt time "Start Time (10:00 AM)"
  #Then Verify End time "End Time  (11:00 AM)"
  Then click on the given session link
  Then session link should be open in new window
  
  @bat
  Scenario: close search-Click on cross icon to close the search when search resullt are shown
  When user clicks on advance search dropdown
  And select date from calendar control
  And select Grade
  And select Section
  Then click on search button
  Then click on cross icon
  #Then Verify the page header "Time Table not found please specify search criteria"
  
  @bat
  Scenario: Delete Class-verify cancel delete operation
  When user clicks on advance search dropdown
  And select date from calendar control
  And select Grade
  And select Section
  Then click on search button
  Then verify search class "Plants -"
  #Then verify Satrt time "10:00 AM"
  #Then verify End time "11:00 AM"
  Then Click on delete icon
  Then Verify the confirmation msg as "Are you sure you want to delete scheduled class?"
  Then Click on cancel btn
  Then User nevigate to schudule class list
  
  @bat
  Scenario: Delete Class-verify delete operation
  When user clicks on advance search dropdown
  And select date from calendar control
  And select Grade
  And select Section
  Then click on search button
  Then verify search class "Plants -"
  Then Click on delete icon
  Then Verify the confirmation msg as "Are you sure you want to delete scheduled class?"
  Then Click on delete
  Then verify the page header "Time Table not found please specify search criteria"
  
  
  
  
  
  
  
  
  
  
  
  
    
    
    
   
    