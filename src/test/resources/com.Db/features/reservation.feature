@retemp
Feature: reserve a room 
Scenario: reserve
	Given user logs in using "efewtrell8c@craigslist.org" "jamesmay" 
#	When user get hunt for spot page
    And the user select day "25" from "time" to "time"
    And the user select the "room"
    Then reservation info matches db records
    
    