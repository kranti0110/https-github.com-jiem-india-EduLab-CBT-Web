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

 @bat
  Scenario: Verify Product Key Management- Add Product Key - Page Header
  	When User clicks ADD PRODUCT KEY
    Then verify the createProductKeypageHeader is "CREATE PRODUCT KEY"
     
    
  


