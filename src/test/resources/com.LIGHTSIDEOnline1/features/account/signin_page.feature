Feature: sign in 

Background:
	Given I open the sign in page 
	And email and password fields should be display 
	
	#using excel file
Scenario: verify email and password 
	When I write email and password 
	And I click "webelement sign in"
	Then title should be "map" 
