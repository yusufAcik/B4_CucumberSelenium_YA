Feature: Data Driven Testing in Cucumber

  @c_ddf
  Scenario Outline: DDF Login Test
    Given The user is on the login page
    When The user enters "<sheetName>" and row number <rowNumber>
    Then The user verify that account name is equal "<sheetName>" <rowNumberForName>
    And The user verify that job name is equal <rowNumberForJob> in the "<sheetName>"
    Examples:
      | sheetName | rowNumber | rowNumberForName | rowNumberForJob |
      | QA 1      | 0         | 0                | 0               |
      | QA 1      | 1         | 1                | 1               |
      | QA 1      | 2         | 2                | 2               |
      | QA 1      | 3         | 3                | 3               |
      | QA 1      | 4         | 4                | 4               |