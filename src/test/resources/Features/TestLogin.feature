Feature: Test Login Feature

  @testlogin
  Scenario: Verify login is successful with valid credentials
    Given browser is open
    When user enters uname and pword
    Then user navigates to home screen
