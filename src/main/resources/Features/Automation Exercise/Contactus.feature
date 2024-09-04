Feature: Automation Excercise Contact Us

Background:

	Given Launch browser
	When Navigate to google homepage
	Then Type AUTOMATION EXCERCISE text in the search bar and press enter
	And Click on the homepage link
	

Scenario Outline:

	When User click on Contact Us button
	Then User verify GET IN TOUCH is visible
	Then Enter <Name>, <Email>, <Subject> and <Message>
	Then Click on SUBMIT button
	And Click on OK button on alert box
	Then Verify success message SUCCESS! YOUR DETAILS HAVE BEEN SUBMITTED SUCCESSFULLY is visible
	Then Click on HOME button and verify that user landed to home page successfully
	Then Close the browser
	
	Examples:
	
		| Name | Email               | Subject  | Message |
		| Test | test@automation.com | Greeting | Hello   |
		
		