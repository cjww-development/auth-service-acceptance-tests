@Registration
Feature: User registration
  Scenario: The user is going to register as an organisation
    Given the user is on the org registration page
    And the user has entered their org registration information
    |      key        |     value       |
    |    orgName      |   TestOrgName   |
    |    initials     |      TUN        |
    |   orgUserName   |    tOrgUser     |
    |    location     |  Test Location  |
    |    orgEmail     |   foo@bar.com   |
    |    password     | testPassword123 |
    | confirmPassword | testPassword123 |
    Then the user is redirected to the registration success page that displays org account info

  Scenario: The user is going to register as an individual
    Given the user is on the individual registration page
    And the user has entered their user registration information
    |      key        |      value      |
    |    firstName    |     TestFN      |
    |    lastName     |     TestLN      |
    |    userName     |      tUser      |
    |     email       |  foo1@bar1.com  |
    |    password     | testPassword123 |
    | confirmPassword | testPassword123 |
    Then the user is redirected to the registration success page the displays user account info