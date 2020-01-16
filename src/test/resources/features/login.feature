@login
Feature: User should be able to login

  @driver @smoke
  Scenario: login as a driver
    Given the user is on the login page
    When the users enter the driver information
    Then the user should be able to login

    @salesManager @smoke
    Scenario: Login as a sales manger
      Given the user is on the login page
      When the users enter the sales manger information
      Then the user should be able to login

      @storeManager
      Scenario: Login as a store manager
        Given the user is on the login page
        When the users enter the store manger information
        Then the user should be able to login