Feature: Adding address to user's account

  Scenario Outline: Logged user can add a new address.
    Given an open mystore login page
    When user logins with their valid credentials
    Then they can add their new address <alias>  <street> <house> <city> <zipcode> <phone>
    And quit the browser

    Examples:
    | alias          | street         | house | city      | zipcode | phone      |
    | My Address 02  | Oxford St      | 33    | Liverpool | L69     | 669797516  |


