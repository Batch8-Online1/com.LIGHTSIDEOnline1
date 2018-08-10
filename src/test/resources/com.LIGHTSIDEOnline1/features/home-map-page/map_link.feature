@smoke
Feature: verify home-map page links 

Background: 
	Given I log in to the application 

	
Scenario Outline: verify the links display 
	Then the "<menu>" should be displayed 
	Examples: 
		|menu|
		|map|
		|schedule|
		|hunt|
		|my|
		
Scenario Outline: Verify the rooms clickable 
	When I click "<roomname>" 
	Then I should see the rooms name "<roomname>" in title 
	Examples: 
		|roomname	|
		|berkeley	|
		|duke		|
		|stanford 	|
		|mit		|
		|harvard	|
		|yale		|
		|princeton	|
		
