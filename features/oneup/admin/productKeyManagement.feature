@smoke @oneup_smoke
Feature: Product Key Management

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
    When User navigates to ProductKeyManagement page
  
  @bat
  Scenario: VerifyProductKeyManagement_pagetitle
    Then verify the pagetitleproductmgmt as "OneUp-Adaptive Assessment Test"

 
    
    
    
  


