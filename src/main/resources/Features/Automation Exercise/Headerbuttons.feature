Feature: Automation Exercise Header Buttons

Background:

	Given Launch browser
	When Navigate to google homepage
	Then Type AUTOMATION EXCERCISE text in the search bar and press enter
	And Click on the homepage link
	
Scenario:

	When User verify that home page is visible successfully
	Then User clicks on PRODUCT button
	Then Verify user is navigated to product page successfully
	Then User clicks on CART button
	Then Verify user is navigated to cart page successfully
	Then User clicks on TEST CASES button
	Then Verify user is navigated to test cases page successfully
	Then User clicks on API TESTING button
	Then Verify user is navigated to api page successfully
	Then User clicks on VIDEO TUTORIALS button
	Then Verify user is navigated to video tutorials page successfully
	And Close the browser
