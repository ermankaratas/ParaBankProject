Feature: Open a new user account (register)
  Background:
    Given User navigate to the Parabank Website
  Scenario:
    When user clicks the "register" button
    Then user fills the registration information
    And user clicks the "submit" button
    And user should see the "Your Account was created successfully" message
