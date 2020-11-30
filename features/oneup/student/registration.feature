@smoke @oneup_smoke
Feature: Registration Page Test for oneup

  @done
  Scenario: VerifyRegistartionPageHeader
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the pageheader as "REGISTRATION FORM"
    
  @done
  Scenario: VerifyPageTitle
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the page title as "OneUp-Adaptive Assessment Test"
  
  @done
  Scenario: Verify Proceed For Verification button is Disabled when Tnc is Unchecked and All mandatory fields are not filled
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the Proceed For Verification button is Disabled when Tnc is Unchecked and All mandatory fields are not filled
  
  @done
  Scenario: Verify Proceed For Verification button is Disabled when Tnc is Checked and All mandatory fields are not filled
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the Proceed For Verification button is Disabled when Tnc is Checked and All mandatory fields are not filled    
      
  @current
  Scenario: VerifyDefaultHighlight
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the default highlight is on "First Name"  

  @notdone
  Scenario: VerifyRegistartionPageHeader
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then user fill registration form
      | First Name | Last Name | email             		          | Phone No   |
      | Rajesh     | Desai     | rajesh.desai+18-nov@scispl.com | 9898979796 |