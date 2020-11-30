@smoke @oneup_smoke
Feature: Login Page Test for oneup

  @bat
  Scenario: TC1_verifyLoginWithValidAdminCred_pagetitle
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
    Then verify the pagetitle as "OneUp-Adaptive Assessment Test"

 