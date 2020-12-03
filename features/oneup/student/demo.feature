Feature: Feature to test demo functionality

  Background: Students login as a new user
    Given Student is on oneup login page
    When Student enters valid username and password
    And clicks on login button
    Then user navigates to home page

  @bat
  Scenario: Student is able to navigate to Demo test tab
    Given Student is on demo study tab and clicks on Test Tab
    Then user navigates to Demo test tab
    And clicks on yellow strip link

  @bat
  Scenario: Student is able to navigate to Demo report tab
    Given Student is on demo test tab and clicks on report tab
    Then student navigates to Demo report tab
    And clicks on view result
    Then user should redirect to sample pdf report

  @bat
  Scenario: Student is able to navigate to Demo remedial tab
    Given Student is on demo report tab and clicks on remedial tab
    Then Student navigates to Demo remedial tab
    And Matches the text on webpage

  @bat
  Scenario: Profile icon is clickable and other options should also be there
    When Student logged in oneup portal and clicks on profile icon
    Then Profile options should be visibile
