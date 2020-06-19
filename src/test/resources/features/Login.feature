@smoke
Feature: Login
  #As a user, I should be able to login

  Scenario: Login as POS manager
    Given I am on the login page
    When I login as a POS manager
    Then Page title should contain "Odoo"


  Scenario: Login
    Given I am on the login page
    When I login as a "CRM Manager"
    Then Page title should contain "Odoo"


  Scenario: Login
    Given I am on the login page
    When I login as a "Sales Manager"
    Then Page title should contain "Odoo"


  Scenario: Login
    Given I am on the login page
    When I login as a "Expenses Manager"
    Then Page title should contain "Odoo"


  Scenario: Login
    Given I am on the login page
    When I login as a "POS Manager"
    Then Page title should contain "Odoo"


  Scenario: Login
    Given I am on the login page
    When I login as a "Inventory Manager"
    Then Page title should contain "Odoo"




