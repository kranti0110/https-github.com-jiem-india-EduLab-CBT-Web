@smoke @oneup_smoke
Feature: Registration Page Test for oneup

  @bat
  Scenario: VerifyRegistartionPageHeader
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the pageheader as "REGISTRATION FORM"

  @bat
  Scenario: VerifyPageTitle
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the page title as "OneUp-Adaptive Assessment Test"

  @bat
  Scenario: 
    Verify Proceed For Verification button is Disabled when Tnc is Unchecked and All mandatory fields are not filled

    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the Proceed For Verification button is Disabled when Tnc is Unchecked and All mandatory fields are not filled

  @bat
  Scenario: 
    Verify Proceed For Verification button is Disabled when Tnc is Checked and All mandatory fields are not filled

    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the Proceed For Verification button is Disabled when Tnc is Checked and All mandatory fields are not filled

  @bat
  Scenario: VerifyDefaultFocus
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the default focus is on First Name

  @current
  Scenario: VerifyRegistration
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then user fill registration form with valid data without discount code and Register
      | First Name | Last Name | email                               | Phone No   | School Name | Discount Code | Grade | City | Country |
      | Rajesh     | Desai     | rajesh.desai+21-dec-2020@scispl.com | 9898979796 | Vidya Vikas |               |    10 | Pune | India   |
	Then verify the pageheader as "CODE VERIFICATION"
      
      