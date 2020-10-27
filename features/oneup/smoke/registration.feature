@smoke @oneup_smoke
Feature: Registration Page Test for oneup

  @current1
  Scenario: VerifyRegistartionPageHeader
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then verify the pageheader as "REGISTRATION FORM"

  @current1
  Scenario: VerifyRegistartionPageHeader
    Given Open "ONEUP_PORTAL"
    When User navigates to Registration Page
    Then user fill registration form
      | First Name | Last Name | email          | Phone No   |
      | Test FN    | Test LN   | cxzcz@xdfs.com | 0123123123 |
