@tag
Feature: Calculator
  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 1 | 12 | 13 |
      | -1 | 6 | 5 |
      | 2 | 2 | 4 |


  Scenario: compute useless calculation
    Given Two input values, 64 and 4
    When I compute the square root of two numbers divided
    Then I expect the result to be 4


  Scenario Outline: compute useless calculation
    Given Two input values, <first> and <second>
    When I compute the square root of two numbers divided
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 4     | 1      | 2      |
      | 36    | 4      | 3      |