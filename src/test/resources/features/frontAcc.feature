Feature: Login functionality

  Scenario Outline: To do data driven testing on login functionality
    Given user is on Login Page
    When user enters user name as "<un>" & password as "<pwd>" & clicks on the Login Button
    Then Login "<LoginType>" happen

    Examples: 
      | un       | pwd      | LoginType        |
      | demouser | password | should happen    |
      | admin    | admin123 | should Not happen|
      | hr       | hr123    | should Not happen|
