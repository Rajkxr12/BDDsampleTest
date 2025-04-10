Feature: Deals CRUD Management

  @Regression
  Scenario: Create New deals
    Given user is logged in
    When user create new deals

  @Smoke
  Scenario: View the deals
    Given user is logged in
    When user view deals details

  @Sanity
  Scenario: Delete the deals
    Given user is logged in
    When user deletes a deal
