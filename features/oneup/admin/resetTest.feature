@smoke @oneup_smoke
Feature:  Reset Test

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
    When User clicks on Reset Test menu
	  

  @bat
  Scenario: Reset Test menu-verify the page header
  Then verify the page header as "RESET TEST" 
  
  @bat
  Scenario: Reset Test-verify with valid email id
  Then Enter valid email id
  | EmailID |
  | amruta.bisain1+10@gmail.com |
  Then Click on Reset button
  Then Verify the message "Data cleared."
  
  @bat
  Scenario: Reset Test-Veify with invalid email id
  Then Enter invalid email id
  | invalidEmailID |
  | amruta.bisain1+10@gmail.com.ininvalid |
  Then Click on Reset button
  Then Verify the error message as "User does not exist"
  
  @notdone
  Scenario: Reset test-when both tests are aborted by student
  Given Open "ONEUP_PORTAL"
  When User navigates to Login Page
  When User login with "ONEUP_VALID_USER"
  When nevigate to My test page
  When Click on maths Take test
  When click on tandc
  When Click on Yes Iam ready for the test
  When Click on next
  When click on abort
  When click on yes to abort the test
  When verify the maths test button name
  Given Open "ONEUP_PORTAL"
  When User navigates to Login Page
  When User login with "ONEUP_ADMIN"
  When User clicks on Reset Test menu
  Then Enter valid email id
  | EmailID |
  | amruta.bisain1+10@gmail.com |
  Then Click on Reset button
  Then Verify the message "Data cleared."
  Given Open "ONEUP_PORTAL"
  When User navigates to Login Page
  When User login with "ONEUP_VALID_USER"
  When nevigate to My test page
  Then verify the maths test button name after reset
  
  	