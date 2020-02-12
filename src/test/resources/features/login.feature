@login
Feature: User should be able to login

  Background:
    Given the user is on the login page

  Scenario: login as a driver

    When the users enter the driver information
    Then the user should be able to login



    Scenario: Login as a sales manger
      When the users enter the sales manger information
      Then the user should be able to login



      Scenario: Login as a store manager
        When the users enter the store manger information
        Then the user should be able to login