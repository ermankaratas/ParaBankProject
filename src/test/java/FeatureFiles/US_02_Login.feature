Feature: Login

  Background:
    Given User navigate to the Parabank Website

  Scenario: Login with valid user information
    And user enters valid username and password
    When user clicks the "login" button
    Then user confirms the successful login
    But user clicks the "logout" button

  Scenario Outline: Login with invalid user information
    And user enters invalid "<username>" and "<password>"
    When user clicks the "login" button
    Then user should see the "<message>" error message
    Examples:
      | username    | password     | message                       |
      | Invaliduser | WrongPass123 | internal error has occurred   |
      |             | WrongPass123 | enter a username and password |
      | Invaliduser |              | enter a username and password |
      |             |              | enter a username and password |