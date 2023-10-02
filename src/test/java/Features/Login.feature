Feature: Application Login

Scenario: Home Page should be display while login
    Given User is landing on login page
    When User logging into application using UserName and PassWord
    Then Home Page is displayed
    And Account Balance is displayed
