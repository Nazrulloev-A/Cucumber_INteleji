Feature: feature to test login functionlity

  @SmokeTest
  Scenario: Check login is successful with valid credentials
    Given user is on the login page
    When  user enters username and password
    And   clicks on login button

