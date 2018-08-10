Feature: myself information 


Scenario: verify myself information 
	Given I log in the application 
	When I hover over "webelement my link" 
	And I click "webelement self link" 
	Then I verify user information 
	
	