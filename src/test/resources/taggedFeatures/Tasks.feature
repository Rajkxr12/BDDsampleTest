Feature: Task CRUD Management

  @Regression
  Scenario: Create New tasks
    Given user is logged in
    When user create new tasks

  @Smoke
  Scenario: View the tasks
    Given user is logged in
    When user view task details

  @Sanity
  Scenario: Delete the tasks
    Given user is logged in
    When user deletes a task
