Feature: Parabank Login Regression

Background:
	Given User Invokes parabank login page

Scenario Outline: Login to ParaBank
	When User enters 'john' and 'demo'
	And User clicks on login button
	Then User verifies home screen displays

Examples: {'groups':['SmokeTest', 'LoginRegression']}

Scenario Outline: Verify Login Screen
	Then User validates username text displays
	And User validates username textbox displays
	And User validates password text displays
	And User validates Password textbox displays

Examples: {'groups':['LoginRegression']}

