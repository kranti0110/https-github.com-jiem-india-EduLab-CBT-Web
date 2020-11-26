@smoke @oneup_smoke
Feature: Product Activation Page test cases

  @bat
  Scenario: TC1_verifyProductActivationPageTitle
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then User navigates to  Product Activation Page
    Then verify the pagetitle as "OneUp-Adaptive Assessment Test"

  @bat
  Scenario: TC2_verifyProductActivationPageHeader
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then User navigates to  Product Activation Page
    Then verify the product page header as "PRODUCT ACTIVATION"

  @bat
  Scenario: TC3_verifyProductActivationAlphaNumericData
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then User navigates to  Product Activation Page
    When update product and user key  "A13" and "A23"
    Then Verify the valid key message

  @bat
  Scenario: TC4_verifyProductActivationUpdateBlankData
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then User navigates to  Product Activation Page
    When update Product Activation Page by clearing textboxes
    And Verify the Product Activation mandatory messages

  @bat
  Scenario: TC5_verifyProductActivationUpdateSpacialCharacterData
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then User navigates to  Product Activation Page
    When update product and user key  "&%^^$$$^$^$^$" and "&%^^$$$^$^$^$"
    Then Verify the valid key message

  @bat
  Scenario: TC6_verifyProductActivationUpdateValidData
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then User navigates to  Product Activation Page
    When update product and user key  "ON010900000001" and "3QW0L2"
    Then Verify go to profile button

  @bat
  Scenario: TC7_verifyProductActivationUpdateValidDataMultipleTimes
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then User navigates to  Product Activation Page
    When update product and user key  "ON010900000001" and "3QW0L2"
    Then Verify if the user get multiple times code usage error message.
    
  @bat
  Scenario: TC7_verifyProductActivationUpdateValidDataMultipleTimes
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then User navigates to  Product Activation Page
    When click o
    Then Verify if the user get multiple times code usage error message.
    
    