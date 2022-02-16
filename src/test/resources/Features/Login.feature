Feature: Login Feature

  @smoke
  Scenario: Verify user is able to login successfully
    Given is on login screen
    When user enters username and password
    And clicks on login button
    Then user should be navigated to home screen
