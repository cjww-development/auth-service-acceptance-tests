@Shutdown
Feature: Shutdown browser
  Scenario: Shutdown the browser
    Then teardown the test individual user
    |      key       |     value   |
    |  testUserName  |     tUser   |
    | credentialType |  individual |
    Then teardown the test org user
    |      key       |     value     |
    |  testUserName  |    tOrgUser   |
    | credentialType |  organisation |
    Then shutdown the browser