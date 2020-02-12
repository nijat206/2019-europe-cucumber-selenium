@All
Feature: Navigation Menu

  @Fleet
  Scenario: Navigate the top menu
    Given The sales manager should be main page
    When the sales manager should be able to navigate Fleet --> Vehicles modules
    Then the sales manager should see correct page url
  @Marketing
  Scenario: Navigate the top menu
    Given The sales manager should be main page
    When the sales manager should be able to navigate Marketing --> Campaigns modules
    Then the sales manager should see correct page url
  @Calendar
  Scenario: Navigate the top menu
    Given The sales manager should be main page
    When the sales manager should be able to navigate Activities --> Calendar Events modules
    Then the sales manager should see correct page url
