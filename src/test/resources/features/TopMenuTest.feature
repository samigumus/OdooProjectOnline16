@top_menu
  Feature: Top Menu Test
    #don't run with headless mode. cause of driver windows size is not enough for catching sub modules

    Scenario: Check all sub modules
      Given user is on the login page
      Then user logs in as pos manager
      And user verifies that "#Inbox" page subtitle is displayed
      And user navigates to "Calendar"
      And user verifies that "Meetings" contains page subtitle is displayed
      And user navigates to "Notes"
      And user verifies that "Notes" page subtitle is displayed
      And user navigates to "Contacts"
      And user verifies that "Contacts" page subtitle is displayed
      And user navigates to "CRM"
      And user verifies that "Pipeline" page subtitle is displayed
      And user navigates to "Sales"
      And user verifies that "Quotations" page subtitle is displayed
      And user navigates to "Website"
      And user verifies that "Dashboard" page subtitle is displayed
      And user navigates to "Point of Sale"
      And user verifies that "Point of Sale" page subtitle is displayed
      And user navigates to "Purchases"
      And user verifies that "Requests for Quotation" page subtitle is displayed
      And user navigates to "Inventory"
      And user verifies that "Inventory" page subtitle is displayed
      And user navigates to "Manufacturing"
      And user verifies that "Manufacturing Orders" page subtitle is displayed
      And user navigates to "Repairs"
      And user verifies that "Repair Orders" page subtitle is displayed
      And user navigates to "Project"
      And user verifies that "Projects" page subtitle is displayed
      And user navigates to "Events"
      And user verifies that "Events" page subtitle is displayed
      And user navigates to "Surveys"
      And user verifies that "Surveys" page subtitle is displayed
      And user navigates to "Employees"
      And user verifies that "Employees" page subtitle is displayed
      And user navigates to "Attendances"
      And user verifies that error message
      And user navigates to "Leaves"
      And user verifies that "All Leaves" contains page subtitle is displayed
      And user navigates to "Expenses"
      And user verifies that "My Expenses to Submit" page subtitle is displayed