Feature: Parabank Login

Scenario: Login to ParaBank
	Given User Invokes parabank login page
	When User enters 'john' and 'demo'
	And User clicks on login button
	Then User verifies home screen displays

#//