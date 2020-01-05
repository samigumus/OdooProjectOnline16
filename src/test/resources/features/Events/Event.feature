@events
Feature: Event
  As a user (events crm master), create, verify, edit and delete an events.

  Background: open login page and logs in as events crm manager go to Events page
    Given user is on the login page
    Then user logs in as event manager
    And user navigates to "Events"
    And user verifies that "Events" page subtitle is displayed

  @create_event
  Scenario: Create an event
    Given click Create button
    Then adds new event information:

      | Event Name | Start Date       | End Date         |
      | Birthday   | 11/14/2020 12:00 | 11/15/2020 12:00 |

    Then click Save button
    Then click Confirm Event button
    And user navigates to "Events"

  @verify_event
  Scenario: Verify created event by user


  @edit_event
  Scenario: Edit existing event and save


  @delete_event
  Scenario: Delete existing event



