Feature: Automation Exercise Registration

Background:

	Given Launch browser
	When Navigate to google homepage
	Then Type AUTOMATION EXCERCISE text in the search bar and press enter
	And Click on the homepage link
	
	
Scenario Outline:

	When User verify that home page is visible successfully
	Then Click on SIGNUP / LOGIN button
	Then Verify NEW USER SIGNUP! text is visible
	Then Enter name as <Name> and email address as <Email>
	And Click on SIGNUP button
	Then Verify that ENTER ACCOUNT INFORMATION text is visible
	Then Fill details: TITLE, PASSWORD as <Password> and DATE OF BIRTH
	Then Fill details: <First_name>, <Last_name>, <Company>, <Address>
	Then Select COUNTRY and Fill details: <State>, <City>, <Zipcode>, <Mobile_Number>
	And Click on CREATE ACCOUNT button
	Then Verify that ACCOUNT CREATED! text is visible
	Then Click on CONTINUE button
	Then Verify that Logged in as <Name> is visible
	Then Click on DELETE ACCOUNT button
	Then Verify that ACCOUNT DELETED! text is visible and click on CONTINUE button
	Then Close the browser
	
	
	Examples:
		| Name | Email	              | Password | First_name | Last_name | Company | Address   | State | City | Zipcode | Mobile_Number | 
		| Test | test2@automation.com | test123  | Test       | User      | company | 123avenue | state | city | 012345  | 1234567890    |