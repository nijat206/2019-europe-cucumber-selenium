Feature: Login with parameters

  @wip
  Scenario Outline: Login as a driver
    Given login as a driver
    When user logs in using <username> and <password>
    Then the title should contains "Dashboard"
    Examples:
      | username    | password          |

      | "user11" | "UserUser123" |


