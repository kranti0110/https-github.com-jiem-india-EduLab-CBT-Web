@smoke @oneup_smoke
Feature:  Add New Homework feature

Background: User is Logged In
    Given Open "ONEUP_PORTAL"
    When User navigates to Login Page
    When User login with "ONEUP_ADMIN"
    When User navigates to Master Data
	  When User navigates to Schedule homework menu

  @bat
  Scenario: Verify page header on add new homework page
  When user clicks on Add New Homework button
  When User nevigates to Add new Homework Page
  Then verify the header as "ADD NEW HOMEWORK"
  
  @bat
  Scenario: Add new Homework by entering all valid data
  When user clicks on Add New Homework button
  When User nevigates to Add new Homework Page
  Then user selects HW date
  Then user select school name
  Then user select grade
  Then user selects section
  Then user select subject
  #And select question worksheet
  #And Attach Answer keys
  Then select Enable Answer Key Date
  Then select Homework Due Date
  Then User enters the message and topic
  | Message |Topic |
  | Please check the homework |Arithmatics|
  Then user click on save
  
  @bat
  Scenario: Add new homework-By keeping all the fields empty and verify the mandatory error messages
  When user clicks on Add New Homework button
  When User nevigates to Add new Homework Page
  Then user click on save
  Then verify the date error message as "Date is required"
  Then verify the school error message as "School name is required"
  Then verify the grade error message as "Grade is required"
  Then verify the topic error message as "Topic is required"
  Then verify the homework due date error message as "Enable Answer Key Date is required"
  
  @bat
  Scenario: Add new homework - Cancel add new homework by adding few few fields 
  When user clicks on Add New Homework button
  When User nevigates to Add new Homework Page
  Then user selects HW date
  Then user select school name
  Then user select grade
  Then user selects section
  Then user select subject
  Then select Homework Due Date
  Then user click on Cancel
  Then user nevigate to Schedule homework list page
  
  @bat
  Scenario: Search schedule homework by entering all valid data in advance search
  When User clicks on advance search
  Then user selects HW date
  Then user select school name
  Then user select grade
  Then user selects section
  Then click on search 
  
  @bat
  Scenario: Search homework by blank values
  When User clicks on advance search
  Then click on search
  Then verify the date error message as "Date is required"
  Then verify the school error message as "School name is required"
  Then verify the grade error message as "Grade is required"
  Then verify the section error message as "Section is required"
  
  @bat
  Scenario: Delete Schedule homework
  When User clicks on advance search
  Then user selects HW date
  Then user select school name
  Then user select grade
  Then user selects section
  Then click on search 
  When user clicks on delete icon
  When user verifies the delete confirmation msg "Are you sure you want to delete scheduled homework?"
  Then User clicks on Cancel
  
  @bat
  Scenario: Delete Schedule homework
  When User clicks on advance search
  Then user selects HW date
  Then user select school name
  Then user select grade
  Then user selects section
  Then click on search 
  When user clicks on delete icon
  When user verifies the delete confirmation msg "Are you sure you want to delete scheduled homework?"
  Then User clicks on Delete
  Then verify the page header text as "Homework haven't added yet."
  
  
  
   
  
  
  
  
  
  