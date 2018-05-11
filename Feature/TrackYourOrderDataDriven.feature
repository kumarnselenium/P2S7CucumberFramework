Feature: Track Order

  Scenario Outline: Track order which is not presented in system
    Given Browser Opened and Application launched
    When click on Track Order Link
    And Enter orderID as <OrderID> and EmailID as <EmailID> and click on Search
    Then Error should be displayed

  Examples:
 	| OrderID | EmailID |
 	| "123456" | productowner@abc.com |
 	| "7890144" | businessanalyst@abc.com |	