Feature: feature to test login functionlity

@Log
  Scenario: Check login is successful with valid credentials
    When  user enters username and password
    And   clicks on login button

  @Log
  Scenario: Check First and Second Order Name from the List
    When  user enters username and password
    And   clicks on login button
    Given user should select first check box row
    When  user should select second check bow row
    And   clicks on Delete button

