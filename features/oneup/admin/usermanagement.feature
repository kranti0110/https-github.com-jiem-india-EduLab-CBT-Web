@smoke @oneup_smoke
Feature: User Management

#Code written by Abhinav Pandey

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
	When User navigates to User page


#Below scenarios are related to add new user


  Scenario: Admin should able to add new user
    Given Admin is on user management tab
  	When Clicks on Add new user button
  	Then Admin should land on Add new user page
  	And select school name
  	And select role
  	And Admin clicks on first name and enter value
  	And Admin clicks on last name and enter value
  	And Admin clicks on email and enter prefix value
  	And Add some notes
  	And clicks on save button
  	Then Admin lands in show user page
#  	And clicks on user list
#  	Then all the data should save


  Scenario: Scearch in text box
    Given Admin is on user management tab
    When Admin search text "Prakhar"
    Then Match displaying record msz
    
#    Then Entered name and first name should match
 


  Scenario: User should get the data as per selected records
    Then user should land to user management page
    And click record box
    Then user should able to select record value
    Then Match displaying record msz for values
    

 
  Scenario: Admin should get the results as per search first name
    Given User is on user management page and click for advance search
    And Clicks on first name and enter value
    And click on search button
    Then match text of first name element

 
  Scenario: Admin should get the result as per search last name
  	Given User is on user management page and click for advance search
  	And Clicks on last name and enter value
  	And click on search button
  	Then match text of last name element
  	

  Scenario: Admin should get the result as per search email id
  	Given User is on user management page and click for advance search
  	And Admin clicks on email and enter value "nikita.shinde+3@jiem.in"
  	And click on search button
  	Then match the text of first email locator
  	

  Scenario: Admin should get the result as per selected Role
  	Given User is on user management page and click for advance search
  	And select role
  	And click on search button
  	Then match the role value
  	

  Scenario: Admin should get the result as per selected school
  	Given User is on user management page and click for advance search
  	And In advance search selecting school
  	And click on search button
  	Then match the school name value
  	
  	
#  Editing user details

  Scenario: Editing created user with invalid values
    Given Admin is on user management tab
    When Admin search text "Prakhar"
    And clicks on edit icon
    Then admin should be on edit user page
    And check school name is editable
    And check email field is editable
    And enter new value in first name "123"
    And enter new value in last name "456"
    And enter new value in notes "Text updated by automated script 456"
    And clicks on save button
    Then Admin should remain in edit user page
    
  	

  Scenario: Editing created user with one blank value
    Given Admin is on user management tab
    When Admin search text "Prakhar"
    And clicks on edit icon
    Then admin should be on edit user page
    And check school name is editable
    And check email field is editable
    And enter new value in first name ""
    And enter new value in last name "456"
    And enter new value in notes "Text updated by automated script"
    And clicks on save button
    Then Admin should remain in edit user page  	


  Scenario: Editing created user with two new value
    Given Admin is on user management tab
    When Admin search text "Prakhar"
    And clicks on edit icon
    Then admin should be on edit user page
    And check school name is editable
    And check email field is editable
    And enter new value in first name "Prakha"
    And enter new value in last name "Auto"
    And enter new value in notes "Text updated by automated script"
    And clicks on save button
    Then Admin lands in show user page   	


  Scenario: Editing created user with valid values
    Given Admin is on user management tab
    When Admin search text "Prakhar"
    And clicks on edit icon
    Then admin should be on edit user page
    And check school name is editable
    And check email field is editable
    And enter new value in first name "Prakhar"
    And enter new value in last name "Auto"
    And enter new value in notes "Text updated by automated script"
    And clicks on save button
    Then Admin lands in show user page 
  	
#  Deleting created user


  Scenario: Deleting created user
    Given Admin is on user management tab
    When Admin search text "Prakha"
    And click on delete icon
    
    

  Scenario: Doing status inactive scenario
    Given Admin is on user management tab
  	When Clicks on Add new user button
  	Then Admin should land on Add new user page
  	And select school name
  	And select role
  	And Admin clicks on first name and enter value
  	And Admin clicks on last name and enter value
  	And Admin clicks on email and enter prefix value
  	And Add some notes
  	And clicks on save button
  	And clicks on user list
  	Then Admin is on user management tab
  	When Admin search text "Prakhar"
  	And clicks on edit icon
    Then admin should be on edit user page
    And change the status from active to inactive
    And clicks on save button
    And clicks on user list
    Then Admin is on user management tab
    When Admin search text "Prakhar"
    Then Match displaying record msz
    
    
  	
  	
  	
	
  	