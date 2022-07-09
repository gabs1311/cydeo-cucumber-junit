Feature: User should be able to login using correct credential


  Scenario:   Positive login scenario

    Given User is on the login page of web table application
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see url contains orders
  @wip
  Scenario:   Positive login scenario
    Given User is on the login page of web table application
    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders

      # implement this new step
      # create login method in WebTableLoginPage
      # this login method should have multiple different overloaded version