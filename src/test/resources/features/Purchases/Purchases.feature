@purchases
Feature: Purchases

  Background: open login page and logs in as purchases manager go to Purchases page
  @purchases
   Scenario: Verify column names
    Given user is on the login page
    And user logs in as purchases manager
    Then user navigates to "Purchases" and then to "Incoming Products"
    And user verifies that column names are displayed

  | Expected Date   |
  | Date            |
  | Source Document |
  | Product         |
  | Initial Demand  |
  | Status          |



  @create_incoming_product
  Scenario: Create an an incoming product
    Given click Create button
    Then adds new product information:

      | Reference       | Source Location             | Destination Location         | Product        | Initial Demand | Source Document | Procurement Group| Purchase Order Line |
      | [13] Ice Cream  | Partner Locations/Customers | Partner Locations/Customers  | [13] Ice Cream | 20000          | doc1            | PO00276           |                    |

    Then click Save button



  @export_product
  Scenario: Export existing product


  @delete_product
  Scenario: Delete existing product
