Feature: Salesforce New Account Creation Functionality
#background has all the common steps for all test cases
#Backgroud:
		#Given Launch the Browser and Load the URL
    #And Login into application
  
  Scenario Outline: Create New Account
    When Click viewAll and select Actions
    And Click New button
    And Enter the Account Name as <AcctName>
    And Select Ownership as Public
    Then Click on the Save button
    And check Account Name

 Examples:
 |AcctName|
 |'geetha'|
 |'Mohan'|
 |'Priya'|