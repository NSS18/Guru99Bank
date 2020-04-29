Feature: Login

  Background:
    Given User is on login page

  @login
  Scenario: User should able to login
    When User enters valid UserID "mngr258045" and Valid Password "emYjupU"
    Then User should able to login successfully


  @invalidLogin
  Scenario Outline: User should not be able to login
    When I enter invalid "<UserID>" and "<Password>"
    Then I should see error message

    Examples:
      | UserID | Password   |
      | abc    | 123        |
      |        | 123sdasd3e |
      |        |            |
      #| abc    |           |






