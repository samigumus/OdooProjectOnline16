@Customers
Feature: As a user I should be able use all the functionalities under CRM module and Customers Tab

  Background: open login page and login as events crm manager
    Given user is on the login page
    Then user logs in as event crm manager
    And user navigates to "CRM" then to "Customers"


    @Customers_PositiveTest
    Scenario: Verify search button is functioning(Positive Test)
      When user type a exciting customer account into search button and push the enter key
      Then user should be able to see responding account

  @Customers_NegativeTest
    Scenario: Verify search button is functioning(Negative Test)
      When user type a not exciting customer account into search button and push the enter key
      Then user should be able to see not existing account warning message