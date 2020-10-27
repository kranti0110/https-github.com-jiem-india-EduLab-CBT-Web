Feature: check google searh functionality

  Background: 
    Given open Google portal
    When Google home page visible

  @sanity @regression
  Scenario: Seacrh a well known person - Sachin
    Then enter search term "Sachin"
    When Search Result load succesfully
    Then verify page contain information related to "Sachin"
    And Verify webiste "wekipedia" is visible
    And Verify webiste "cricbuzz" is visible
    And Verify webiste "espninfo" is visible

  @smoke @regression
  Scenario: Seacrh a well known place - Mumbai
    Then enter search term "Mumbai"
    When Search Result load succesfully
    Then verify page contain information related to "Mumbai"
    And Verify webiste "website" should be "visible"
      | website    | visible |
      | wikipedia  | yes     |
      | makemytrip | yes     |
      | goibibo    | yes     |
      | xyz        | no      |
      | cricbuzz   | no      |
    And Verify webiste "espninfo" is visible
    And Verify webiste "website" should be "visible"
      | website    | visible |
      | wikipedia  | yes     |
      | makemytrip | yes     |
      | goibibo    | yes     |
      | xyz        | no      |
      | cricbuzz   | no      |

  @system @regression
  Scenario: Seacrh a well known thing - Chair
    Then enter search term "Chair"
    When Search Result load succesfully
    Then verify page contain information related to "Chair"
    And Verify webiste "wekipedia" is visible
    And Verify webiste "papperfry" is visible
    And Verify webiste "Amazon" is visible

  @sanity
  Scenario Outline: Seacrh a well known parts in google - <SearchTerm>
    Then enter search term "<SearchTerm>"
    When Search Result load succesfully
    Then verify page contain information related to "<SearchTerm>"
    And Verify webiste "website" should be "visible"
      | website    | visible |
      | wikipedia  | yes     |
      | makemytrip | yes     |
      | goibibo    | yes     |
      | xyz        | no      |
      | cricbuzz   | no      |

    Examples: 
      | SearchTerm |
      | Sachin     |
      | Mumbai     |
      | Chair      |
