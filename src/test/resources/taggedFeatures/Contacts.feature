Feature: Contact CRUD Management

  @Regression
  Scenario: Create New Contact
    Given user is logged in
    When user create new contact

  @Smoke
  Scenario: View the contacts
    Given user is logged in
    When user view contact details

  @Sanity
  Scenario: Delete the deals
    Given user is logged in
    When user deletes a contact
