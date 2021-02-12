@smoke @oneup_smoke
Feature: Automation of admin product key management scenario

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
	When Admin navigates to Product key management

#Code written by Abhinav Pandey
#Below Scenarios is for add edit and publish of Product key

@bat
  Scenario: Admin should be able to add and edit Product Key
	Given Admin is on Product key management tab
	When Clicks on Add Product Key
	Then Admin should land on create Product Key page
	And Selects Product Type
	And Selects School Name
	And Selects Grade
	And Selects Subject
	And Start Date
	And No of Users "1"
	And To Date
	And Add some notes
	And Click save button
	Then Admin is on show product page
	And clicks on edit
	Then Admin should be on edit product page
	And No of Users "2"
	And To Date
	And Verify status should be disabled
	And click update button
	Then Admin is on show product page
	And Get product key
	And Click on product key list
	Then Admin is on Product key management tab
	When Admin search generated product key
	Then Match displaying record msz
	Then Publish the product
	

@bat
  Scenario: Admin should be able to get data as per search
	Given Admin is on Product key management tab
	When Admin search text value "HH011000020002"
	Then Match displaying record msz
	


#Advance search on Product key management tab
@bat
  Scenario: Admin should get the data as per entered Product Key in advance search
	Given Admin is on Product key management tab
	And Click for Advance Search
	When Enters Product Key "HH011000020002"
	And click on search button
	Then Match displaying record msz

@bat
  Scenario: Admin should get the data ae per selected School Name in advance search
	Given Admin is on Product key management tab
	And Click for Advance Search
	When select school name
	And click on search button
	Then Match the school name value
	

@bat
  Scenario: Admin should get the data as per selected grade from dropdown
    Given Admin is on Product key management tab
	And Click for Advance Search
	When Selects grade from dropdown
	And click on search button
	Then Match the grade values

	
	