Feature: Parabank Login

Scenario: Login to ParaBank
	Given User Invokes Parabank Login Page
	Then User validates username label
	Then User verifies User Name text box
	Then user verifies Password label
	Then user verifies Password textbox
	And User enters User Name
	And User enters Password
	And User clicks Login Button
	Then User is logged in
