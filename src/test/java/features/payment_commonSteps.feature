@payment_commonSteps
Feature: PAYMENT FEATURE
  As an Automation Tester
  I want to check payment process
  So that I can make sure this function work well

  Scenario Outline: [PAYMENT] - NEW CUSTOMER
    # Put in particular page steps
    Given I input to "uid" textbox with data "mngr152931"
    And I input to "password" textbox with data "dAmumYb"
    When I click to "btnLogin" button
    Then I verify Homepage displayed
    When I open "New Customer" page
    And I input to "name" textbox with data "<Name>"
    And I click to "m" radio button
    And I input to dob textbox with data "<Dob>"
    And I input to "addr" textarea with data "<Address>"
    And I input to "city" textbox with data "<City>"
    And I input to "state" textbox with data "<State>"
    And I input to "pinno" textbox with data "<Pin>"
    And I input to "telephoneno" textbox with data "<Phone>"
    And I input to "emailid" textbox with random data "<Email>"
    And I input to "password" textbox with data "<Password>"
    And I click to "sub" button
    Then I verify success message displayed with "Customer Registered Successfully!!!"
    And I verify expected data at "Customer Name" label equal actual data "<Name>"
    And I verify expected data at "Birthdate" label equal actual data "<Dob>"
    And I verify expected data at "Gender" label equal actual data "male"
    And I verify expected data at "Address" label equal actual data "<Address>"
    And I verify expected data at "City" label equal actual data "<City>"
    And I verify expected data at "State" label equal actual data "<State>"
    And I verify expected data at "Pin" label equal actual data "<Pin>"
    When I get Customer ID

    Examples: 
      | Name      | Dob        | Address     | City   | State    | Pin    | Phone      | Email       | Password |
      | Auto Test | 1991-04-13 | 123 Address | Ha Noi | Cau Giay | 123456 | 0123456999 | Automation_ |   111111 |

  Scenario: [PAYMENT] - EDIT EXISTING CUSTOMER
    Given I open "Edit Customer" page
    When I input to Customer ID
    And I click to "AccSubmit" button

  Scenario Outline: [TC_02] - CREATE 2 NEW ACCOUNTs
    Given I open "New Account" page
    When I input to Customer ID
    And I select value is "<AccountType>" in dropdown list "selaccount"
    When I input to "inideposit" textbox with data "<DepositAmount>"
    And I click to "button2" button
    Then I verify success message displayed with "Account Generated Successfully!!!"
    And I get infor of first account
    When I open "New Account" page
    And I input to Customer ID
    And I select value is "<AccountType>" in dropdown list "selaccount"
    And I input to "inideposit" textbox with data "<DepositAmount>"
    And I click to "button2" button
    Then I verify success message displayed with "Account Generated Successfully!!!"
    And I get infor of second account

    Examples: 
      | AccountType | DepositAmount |
      | Current     |         50000 |

  Scenario Outline: [TC_03] - DEPOSIT TO ACCOUNT
    Given I open "Deposit" page
    When I input to first account number
    When I input to "ammount" textbox with data "<FisrtAmount>"
    When I input to "desc" textbox with data "<DepositDes>"
    And I click to "AccSubmit" button
    Then I verify success message displayed with "Transaction details of Deposit for Account"

    Examples: 
      | FisrtAmount | DepositDes         |
      |       50000 | Deposit to Account |
