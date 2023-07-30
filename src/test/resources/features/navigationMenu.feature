@regression
Feature: Navigation Menu Tests

  @Mike
  Scenario: Navigation to Developers Menu
    Given The user is on the login page
    When Login as Mike
    Then Validate that Dashboard text is visible
    When Go to Developers Menu
    Then Validate that Developers text is visible

    @Sebastian @smoke
    Scenario: Navigation to Forms/Input Menu
      Given The user is on the login page
      When Login as Sebastian
      Then Validate that Dashboard text is visible
      When Go to Forms-Input Menu
      Then Validate that General Forms Elements - Input text is visible

      @John
      Scenario: Navigation to My Profile Menu
        Given The user is on the login page
        When Login as John
        Then Validate that Dashboard text is visible
        When Go to my profile menu
        Then Verify that User Profile text is visible