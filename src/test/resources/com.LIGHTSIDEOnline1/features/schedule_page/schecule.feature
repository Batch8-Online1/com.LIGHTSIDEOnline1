Feature: schedule page

Scenario: verify the schedule information
	Given I log in to the application 
	When I click "webelement schedule link"
	Then the title should be "schedule" 