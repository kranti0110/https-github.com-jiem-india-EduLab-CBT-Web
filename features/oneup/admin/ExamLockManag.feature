@smoke @oneup_smoke
Feature: Exam Lock Management

#Code written by Abhinav Pandey

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page

	
#Locking exam at admin portal

Scenario: Search for exam to lock	
    When User login with "ONEUP_ADMIN"
	When User navigates to Exam unlock management
	Given Admin is on exam unlock management tab
	When Admin selects school from dropdown
	And Admin selects grade from dropdown
	Then click on exam unlock search buttons
	When Click on edit icon to lock the maths exam
	When Click on edit icon to lock the science exam
	Then Title should be unlock the exam

#unLocking exam at admin portal

Scenario: Search for exam to unlock	
    When User login with "ONEUP_ADMIN"
	When User navigates to Exam unlock management
	Given Admin is on exam unlock management tab
	When Admin selects school from dropdown
	And Admin selects grade from dropdown
	Then click on exam unlock search buttons
	When Click on edit icon to unlock the maths exam
	When Click on edit icon to unlock the science exam
	Then Title should be unlock the exam

#Locking exam at admin portal and corresponding checking on students account

Scenario: Locking exam at admin portal and veryfying same on students account
	When User login with "ONEUP_ADMIN"
	When User navigates to Exam unlock management
	Given Admin is on exam unlock management tab
	When Admin selects school from dropdown
	And Admin selects grade from dropdown
	Then click on exam unlock search buttons
	When Click on edit icon to lock the maths exam
	When Click on edit icon to lock the science exam
	And Logout from admin portal
	Then User should be on login page
	# Entering student credentials to do the login
	When User enters username "abhinavpandey104+test1@gmail.com"
	And User enters password "123456"
	And clicks on login button
	Then User should be on My Study tab
	And Clicks on My Test tab
	Then Check take Test button for Mathematics
	And Check take Test button for Science


Scenario: Ulocking exam at admin portal and veryfying same on students account
	When User login with "ONEUP_ADMIN"
	When User navigates to Exam unlock management
	Given Admin is on exam unlock management tab
	When Admin selects school from dropdown
	And Admin selects grade from dropdown
	Then click on exam unlock search buttons
	When Click on edit icon to unlock the maths exam
	When Click on edit icon to unlock the science exam
	And Logout from admin portal
	Then User should be on login page
	# Entering student credentials to do the login
	When User enters username "abhinavpandey104+test1@gmail.com"
	And User enters password "123456"
	And clicks on login button
	Then User should be on My Study tab
	And Clicks on My Test tab
	Then Check take Test button for Mathematics
	And Check take Test button for Science
	
	
	