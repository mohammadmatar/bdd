Feature: Search using google.com
Description: Search for Selenium word using google.com

Scenario: Search for Selenium word using google.com
	Given User is on Google Home Page
	When User Click on Search bar
	And User enter Selenium word
	And User Click on Google Search Button
	Then Search Results displayed 