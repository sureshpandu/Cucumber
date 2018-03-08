Feature: Login in naukri

  Scenario: upload resume in naukri
    Given Navigate to naukri home page click on login
    When User enter valid username and password
    And click on enter
    Then logged in successfully
