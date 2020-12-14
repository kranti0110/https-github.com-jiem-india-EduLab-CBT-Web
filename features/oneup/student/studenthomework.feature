Feature: Student Homework Module


Background: TC2_verifyLoginWithValidCred_pagetitle
Given Open "ONEUP_PORTAL"
When User navigates to Login Page
When User login with "ONEUP_VALID_USER"
Then verify the pagetitle as "OneUp-Adaptive Assessment Test"

@bat
Scenario: Student checks the homework and submit the same
Given User Clicks on Homework Link
Then verify the Page Title
Then User Clicks on Download worksheet
Then User Uploads the homework
Then User Logout