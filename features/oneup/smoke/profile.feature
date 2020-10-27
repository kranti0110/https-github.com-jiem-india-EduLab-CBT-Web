@smoke @oneup_smoke
Feature: Profile Page test cases

  @bat
  Scenario: Profile_verifyProfilePageTitle
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then User navigates to profile Page
    Then verify the pagetitle as "OneUp-Adaptive Assessment Test"

  @bat
  Scenario: TC2_verifyProfilePageHeader
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then User navigates to profile Page
    Then verify the profile page header as "MY PROFILE"

  @bat
  Scenario: TC3_verifyProfileUpdateSuccess
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then User navigates to profile Page
    When update section and rollno with "A" and "23"
    Then Verify go to my school button
    Then verify the subjects listed "Mathematics" and "Science"

  @bat
  Scenario: TC3_verifyProfileUpdateBlankData
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then User navigates to profile Page
    When update profile by clearing textboxes
    And Verify the mandatory messages
    Then Verify go to my school button
    

  @bat
  Scenario: TC3_verifyProfileUpdateInvalidkData
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then User navigates to profile Page
    When update section and rollno with "1112?@" and "ASDFGAA"
    Then Verify go to my school button does not appear
