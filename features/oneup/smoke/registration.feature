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
  Scenario: Verify Proceed For Verification button is Disabled when Tnc is Unchecked and All mandatory fields are not filled
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the Proceed For Verification button is Disabled when Tnc is Unchecked and All mandatory fields are not filled
  
  @bat
  Scenario: Verify Proceed For Verification button is Disabled when Tnc is Checked and All mandatory fields are not filled
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the Proceed For Verification button is Disabled when Tnc is Checked and All mandatory fields are not filled    
      
  @notDone
  Scenario: VerifyDefaultHighlight
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the default highlight is on "First Name"  

  @bat
  Scenario: VerifyRegistartionPageHeader
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then user fill registration form
      | First Name | Last Name | email          | Phone No   |
      | Rajesh     | Desai     | cxzcz@xdfs.com | 9898979796 |
