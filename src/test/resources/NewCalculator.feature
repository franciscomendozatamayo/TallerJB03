Feature: Calculator
  Scenario: Add numbers

    Given I have access to calculator
    When I click in the "8" button
    * I click in the "add" button
    * I click in the "9" button
    * I click in the "equal" button
    Then the result should be "17"