Feature: Automation Exercise E-commerce Site

Background:
Given user needs to open the browser
When user navigates to google homepage
Then user needs to type automation exercise in the search bar and press enter
And click the homepage link


Scenario Outline:
When user needs to select signup link
Then user enters <name> and <email>
And click on signup button
Then user clicks on title
Then user needs to create password <password>
Then user needs to select date of birth
Then user enter first name as <firstname>
Then user enter last name as <lastname>
Then user enter address as <address>
Then user enter state as <state>
Then user enter city as <city>
Then user enter zipcode as <zipcode>
Then user enter mobile number as <number>
And click on create account button
Then verify account created message
And click on continue button
Then click on delete account button
Then verify account deleted message
And click continue
Then close the browser

Examples:
| name | email 			      |password|firstname | lastname | address  | state | city | zipcode | number    |
| test | test2@automation.com |test123 |test      | user     | 123avenue| state | city | 012345  | 1234567890|



