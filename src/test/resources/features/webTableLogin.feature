Feature: User should be able to login using correct credential
  Scenario:   Positive login scenario
    Given User is on the login page of web table application
    When user enters  "username"
    And user enters  "password"
    And user clicks to login button
    Then user should see url contains orders
