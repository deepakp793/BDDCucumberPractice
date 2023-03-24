Feature: My Account Feature

  Scenario:Verify on successful login below options should display to user on my account page
    Given User click on Sign In
    When User Enter Username as "testemail1@gmail.com" and Password as "Password@1"
    And click on Sign In button
    And on successful login user click dropdown arrow and select My Account
    Then customer should see expected options on My Account page