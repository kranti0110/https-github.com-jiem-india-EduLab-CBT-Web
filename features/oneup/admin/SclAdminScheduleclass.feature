@smoke @oneup_smoke
Feature:   SclAdmin Schedule Class feature

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_School_ADMIN"
    When User navigates to  Schedule Class

  @bat
  Scenario: Verify the meassage shown on landing to Schedule Class menu
  Then verify message as "Time Table not found please specify search criteria"
  
  @bat
  Scenario: Add New Class-Verify on clicking to Add new class button user nevigates to add new class page
  When user clicks on the add new class btn
  Then nevigates to the add new class page
  Then user verify the page header as "ADD NEW CLASS"
  
  @bat
  Scenario: verify add new class feature by entering all valid data
  When user clicks on the add new class btn
  Then nevigates to the add new class page
  And Select date
  And Select the Start Time Hours from dropdown
  And Select the Start Time Minutes from dropdown
  And Select the End Time Hours from dropdown
  And Select the End Time Minutes from dropdown
  And Select the Grade from dropdown
  And Select the Section from dropdown
  And Select the Subject from dropdown
  And Click on any one of the Online Meeting Using option
  Then User enters the meeting url message and topic
  | Meeting URL | Message | Topic |
  | https://zoom.us/ | complete the training | Plants |
  Then Click on Save btn
  Then User should nevigates to time table page
  Then verify page header after Adding class 
  Then New class is added succefully
  
  @bat
  Scenario: Verify the result by keeping all the fields blank
  When user clicks on the add new class btn
  Then nevigates to the add new class page
  Then Click on the cancel button
  Then User should nevigates to time table page
  Then verify message as "Time Table not found please specify search criteria"
  
  @bat
  Scenario: Add new class- by filling few mandatory field
  When user clicks on the add new class btn
  Then nevigates to the add new class page
  And Select the date
  And Select the Start Time Hours from dropdown
  And Select the Start Time Minutes from dropdown
  And Select the End Time Hours from dropdown
  And Select the End Time Minutes from dropdown
  And Select the Grade from dropdown
  Then User enters the meeting url message and topic
  | Meeting URL | Message | Topic |
  |  | Attend the class on time | Algebra |
  Then Click on Save
  Then verify section Error message as "Section is required"
  Then verify subject error message as "subject is required"
  Then verify url error message as "meetingURL is required"
  
  @bat
  Scenario: Add new class-class is already schedule for a time try to add new class on the same time for same school
  When user clicks on the add new class btn
  Then nevigates to the add new class page
  And Select the date
  And Select the Start Time Hours from dropdown
  And Select the Start Time Minutes from dropdown
  And Select the End Time Hours from dropdown
  And Select the End Time Minutes from dropdown
  And Select the Grade from dropdown
  And Select the Section from dropdown
  And Select the Subject from dropdown
  And Click on any one Online Meeting Using option
  Then User enters the meeting url message and topic
  | Meeting URL | Message | Topic |
  | https://zoom.us/ | Attend the class on time | Algebra |
  Then Click on Save
  Then verify error message as "Error: Event already Exist"
  