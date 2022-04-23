Feature: Create an account

  @SmokeTest
  Scenario: Open the new site
    Given I open the site into the browser
    When I click on subscribe button
    Then I should see create account page

  @Test
   Scenario: Create a new account
    Given I open the site into the browser
    When I click on subscribe button
    And I should see create account page
    And I enter all required information
    And I click on create account button
    Then I should see dashboard page
