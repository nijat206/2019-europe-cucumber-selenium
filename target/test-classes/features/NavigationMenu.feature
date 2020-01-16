@Navigate
  Feature:  Users should be able to navigate through the menus

    Scenario: go to Menu option and click Fleet and click the Vehicles

    Scenario: navigate to Fleet --> Vehicles
      Given the user enters the sales manager credentials
      When the user navigates to the Fleet-Vehicles page
      Then the user should see the page URL: https://qa3.vytrack.com/entity/fleet

    Scenario: navigate to Marketing --> Campaigns
      Given the user enters the sales manager credentials
      When the user navigates to the Marketing-Campaigns page
      Then the user should see the page URL: https://qa3.vytrack.com/campaign

    Scenario: navigate to Activities --> Calendar Events
      Given the user enters the sales manager credentials
      When the user navigates to the Activities-Calendar Events page
      Then the user should see the URL: https://qa3.vytrack.com/calendar/event