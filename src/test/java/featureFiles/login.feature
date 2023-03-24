Feature: Login Feature


  Scenario Outline: Verify User should able to login after entering valid username and password
    Given  User click on Sign In
    When User Enter Username as "<username>" and Password as "<password>"
    And click on Sign In button
    Then User should able to login

    Examples:
      | username | password |
      | testemail1@gmail.com | Password@1 |


    Scenario:Warning msg displays when we enter wrong password or username
      Given User click on Sign In
      When User Enter Username as "testmeil@gamil.com" and Password as "wpassword"
      And click on Sign In button
      Then User should not be login and error message displays



