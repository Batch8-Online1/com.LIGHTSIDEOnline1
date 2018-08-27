Feature: verify home-map page links 

Background: 
	Given user logs in using "jalabaster7f@drupal.org" "terimapam"
	
Scenario: verify the links display 
	Then the menu should be displayed  
		|map|
		|schedule|
		|hunt|
		|my|
		
Scenario Outline: Verify the rooms clickable 
	When I click each room "<roomname>" 
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
		
