
Feature: Delete Account Functionality
 
#Backgroud:
	#	Given Launch the Browser and Load the URL
   # And Login into application 
 
 Scenario: Validate Delete Account
    When Click viewAll in App Launcher and select Actions option
    And Select the account name 'Mohan' and click Delete 
    Then Click Delete button from alert
    And Verify the deleted acct name not found in list

