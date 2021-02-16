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
  
  @bat
  Scenario: verify button name when only maths exam is aborted by student
  When User click on the user profile
  When User log out from appication
  When User login with "ONEUP_VALID_USER"
  When nevigate to My test page
  When Click on maths Take test
  When click on tandc
  When Click on Yes Iam ready for the test
  When Click on next
  When click on abort
  When click on yes to abort the test
  Then verify the maths test button name as "RESUME TEST"
  
  @bat
  Scenario: Reset test-when maths test is aborted by student
  Then Enter valid email id
  | EmailID |
  | amruta.bisain1+10@gmail.com |
  Then Click on Reset button
  Then Verify the message "Data cleared."
  
  @bat
  Scenario: Reset test-Verify button name after reset
  When User click on the user profile
  When User log out from appication
  When User login with "ONEUP_VALID_USER"
  When nevigate to My test page
  Then verify the maths test button name after reset "TAKE TEST"
  
  @bat
  Scenario: verify button name when only Science exam is aborted by student
  When User click on the user profile
  When User log out from appication
  When User login with "ONEUP_VALID_USER"
  When nevigate to My test page
  When Click on Science Take test
  When click on tandc
  When Click on Yes Iam ready for the test
  When Click on next
  When click on abort
  When click on yes to abort the test
  Then verify the Science test button name as "RESUME TEST"
  
  @bat
  Scenario: Reset test-when Science test is aborted by student
  Then Enter valid email id
  | EmailID |
  | amruta.bisain1+10@gmail.com |
  Then Click on Reset button
  Then Verify the message "Data cleared."
  
  @bat
  Scenario: Reset test-Verify sci test button name after reset
  When User click on the user profile
  When User log out from appication
  When User login with "ONEUP_VALID_USER"
  When nevigate to My test page
  Then verify the science test button name after reset "TAKE TEST"
  
  
  @bat
  Scenario: Reset test-when both the test are aborted by student
  When User click on the user profile
  When User log out from appication
  When User login with "ONEUP_VALID_USER"
  When nevigate to My test page
  When Click on maths Take test
  When click on tandc
  When Click on Yes Iam ready for the test
  When Click on next
  When click on abort
  When click on yes to abort the test
  Then verify the maths test button name as "RESUME TEST"
  When Click on Science Take test
  When click on tandc
  When Click on Yes Iam ready for the test
  When Click on next
  When click on abort
  When click on yes to abort the test
  Then verify the Science test button name as "RESUME TEST"
  
  @bat
  Scenario: Reset test-when both test are aborted by student
  Then Enter valid email id
  | EmailID |
  | amruta.bisain1+10@gmail.com |
  Then Click on Reset button
  Then Verify the message "Data cleared."
  
  @bat
  Scenario: Reset test-Verify both test button name after reset
  When User click on the user profile
  When User log out from appication
  When User login with "ONEUP_VALID_USER"
  When nevigate to My test page
  Then verify the maths test button name after reset "TAKE TEST"
  Then verify the science test button name after reset "TAKE TEST"
  	