Feature: Login Validation

  @tag1
  Scenario: Verify user logins successfully
    Given user is on login page
    When user enters username and password
    Then user verifies the login

  @tag2
  Scenario Outline: Verify user logins successfully
    Given user is on login page
    When user enters "<username>" and "<password>"

    Examples: 
      | username | password             |
      | tomsmith | SuperSecretPassword! |
      | tomsmith | SuperSecretPassword  |

  @tag3
  Scenario: Verify user logins successfully
    Given user is on login page
    When user enters the credentials
      | username | password             |
      | tomsmith | SuperSecretPassword! |
    Then user verifies the login
