Feature: Parabank Login

Scenario: Login to ParaBank
	Given User Invokes parabank login page
	When User enters "john" and "demo"
	And User clicks on login button
	Then User verifies home screen displays



#Feature: Create request
#	@Regression
#	Scenario: Create a customer request for accessories
#		Given User launch SRMS application
#
#		When User choose "Accessories" from the category
#		And User choose "A SKATE BAG" from the style
#		And User choose "Black/White" from the color
#		And user click on search button
#		Then User verifies the select size screen
#		When User select type "Men" from select size screen
#		And User select size "OS (M Mens)" from select size screen
#		And User click on "REQUEST" button
#		And User navigates to "PICK" screen
#		Then Verify user created a customer request in pick list
#