Feature: Adding new address


  Scenario Outline: Logged in user can add new address.
    Given an open hotel-test-lab login page
    When user logins with valid credentials: <email> <password>
    Then they can add a new address
    And quit the browser

    Examples:
      | email               | password  |
      | test@test631387.com | Abc435353 |