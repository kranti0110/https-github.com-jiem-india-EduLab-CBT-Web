@smoke @oneup_smoke
Feature: Product Key Details

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
    When User navigates to ProductKeyManagement page
    When User clicks ProductKeyDetailsIcon
  
  @bat
  Scenario: VerifyProductKeyDetails_pagetitle
    Then verify the pageTitle_DetailsProductKey as "OneUp-Adaptive Assessment Test"

 @bat
  Scenario: Verify Product Key Deatils- Page Header
  	 Then verify the ProductKeyDetailspageHeader is "PRODUCT KEY DETAILS"
     
    
  


