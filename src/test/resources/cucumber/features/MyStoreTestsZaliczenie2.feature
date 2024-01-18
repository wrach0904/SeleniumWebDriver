Feature: Ordering Hummingbird Printed Sweater

  Scenario Outline: Logged user can order a Hummingbird Printed Sweater
    Given a logged in user
    When a Hummingbird Printed Sweater <size> size <quantity>x is added to the cart
    Then user buys the products <delivery> <payment>
    And receipt screenshot is taken
    And user checks order history
    And quit the browser

    Examples:
      | size | quantity | delivery  | payment  |
      | M    | 5        | pick      | check    |