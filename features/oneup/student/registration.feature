@smoke @oneup_smoke
Feature: Registration Page Test for oneup

  @bat
  Scenario: TC1: VerifyRegistartionPageHeader
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the registrationPageHeader as "REGISTRATION FORM"

  @bat
  Scenario: TC2: VerifyPageTitle
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the page title as "OneUp-Adaptive Assessment Test"

  @bat
  Scenario: TC3: 
    Verify Proceed For Verification button is Disabled when Tnc is Unchecked and All mandatory fields are not filled
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the Proceed For Verification button is Disabled when Tnc is Unchecked and All mandatory fields are not filled

  @bat
  Scenario: TC4: 
    Verify Proceed For Verification button is Disabled when Tnc is Checked and All mandatory fields are not filled
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the Proceed For Verification button is Disabled when Tnc is Checked and All mandatory fields are not filled

  @bat 
  Scenario: TC5: VerifyDefaultFocus
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the default focus is on First Name

  @bat
  Scenario: TC6: VerifyRegistration with valid data without discount code
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    And user fill registration form with valid data without discount code
      | First Name | Last Name | email                               | Phone No   | School Name | Discount Code | Grade | City | Country |
      | Rajesh     | Desai     | rajesh.desai+withoutCPC@scispl.com | 9999999999 | Vidya Vikas No CPC |               |    10 | Pune | India   |
	And click on TnC checkbox
	And register
	Then verify the codeVerificationPageHeader as "CODE VERIFICATION"
      
  @bat
  Scenario: TC7: VerifyRegistration with valid data with discount code
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    And user fill registration form with valid data with discount code
      | First Name | Last Name | email                               | Phone No   | School Name | Discount Code | Grade | City | Country |
      | Rajesh     | Desai     | rajesh.desai+withCPC@scispl.com | 8888888888 | Vidya Vikas with CPC| TH061215      |    10 | Mumbai | India   |
	And click on TnC checkbox
	And register
	Then verify the codeVerificationPageHeader as "CODE VERIFICATION"    
	
	@bat
	Scenario: TC8: Verify Proceed For Verification button is Disabled when Tnc is Unchecked and All mandatory fields are filled
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    And user fill registration form with valid data with discount code
      | First Name | Last Name | email                               | Phone No   | School Name | Discount Code | Grade | City | Country |
      | Rajesh     | Desai     | rajesh.desai+withCPC@scispl.com | 8888888888 | Vidya Vikas with CPC| TH061215      |    10 | Mumbai | India   |
    Then Verify Proceed For Verification button is Disabled when Tnc is Unchecked and All mandatory fields are filled
    
	