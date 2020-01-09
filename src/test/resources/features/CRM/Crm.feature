@Crm_Feature
Feature: CRM
  As a user, I should be able to see all their leads/opportunities in one location,
  manage them from one stage to another, and analyze their results


  Background: open login page and logs in as events crm manager go to CRM page
    Given user is on the login page
    Then user logs in as event crm manager
    And user navigates to "CRM"
    And user verifies that "Pipeline" page subtitle is displayed


  Scenario: checking column names
    And user verifies, that columns name columnNames are display
      | New         |
      | Approved    |
      | Proposition |
      | Qualified   |
      | Pending     |

            #    Then user finds pipeline by the "test1"
            #    And user moves pipeline to "Proposition" column
