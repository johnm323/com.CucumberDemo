Feature: Test Login Feature with parameterization


  @parameterLogin
Scenario Outline: Verify login is successful with valid credentials1
Given browser is open1
When I enter "<username>" and "<userpassword>"
Then user navigates to home screen1

Examples:
|username| userpassword |
|Raghav| 12345|
|Ele| 12345|
