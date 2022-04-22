Feature: Create a new survey

  Scenario: Create a new survey
    Given I open the site into the browser
    When I click on login button
    And I enter valid credentials
    And I click on login button
    And I click on create survey button
    And I click on start from zero
    And I fill all survey information out
    And I click on create survey button
    Then I should see new created survey


  Scenario: Edit exist survey
    Given I open the site into the browser
    When I click on login button
    And I enter valid credentials
    And I click on login button
    And I click on options button
    And I click on edit button
    Then I should edit the survey