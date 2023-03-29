Feature: check_url

  @sanityTest
  Scenario: Verfiy Luma website is loaded on launching URL
    Given user click on provided url
    Then Verify Luma website is launched