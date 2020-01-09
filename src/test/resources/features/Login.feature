Feature:Login
  As a user, I should be able to login into Odoo under different roles with username and password.

  @posmanager
  Scenario: Login as pos manager
    Given user is on the login page
    Then user logs in as pos manager
    And user verifies that "#Inbox" page subtitle is displayed

  @eventmanager
  Scenario: Login as event crm manager
    Given user is on the login page
    Then user logs in as event crm manager
    And user verifies that "#Inbox" page subtitle is displayed