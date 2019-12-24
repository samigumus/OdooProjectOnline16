Feature:
  As a user, I should be able to login into Odoo under different roles with username and password.

  @posmanager
  Scenario: Login as posmanager
    Given user is on the login page
    Then user logs in as posmanager
    And user verifies that "#Inbox" page subtitle is displayed