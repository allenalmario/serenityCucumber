Feature: Test login functionality of Swag Labs

  Scenario Outline: User logs in with valid credentials
    Given web browser is open
    When user is on login page with the given url "https://www.saucedemo.com/v1/"
    And user enters valid username "<username>"
    And user enters valid password "<password>"
    And user clicks on login button
    Then user should be on products page with the given url "https://www.saucedemo.com/v1/inventory.html"

    Examples:
      | username | password |
      | standard_user | secret_sauce |
      | problem_user | secret_sauce |
      | performance_glitch_user | secret_sauce |