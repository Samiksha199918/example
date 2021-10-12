Feature: Addition

  Scenario: Addition of two number
    Given I have two variables "10" & "19"
    When I do addition
    Then result should display in Console

  Scenario: Addition of two number with List
    Given I have two variables as below
      |  8 |
      | 10 |
    When I do addition
    Then result should display in Console

  Scenario: Addition of two number with Map
    Given I have two variables as Map
      | num1 | 80 |
      | num2 | 10 |
    When I do addition
    Then result should display in Console
