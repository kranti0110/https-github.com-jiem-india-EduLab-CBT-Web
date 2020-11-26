@smoke @oneup_smoke
Feature: Login Page Test for oneup

  @bat
  Scenario: TC1_VerifyLoginPageHeader
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    Then varify the pageheader as "EXISTING USER"

  #@bat
  #Scenario: Perfrom Smoke test to validate the login page header
    #Given Open "ONEUP_PORTAL"
    #When User login with "ONEUP_VALID_USER"

  @bat
  Scenario: TC2_verifyLoginWithValidCred_pagetitle
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then verify the pagetitle as "Request a Demo"

  @bat
  Scenario: TC3_verifyLoginWithValidCred_SubjectsListed
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then verify the subjects listed "Mathematics" and "Science"

  @bat
  Scenario: TC4_verifyErrorLoginWithInValidCred
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_INVALID_USER"
    Then verify the error message "Invalid username or password""

  @bat
  Scenario: TC5_verifyForgetPasswordPageHeader
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User forget password
    Then varify the pageheader as "FORGOT PASSWORD"

  @bat
  Scenario: TC6_verifyForgetPasswordcodeVerificationPage
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User forget password
    When User enter valid email "amruta.bisain1@gmail.com" and send code
    Then verify if the code verification page appears.
    
    
    #Then user fill registration form
      #| Name  | Gender | Email         | Phone |
      #| test1 | Male   | xyz@gmail.com | 34555 |
      #
    #Then user fill registration form
      #| FieldName | FieldValue |
      #| Name      | test1      |
      #| Gender    | male       |
      #| Email     | sadfadf    |
      #| Phone     | asdfasdfa  |
    #Then user validate db table "student"
      #| ColumnName  | Expected |
      #| StudentNmae | XYZ      |
      #| StudentAge  |       23 |
    #Then user validate db table "emp"
      #| ColumnName | Expected |
      #| Empname    | XYZ      |
      #| EmpAge     |       23 |
      #| EmpAge     |       23 |
