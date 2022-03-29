Feature: Test Orange HRM Functionality

  Scenario: Test Login Functionality
    Given user is on Login Page
    When user enter valid and valid password
    Then user is on home page
