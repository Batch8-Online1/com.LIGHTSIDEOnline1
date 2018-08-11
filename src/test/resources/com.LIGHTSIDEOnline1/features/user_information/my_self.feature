Feature: myself information 

@temp
Scenario Outline: 
	Given as a "<name>" log in in the application 
	When I hover over "webelement my link" 
	Then I should see user information on the page 
		|<name>|<role>|<team>|<batch>|<campus>|
		
	Examples: 
		|name|role|team|batch|campus|
		|Teri Mapam|team-lead|The Crew|none|VA|
		|Angie Coatham|student|The Crew|#8|VA|
		|Bennett Tomanek|student|The Crew|#8|VA|
		|Mariann Dewi|student|The Crew|#8|VA|
		
		
		
#Scenario Outline: verify myteam information 
#	Given as a "<role>" log in in the application 
#	And I click "webelement team link" 
#	Then I verify all team members name and roles on the page 
#		|<name>|<role>|
#		
#	Examples: 
#		|role            |
#		|team-leader        |
#		|teacher    |
#		|student        |
#		|Lead            |