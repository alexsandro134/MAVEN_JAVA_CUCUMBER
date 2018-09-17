@payment_commonSteps
Feature: PAYMENT FEATURE
  As an Automation Tester
  I want to check payment process
  So that I can make sure this function work well

  Scenario: [PRE-DATA] - REGISTER/ LOGIN
    # Put in particular page steps
    Given I get login url
    And I click to here link
    
    When I input to "" textbox with data ""
    When I input to "" textbox with random data ""
    When I click to "" button
    When I input to "" textarea with data ""
    When I input to "" textarea with random data ""
    When I click to "" radio button
    When I open "" page
    
    # Dynamic
    When I input to "emailid" textbox with random data "automation@gmail.com"
    And I click to "Submit" button
    And I get infor of User ID
    And I get infor of Password
    And I open login page again
    And I input to UserID textbox
    And I input to Password textbox
    And I click to "LOGIN" button
    Then I verify Homepage displayed with message "Welcome To Manager's Page of Guru99 Bank"

  Scenario Outline: [TC_01] - CREATE NEW CUSTOMER
    Given I open "New Customer" page
    When I input to "name" textbox with data "<CustomerName>"
    And I click to "rad1" radio button with data "<Gender>"
    And I input to "dob" textbox with data "<DateOfBirth>"
    And I input to "addr" text area with data "<Address>"
    And I input to "city" textbox with data "<City>"
    And I input to "state" textbox with data "<State>"
    And I input to "pinno" textbox with data "<Pin>"
    And I input to "telephoneno" textbox with data "<Phone>"
    And I input to "emailid" textbox with random data "<Email>@gmail.com"
    And I input to "password" textbox with data "<Password>"
    And I click to "Submit" button
    And I get infor of Customer ID
    Then Verify created or edited successfully with message "Customer Registered Successfully!!!"
    And I verify expected data at "Customer Name" text in table with actual data "<CustomerName>"
    And I verify expected data at "Birthdate" text in table with actual data "<DateOfBirth>"
    And I verify expected data at "Address" text in table with actual data "<Address>"
    And I verify expected data at "City" text in table with actual data "<City>"
    And I verify expected data at "State" text in table with actual data "<State>"
    And I verify expected data at "Pin" text in table with actual data "<Pin>"

    Examples: 
      | CustomerName | Gender | DateOfBirth | Address     | City       | State   | Pin    | Phone      | Email      | Password |
      | Auto Test    | m      | 1989-10-10  | 123 Address | Binh Duong | Thu Dau | 123321 | 0123456987 | automation |   123456 |

  Scenario Outline: [TC_02] - CREATE 2 NEW ACCOUNTs
    Given I open "New Account" page
    When I input to Customer ID
    And I select value is "<AccountType>" in dropdown list "selaccount"
    When I input to "inideposit" textbox with data "<DepositAmount>"
    And I click to "submit" button
    Then Verify created or edited successfully with message "Account Generated Successfully!!!"
    And I get infor of first account
    When I open "New Account" page
    And I select value is "<AccountType>" in dropdown list "selaccount"
    When I input to "inideposit" textbox with data "<DepositAmount>"
    And I click to "submit" button
    Then Verify created or edited successfully with message "Account Generated Successfully!!!"
    And I get infor of second account

    Examples: 
      | AccountType | DepositAmount |
      | Current     |         50000 |

  Scenario Outline: [TC_03] - DEPOSIT TO ACCOUNT
    Given I open "Deposit" page
    When I input to first account number
    When I input to "ammount" textbox with data "<FisrtAmount>"
    When I input to "desc" textbox with data "<DepositDes>"
    And I click to "Submit" button
    Then Verify created or edited successfully with message "Transaction details of Deposit for Account"

    Examples: 
      | FisrtAmount | DepositDes         |
      |       50000 | Deposit to Account |
