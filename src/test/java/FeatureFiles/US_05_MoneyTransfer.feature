Feature: Money transfer

  Background:
    Given User navigate to the Parabank Website
    And user enters valid username and password
    When user clicks the "login" button
    Then user confirms the successful login

  Scenario: Money transfer between users accounts
    Given user clicks the "Transfer Funds" button
    And user selects the 0 from the "from account menu"
    And user selects the 1 from the "to account menu"
    And user enters "200" to the "amount" field
    When user clicks the "transfer" button on the main content
    Then user confirms the transaction with the message "Transfer Complete!" on the title

  Scenario: Verify money transfer transaction
    Given user clicks the "Accounts Overview" button
    And user clicks the "first account" button on the main content
    # (//table[@id='accountTable']//td/a)[1]
    And user clicks the "last transaction" button on the main content
    # (//table[@id='accountTable']//td/a)[last()]
