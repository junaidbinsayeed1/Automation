Feature: Automation Exercise Products

Background:

	Given Launch browser
	When Navigate to google homepage
	Then Type AUTOMATION EXCERCISE text in the search bar and press enter
	And Click on the homepage link
	
	
Scenario: 

	When User click on PRODUCT button
	Then Verify user is navigated to ALL PRODUCTS page successfully
	When The products list is visible
	Then Click on VIEW PRODUCT of second product
	When User is landed to product detail page
	Then Verify that detail is visible: product name, category, price, availability, condition, brand
	And Close the browser