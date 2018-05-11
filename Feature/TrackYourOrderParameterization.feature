Feature: Track Order

  Scenario: Track order which is not presented in system
    Given Browser Opened and Application launched
    When click on Track Order Link
    And Enter "12345", "productowner@abc.com" and click on Search
    Then Error should be displayed

  
 