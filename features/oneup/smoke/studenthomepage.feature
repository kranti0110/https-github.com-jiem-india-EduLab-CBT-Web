@smoke @oneup_smoke
Feature: Student Homepage Page Test for oneup

  @bat
  Scenario: 1. Perfrom the test to validate page header of Student Home
    Given Open "ONEUP_PORTAL"
    Then verify the homescreen have "Let’s make education"

  @bat
  Scenario: 2. Perfrom the test to validate page title of Student Home
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then verify the pagetitle as "OneUp-Adaptive Assessment Test"

  @bat
  Scenario: 3. Perfrom the test to validate science content
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then verify the science contents are available

  @bat
  Scenario: 4. Perfrom the test to validate Maths content
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then verify the maths contents are available

  @bat
  Scenario: 5.  Perfrom the test to validate the links available on Student Home
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then verify the available links on student home page

  @bat
  Scenario: TC16_VerifyQuickLinksAvailable
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then verify the available quickLinks on student home page

  @bat
  Scenario: TC17_VerifyConnectWithUsAvailable
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then verify the available Connect With Us on student home page

  @bat
  Scenario: TC18_VerifyDownloadOneUpAppAvailable
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then verify the available Download OneUp App on student home page

  @bat
  Scenario: TC16_VerifyQuickLinksAccess
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then verify the quickLinks can be accessed on student home page

  @bat
  Scenario: TC16_VerifyQuickLinksAccess
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then verify the Connect With Us Links can be accessed on student home page

  @bat
  Scenario: TC16_VerifyDownloadLinksAccess
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_VALID_USER"
    Then verify the download links can be accessed on student home page
    
    
  #
  #@bat
  #Scenario: Perfrom Smoke test to validate links
    #Given Open "ONEUP_PORTAL"
    #When User login with "ONEUP_VALID_USER"
    #Then verify the link  "LINK_LIST"
      #| LinkName | LinkValue   |
      #| STUDY    | MY STUDY    |
      #| REVISION | MY REVISION |
      #| TEST     | MY TEST     |
      #| REPORT   | MY REPORT   |
      #| SCHOOL   | MY SCHOOL   |
      #| HOMEWORK | HOMEWORK    |
      #| REMEDIAL | REMEDIAL    |
