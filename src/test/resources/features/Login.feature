@AccServices
Feature: Logging in
  Scenario: The user is going to sign in as an individual
    Given the user is on the login page
    And the user has entered some login credentials
    |     key     |       value       |
    |  userName   |       tUser       |
    |  password   |  testPassword123  |
    Then the user is redirected to the service director page

  Scenario: The user is going to sign in as an organisation
    Given the user is on the login page
    And the user has entered some login credentials
      |     key     |       value       |
      |  userName   |       LUSCC       |
      |  password   |  testPassword123  |
    Then the user is redirected to the service director page

  Scenario: The user is going to sign in and fail authentication
    Given the user is on the login page
    And the user has entered some login credentials
      |     key     |     value     |
      |  userName   |    invalid    |
      |  password   |    invalid    |
    Then the user is presented with the login screen containing errors