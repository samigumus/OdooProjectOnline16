Feature:Login
  As a user, I should be able to login into Odoo under different roles with username and password.

  @posmanager
  Scenario: Login as pos manager
    Given user is on the login page
    Then user logs in as pos manager
    And user verifies that "#Inbox" page subtitle is displayed

  @eventmanager
  Scenario: Login as event manager
    Given user is on the login page
    Then user logs in as event manager
    And user verifies that "#Inbox" page subtitle is displayed


    @crm
    Scenario: Login as events crm manager
      Given user is on the login page
      Then user logs in as event crm manager
      And user verifies that "#Inbox" page subtitle is displayed


  @negative_test

  Scenario: Verify that warning message is displayed when password is not correct

    Given user is on the login page

    Then user enters "posmanager35@info.com" username and "wrong" password

    And user verifies that "Wrong login/password" message is displayed



  @negative_test

  Scenario: Verify that warning message is displayed when username is not correct

    Given user is on the login page

    Then user enters "wrong_username" username and "posmanager" password

    And user verifies that "Wrong login/password" message is displayed

