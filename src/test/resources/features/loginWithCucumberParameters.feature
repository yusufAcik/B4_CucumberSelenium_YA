@regression
Feature: Login tests with cucumber parameters

  #mike
  @mikeParameter @parameterizeMethods
  Scenario: Login with Mike - Cucumber Parameters
    Given The user is on the login page
    When The user logs in using "mike@gmail.com" and "mike1234"
    Then The user should be able to login
    Then Validate that username is "mike"

    #John
  @johnParameter @parameterizeMethods
  Scenario: Login with John - Cucumber Parameters
    Given The user is on the login page
    When The user logs in using "john@gmail.com" and "John1234."
    Then The user should be able to login
    Then Validate that username is "John"

      #Eddie Murphy
  @eddieParameter @parameterizeMethods
  Scenario: Login with Eddie - Cucumber Parameters
    Given The user is on the login page
    When The user logs in using "eddiem@kraft.com" and "eddiem12"
    Then The user should be able to login
    Then Validate that username is "Eddie Murphy"

    @c_ScenarioOutline
  Scenario Outline: Different "<name>" user type
    Given The user is on the login page
    When The user logs in using "<userEmail>" and "<password>"
    Then Validate that username is "<name>"
    Examples:
      | userEmail        | password  | name         |
      | mike@gmail.com   | mike1234  | mike         |
      | john@gmail.com   | John1234. | John         |
      | eddiem@kraft.com | eddiem12  | Eddie Murphy |

