@smoke @oneup_smoke
Feature: Homepage Page Test for oneup

  @bat1
  Scenario: Validate the login page header for Homepage
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    Then varify the pageheader as "EXISTING USER"

  @bat1
  Scenario: Validate the pagetitle for Homepage
    Given Open "ONEUP_PORTAL"
    Then verify the pagetitle as "OneUp-Adaptive Assessment Test"

  @bat1
  Scenario: Validate the portal open and the available links
    Given Open "ONEUP_PORTAL"
    Then verify the maths is available as "Mathematics"
    Then verify the science is available as "Science"

  #@new
  #Scenario: Validate all the link for Homepage
    #Given Open "ONEUP_PORTAL"
    #Then verify the link access on the homepage
    #
    #@new
  #Scenario: Validate all the link for Homepage
    #Given Open "ONEUP_PORTAL"
    #Then verify the link access on the homepage
    #
    #@new
  #Scenario: Validate all the link for Homepage
    #Given Open "ONEUP_PORTAL"
    #Then verify the link access on the homepage
    #
    #@new
  #Scenario: Validate all the link for Homepage
    #Given Open "ONEUP_PORTAL"
    #Then verify the link access on the homepage
    
    