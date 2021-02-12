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
  Scenario: Increase Exam Attempt-Veify with invalid email id
  Then Enter the invalid email id
  | invalidEmailID |
  | amruta.bisain1+10@gmail.com.ininvalid |
  Then Click on the Reset button
  Then Verify the error message "User does not exist"

