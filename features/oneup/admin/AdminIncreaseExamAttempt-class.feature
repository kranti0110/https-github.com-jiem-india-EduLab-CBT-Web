@smoke @oneup_smoke
Feature:  Admin Increase exam attempt feature

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
    When User clicks on Increase Exam Attempt menu
	  

  @bat
  Scenario: Increase Exam Attempt-verify the page header
  Then Verify page header "INCREASE EXAM ATTEMPT" 
  
  @bat
  Scenario: Increase Exam Attempt-verify with valid email id
  Then Enter a valid email id
  | EmailID |
  | amruta.bisain1+10@gmail.com |
  Then Click on the Reset button
  Then Verify the message as "Reattempt request processed successfully."
  
  @bat
  Scenario: Increase Exam Attempt-Verify with invalid email id
  Then Enter the invalid email id
  | invalidEmailID |
  | amruta.bisain1+10@gmail.com.ininvalid |
  Then Click on the Reset button
  Then Verify the error message "User does not exist"
  
  @bat
  Scenario: Abort the Maths test multiple time sothat max retries for taking the exam get over
  When click on user profile icon
  When log out from admin user
  When User login with "ONEUP_VALID_USER"
  When user go to My test tab
  When user clicks on Maths Take test btn
  When user clicks on T&C checkbox
  When user click on I am ready to take test btn
  When user clicks on Next btn
  When user clicks on abort icon
  When user clicks on yes to abort the test
  When user clicks on Resume test btn
  When user clicks on Next btn
  When user clicks on abort icon
  When user clicks on yes to abort the test
  When user clicks on maths Resume test btn
  Then verify the text as "Max retries exceeded for taking the exam."
  
  @bat
  Scenario: Increase Exam Attempt when max retries for maths exam get over
  Then Enter a valid email id
  | EmailID |
  | amruta.bisain1+10@gmail.com |
  Then Click on the Reset button
  Then Verify the message as "Reattempt request processed successfully."
  
  @bat
  Scenario: verify user can resume the maths test after increasing exam attempt
  When click on user profile icon
  When log out from admin user
  When User login with "ONEUP_VALID_USER"
  When user go to My test tab
  When user clicks on maths Resume test btn
  When user clicks on Next btn
 
  @bat
  Scenario: Abort the Science test multiple time sothat max retries for taking the exam get over
  When click on user profile icon
  When log out from admin user
  When User login with "ONEUP_VALID_USER"
  When user go to My test tab
  When user clicks on Science Take test btn
  When user clicks on T&C checkbox
  When user click on I am ready to take test btn
  When user clicks on Next btn
  When user clicks on abort icon
  When user clicks on yes to abort the test
  When user clicks on science Resume test btn
  When user clicks on Next btn
  When user clicks on abort icon
  When user clicks on yes to abort the test
  When user clicks on science Resume test btn
  Then verify the text as "Max retries exceeded for taking the exam."
 
  @bat
  Scenario: Increase Exam Attempt when max retries for sci test get over
  Then Enter a valid email id
  | EmailID |
  | amruta.bisain1+10@gmail.com |
  Then Click on the Reset button
  Then Verify the message as "Reattempt request processed successfully."
  
  @bat
  Scenario: verify user can resume the test after increasing exam attempt
  When click on user profile icon
  When log out from admin user
  When User login with "ONEUP_VALID_USER"
  When user go to My test tab
  When user clicks on science Resume test btn
  When user clicks on Next btn
 
  @bat
  Scenario: Abort the both the test multiple time sothat max retries for taking the exam get over
  When click on user profile icon
  When log out from admin user
  When User login with "ONEUP_VALID_USER"
  When user go to My test tab
  When user clicks on Maths Take test btn
  When user clicks on T&C checkbox
  When user click on I am ready to take test btn
  When user clicks on Next btn
  When user clicks on abort icon
  When user clicks on yes to abort the test
  When user clicks on maths Resume test btn
  When user clicks on Next btn
  When user clicks on abort icon
  When user clicks on yes to abort the test
  When user clicks on maths Resume test btn
  Then verify the text as "Max retries exceeded for taking the exam."
  When user clicks on Science Take test btn
  When user clicks on T&C checkbox
  When user click on I am ready to take test btn
  When user clicks on Next btn
  When user clicks on abort icon
  When user clicks on yes to abort the test
  When user clicks on science Resume test btn
  When user clicks on Next btn
  When user clicks on abort icon
  When user clicks on yes to abort the test
  When user clicks on science Resume test btn
  Then verify the text as "Max retries exceeded for taking the exam."
 
  @bat
  Scenario: Increase Exam Attempt when max retries for both the exam get over
  Then Enter a valid email id
  | EmailID |
  | amruta.bisain1+10@gmail.com |
  Then Click on the Reset button
  Then Verify the message as "Reattempt request processed successfully."
  
  @notdone
  Scenario: verify user can resume the both the test after increasing exam attempt
  When click on user profile icon
  When log out from admin user
  When User login with "ONEUP_VALID_USER"
  When user go to My test tab
  When user clicks on maths Resume test btn
  When user clicks on Next btn
  When user clicks on science Resume test btn
  When user clicks on Next btn
 
 
 
 
 
 
 
  
  
 
 