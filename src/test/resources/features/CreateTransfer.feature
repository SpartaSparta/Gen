Feature: Transfer

  Background:
    Given I am on the login page
    When I login as a "Inventory Manager"

  @wip
  Scenario: User is able to create a transfer under Inventory module
    Given I click on "Inventory" module
    When I click on "Transfers" submenu
    And I click on "Create" button
    And I enter random Partner






