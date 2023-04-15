Feature: Place E2E order

  Scenario: Verify user is able to place E2E order successfully for Tees
    Given User login to WebSite with Username as "testemail1@gmail.com" and Password as "Password@1"
    Given User select Tees from Dropdown
    And User select Tees as "Strike Endurance Tee"
    And User select size as "M" and color as "Black"
    And click on Add to Cart
    Then Verify successfully added message displays
    And User click on shopping cart
    And click on proceed to checkout
    And click on next on Shipping Page
    And click on place order
    And verify order is successfully placed
