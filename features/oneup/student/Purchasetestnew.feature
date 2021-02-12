@smoke @oneup_smoke
Feature: feature to test Purchase Test functionality

  @bat
  Scenario: Validate the yellow strip link purchase test on my test tab
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_TALENTHUNT_USER"
    Then varify the yellow strip link as "PURCHASE TEST >"

  
  @bat
  Scenario: Validate the yellow strip link text purchase test on Report page
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_TALENTHUNT_USER"
    And  User nevigate to My Report page
    Then varify the yellow strip link text as "PURCHASE TEST >"
    
    
  @bat
  Scenario: Validate user is able to navigate to Confirm Payment page
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_TALENTHUNT_USER"
    And User click on Purchase test link on My Test page
    Then verify user nevigates to "Confirm Payment" page
    
    
  @bat
  Scenario: Validate user is able to navigate to Confirm Payment screen from report tab
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_TALENTHUNT_USER"
    And  User nevigate to My Report tab
    Then User click on Purchase test link on My Report tab
    Then verify user nevigates to "Confirm Payment" Screen
    