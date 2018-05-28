Feature: Login with facebook using invalid credentials
Description: The purpose of this feature to test Login with facebook using invalid credentials

Scenario: Login with facebook using invalid credentials
	Given User is on Facebook Home Page
	When User Navigate to Login Section
	And User enters the username and password
	And User Click on Login Button
	Then Message displayed Login Failed
