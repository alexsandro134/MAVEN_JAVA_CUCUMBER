@datadriven
Feature: Register - Demo for DataDriven in Cucumber (Feature layer)

  Scenario: Register 01 - Pass data as parameter
    Given I open My Account page
    When I input email "automationvalid@gmail.com" and password "111111"
    And I click to login button
    And I quit browser

  Scenario: Register 02 - DataTable for only 1 step
    Given I open My Account page
    When I input email and password
      | User                      | Password |
      | automationvalid@gmail.com |   111111 |
    And I click to login button
    And I quit browser

  Scenario Outline: Register 03 - DataTable for whole scenario
    Given I open My Account page
    When I input email <User> vs password <Password>
    And I click to login button
    And I quit browser

    Examples: 
      | User                         | Password |
      | automationvalid@gmail.com    |   111111 |
      | automationvalid_01@gmail.com |   111111 |
      | automationvalid_02@gmail.com |   111111 |
      | automationvalid_03@gmail.com |   111111 |
