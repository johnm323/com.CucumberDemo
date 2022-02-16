Feature: Search Feature

  @search
  Scenario: Verify user is able to search successfully
    Given launch the browser
    And user is  on google search page
    When user enters text in search box
    And clicks enter
    Then user should navigate to search result screen
