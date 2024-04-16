Feature: Creating New Account

  Background:
    Given User navigate to the Parabank Website
    And user enters valid username and password
    When user clicks the "login" button
    Then user confirms the successful login

  Scenario Outline: Open New Account
    When user clicks the "Open New Account" button
    Then user should be directed to the "openaccount" page
    And user selects the "<Account>" type from the "account type menu"
    And user should see the "A minimum of $2,000.00 must be deposited" message under selected account
    And user selects the <min Balance Account> from the "account menu"
    When user clicks the "Open New Account" button on the main content
    Then user confirms the opening new account
    And user should see the account number clickable
    Examples:
      | Account  | min Balance Account |
      | CHECKING | 1                   |
      | SAVINGS  | 2                   |

