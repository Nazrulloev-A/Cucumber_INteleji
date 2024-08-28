Feature: Test login functionality

  @Log
  Scenario Outline: Check login is successful with valid credentials
    Given user enters "<username>" and "<password>"
    When  user clicks on the login button
    Then  user should select the first checkbox row
    And   user should select the second checkbox row
    And   user clicks on the Delete button

    Examples:
      | username | password |
      | Tester   | test     |
