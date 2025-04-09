Feature: Booksearch Test

  #Background: Given user is on homepage

  @book
  Scenario: Novel Book search Test
    Given user is on homepage
    When user search the novel books
    Then user should get novel books result

  @book
  Scenario: Fantasy Book search Test
    Given user is on homepage
    When user search the Fantasy books
    Then user should get Fantasy books result
