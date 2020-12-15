@smoke @oneup_smoke
Feature: feature to test Purchase Test functionality

  @Done
  Scenario: Validate the yellow strip saying purchase test on student homepage
    Given Open "ONEUP_PORTAL"
    When User Login to talent hunt
    When User is on student homepage
    Then varify the pageheader as "PURCHASE TEST"

  @Current
  Scenario: Validate the yellow strip saying purchase test on Report page
    Given Open "ONEUP_PORTAL"
      When User is on Report page
      Then varify the pageheader as "PURCHASE TEST"
    
  @Done
  Scenario: Validate the purchase test strip is working and on click it nevigates to Confirm Payment Screen
    Given Open "ONEUP_PORTAL"
    When User Login to talent hunt
    When User is on student homepage
    Then verify the "PURCHASE TEST" is clickable
    Then verify it nevegates to "Confirm Payment" Screen
    
     @Done
  Scenario: Validate the purchase test strip is working and on click it nevigates to Confirm Payment Screen
    Given Open "ONEUP_PORTAL"
    When User Login to talent hunt
    When User is on Report page
    Then verify the "PURCHASE TEST" is clickable
    Then verify it nevegates to "Confirm Payment" Screen
    