Feature: Tag Test

  @smokeTest
  Scenario: Verify Tag1
    Given browser is open
    When user enters uname and pword
    Then user navigates to home screen


  @regressionTest
  Scenario: Verify Tag2
    Given browser is open
    When user enters uname and pword
    Then user navigates to home screen