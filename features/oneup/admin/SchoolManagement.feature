@smoke @oneup_smoke
Feature: User Management

#Code written by Abhinav Pandey

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
	When User navigates to School Management
	
Scenario: Admin should able to add new school

	Given Admin should be in school management tab
	When Clicks on Add New School
	Then Admin should land on add new school page
	And Enter School name "Automation"
	And Enter school website "www.automationscript.com"
	And Enter school address "Mukhani Haldwani Nainital"
	And Enter Country
	And Enter State
	And Zone
	And City
	And Pin Code "263139"
	And Contact Person "Demo contact person name"
	And Contact number "8077976693"
	And contact mail id "abhinavpandey104@gmail.com"
	And Fax Number "76767"
	And Sales conatact name "Demo sales contact name"
	And Sales contact number "9599350496"
	And Notes "Automation scenario with all valid values"
	And clicks on save button
	When clicks at school management edit btn
	Then Admin should be on edit school page
	And Enter School name "Prakhar Automation"
	And Notes "Automation edit scenario with all valid values"
	And clicks on save button
	
@abhinav11
Scenario: Add new school with invalid values

	Given Admin should be in school management tab
	When Clicks on Add New School
	Then Admin should land on add new school page
	And Enter School name "1234"
	And Enter school website "www.automationscript.com.com"
	And Enter school address "Mukhani Haldwani Nainital"
	And Enter Country
	And Enter State
	And Zone
	And City
	And Pin Code "263139"
	And Contact Person "Demo contact person name"
	And Contact number "ddngmfnfn"
	And contact mail id "abhinavpandey104@gmail.com"
	And Fax Number "76767"
	And Sales conatact name "Demo sales contact name"
	And Sales contact number "nsdnnsdnmds"
	And Notes "Automation scenario with all valid values"
	And clicks on save button
	Then Admin should land on add new school page

	
Scenario: Admin should be able to search by school name

	Given Admin should be in school management tab
	When Admin search text value "Prakhar Automation"
	Then Match displaying record msz
	

	
Scenario: Admin should be able to search by school code

	Given Admin should be in school management tab
	When Admin search text value "AU05"
	Then Match displaying record msz

@abhinav111
Scenario: Admin should be able to search by advance search

	Given Admin should be in school management tab
	And Click for Advance Search
	And Enter school code "AU05"
	And Enter school name "Prakhar Automation"
	And Enter Country
	And Enter State
	And Zone
	And City
	And click on search button
	Then In school management match the school name value

@abhinav111
Scenario: Admin should be able to search by school code in advance search
	Given Admin should be in school management tab
	And Click for Advance Search
	And Enter school code "AU05"
	And click on search button
	Then Match the school code
	

	