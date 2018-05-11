Feature: Track Order

  Scenario: Track order which is not presented in system
    Given Browser Opened and Application launched
    When click on Track Order Link
    And Enter Order ID, Email Id and click on Search
    Then Error should be displayed

    
   Scenario: Track order which is presented in system
    Given Browser Opened and Application launched
    When click on Track Order Link
    And Enter Order ID, Email Id and click on Search
    Then Order details should be displayed
 