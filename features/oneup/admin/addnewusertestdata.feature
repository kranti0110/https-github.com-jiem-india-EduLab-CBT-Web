@smoke @oneup_smoke
Feature: Add new user with different test data

#Code written by Abhinav Pandey

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
	When User navigates to User page
	
  @bat
  Scenario: Add new user with valid data
  	Given Admin is on user management tab
  	When Clicks on Add new user button
  	Then Admin should land on Add new user page
  	And select school name
  	And select role
  	And admin fills test data
  	   | Abhinav | Pandey | valid test data | 
  	And Admin clicks on email and enter prefix value
    And clicks on save button
    Then admin should land on show user page
  
  @bat
  Scenario: Add new user with numeric values
    Given Admin is on user management tab
  	When Clicks on Add new user button
  	Then Admin should land on Add new user page
  	And select school name
  	And select role
  	And admin fills test data
  	  | Abhi | 456 | last name is numeric | 
  	And Admin clicks on email and enter prefix value
  	And clicks on save button
  	Then admin should be remain on create user page
  	
  	
  @bat
  Scenario: Add new user with blank values
    Given Admin is on user management tab
  	When Clicks on Add new user button
  	Then Admin should land on Add new user page
  	And select school name
  	And select role
  	And admin fills test data
  	  | | | fst and lst name is blank | 
  	And Admin clicks on email and enter prefix value
  	And clicks on save button
  	Then admin should be remain on create user page 
      
  
  	   
