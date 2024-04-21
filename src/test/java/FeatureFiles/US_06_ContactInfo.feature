Feature: Update Contact Information

  Background:
    Given User navigate to the Parabank Website
    And user enters valid username and password
    When user clicks the "login" button
    Then user confirms the successful login

  Scenario Outline: Updating Contact Information Successfully
    When user clicks the "Update Contact Info" button
    Then user updates the Form
      | firstName   | <First Name>   |
      | lastName    | <Last Name>    |
      | address     | <Address>       |
      | city        | <City>         |
      | state       | <State>        |
      | zipCode     | <Zip Code>     |
      | phoneNumber | <Phone Number> |
    And user clicks the "Update Profile" button on the main content
    Then user clicks the "logout" button
    And user enters valid username and password
    When user clicks the "login" button
    And user clicks the "Update Contact Info" button
    Then user confirms the form information is updated
      | firstName   | <First Name>   |
      | lastName    | <Last Name>    |
      | address     | <Address>       |
      | city        | <City>         |
      | state       | <State>        |
      | zipCode     | <Zip Code>     |
      | phoneNumber | <Phone Number> |

    Examples:
      | First Name | Last Name | Address      | City        | State | Zip Code | Phone Number |
      | John       | Doe       | 123 Main St | New York    | NY    | 10001    | 5551234567   |
      | Alice      | Smith     | 456 Elm St  | Los Angeles | Ca    | 90001    | 5559876543   |