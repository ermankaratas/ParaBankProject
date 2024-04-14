Feature: Open a new user account (register)

  Background:
    Given User navigate to the Parabank Website

  Scenario:
    When user clicks the "register" button
    Then user fills the "Registration" Form
      | firstName       | Joseph      |
      | lastName        | Eis         |
      | address         | X road 3    |
      | city            | Milan       |
      | state           | Italy       |
      | zipCode         | 312918      |
      | phoneNumber     | 56587468764 |
      | ssn             | 821         |
      | username        | joseph99    |
      | password        | 1234567     |
      | confirmPassword | 1234567     |
    And user clicks the "register" button on the main content
    And user should see the "Your account was created successfully" message
