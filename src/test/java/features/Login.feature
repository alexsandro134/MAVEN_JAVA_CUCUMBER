@run_automation
Feature: Validation for Login function
  As an Automation Tester
  I want to validator for Login function
  So that I make sure this function work well

  @email_pass_empty
  Scenario: Login with email and password empty
    Given I open application
    And I open My Account page
    Then The My Account page should be show
    When I input email "" and password ""
    And I click LOGIN button
    And The error message "This is a required field." displayed at email field
    And The error message "This is a required field." displayed at password field
