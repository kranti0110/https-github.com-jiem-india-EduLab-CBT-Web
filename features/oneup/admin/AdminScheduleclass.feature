@smoke @oneup_smoke
Feature:   Admin Schedule Class feature

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
    When User navigates to  Schedule Class menu

  @bat
  Scenario: Verify the meassage shown on landing to Schedule Class menu
  Then verify the message as "Time Table not found please specify search criteria"
  
  @bat
  Scenario: Add New Class-Verify on clicking to Add new class button user nevigates to add new class page
  When User clicks on add new class button
  Then User nevigates to add new class page
  Then Verify page header as "ADD NEW CLASS"
  
  @bat
  Scenario: verify add new class feature by entering all valid data
  When User clicks on add new class button
  Then User nevigates to add new class page
  And Select date
  And Select school name from the list of dropdown
  And Select Start Time Hours from dropdown
  And Select Start Time Minutes from dropdown
  And Select End Time Hours from dropdown
  And Select End Time Minutes from dropdown
  And Select Grade from dropdown
  And Select Section from dropdown
  And Select Subject from dropdown
  And Click on any one Online Meeting Using option
  Then User enters meeting url message and topic
  | Meeting URL | Message | Topic |
  | https://www.google.com/ | Attend the class on time | Algebra |
  Then Click on Save
  Then User should nevigate to time table page
  Then verify the page header after adding class 
  Then The New class is added succefully
  
  @bat
  Scenario: Verify the result by keeping all the fields blank
  When User clicks on add new class button
  Then User nevigates to add new class page
  Then Click on cancel button
  Then User should nevigate to time table page
  Then verify the message as "Time Table not found please specify search criteria"
  
  @bat
  Scenario: Add new class- by filling few mandatory field
  When User clicks on add new class button
  Then User nevigates to add new class page
  And Select date
  And Select Start Time Hours from dropdown
  And Select Start Time Minutes from dropdown
  And Select End Time Hours from dropdown
  And Select End Time Minutes from dropdown
  And Select Grade from dropdown
  Then User enters meeting url message and topic
  | Meeting URL | Message | Topic |
  | https://www.google.com/ | Attend the class on time | Algebra |
  Then Click on Save 
  #Then verify the error message as "Error: Please Select School"
  Then verify the section Error message as "Section is required"
  Then verify The subject error message as "subject is required"
  
  @bat
  Scenario: Add new class-class is already schedule for a time try to add new class on the same time for same school
  When User clicks on add new class button
  Then User nevigates to add new class page
  And Select date
  And Select school name from the list of dropdown
  And Select Start Time Hours from dropdown
  And Select Start Time Minutes from dropdown
  And Select End Time Hours from dropdown
  And Select End Time Minutes from dropdown
  And Select Grade from dropdown
  And Select Section from dropdown
  And Select Subject from dropdown
  And Click on any one Online Meeting Using option
  Then User enters meeting url message and topic
  | Meeting URL | Message | Topic |
  | https://www.google.com | Attend the class on time | Algebra |
  Then Click on Save
  Then verify the error message as "Error: Event already Exist"
  