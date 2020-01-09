Feature: Create a new Customer
  As a user I should be able to create new customer account under CRM module and Customers tab.

  @createcustomer
  Scenario: create a new customer account
    Given user logs in as pos manager
    And user navigates to "CRM" module
    Then user navigates to "Customers" tab
    And user clicks on create button
    Then enters the given credentials
    When user clicks on save button
    Then verify the "actual" title equals to "expected"
