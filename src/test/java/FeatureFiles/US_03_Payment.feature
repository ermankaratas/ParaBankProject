Feature: Bill Payment

  Background:
    Given User navigate to the Parabank Website
    And user enters valid username and password
    When user clicks the "login" button
    Then user confirms the successful login

  Scenario Outline: Paying different types of bills
    When user clicks the "Bill Pay" button
    And user fills the "Bill Payment" Form
      | payeeName           | <Bill Type>           |
      | payeeAddress        | <Address Information> |
      | payeeCity           | <City>                |
      | payeeState          | <Region>              |
      | payeeZipCode        | <Zip Code>            |
      | payeePhoneNumber    | <Phone Number>        |
      | payeeAccountNumber  | <Account Number>      |
      | verifyAccountNumber | <Verify Account>      |
      | paymentAmount       | <Payment Amount>      |
    And user clicks the "Send Payment" button on the main content
    And user should see the "Bill Payment Complete" title
    Examples:
      | Bill Type     | Address Information | City         | Region | Zip Code | Phone Number | Account Number | Verify Account | Payment Amount |
      | Electric Bill | Example Address 1   | Sharon ville | OH     | 45241    | 896547       | 654789         | 654789         | 250            |
      | Water Bill    | Example Address 2   | Bedford      | NH     | 03110    | 321456       | 789456         | 789456         | 300            |
      | Gas Bill      | Example Address 3   | Detroit      | MI     | 48204    | 987456       | 123456         | 123456         | 350            |