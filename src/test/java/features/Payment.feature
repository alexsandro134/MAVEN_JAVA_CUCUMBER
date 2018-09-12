@payment
Feature: Payment function

  Scenario: Login to App
    Given I input to username "mngr152931"
    And I input to password "dAmumYb"
    And I click to Login button
    Then I verify Homepage displayed

  Scenario: Create New Customer
    Given I click to New Customer page
  #And I input all information to New Customer form
  #And I click to Submit button
  
  Scenario: Edit Customer
    Given I click to Edit Customer page
