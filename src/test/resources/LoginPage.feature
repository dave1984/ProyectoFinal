Feature: Log into the page

  Scenario: User enters valid credentials
    Given I open the site into the browser
    When I click on login button
    And I enter valid credentials
    Then I should see dashboard page

  Scenario: User enters invalid credentials
    Given I open the site into the browser
    When I click on login button
    And I enter invalid credentials
    Then I should see dashboard page