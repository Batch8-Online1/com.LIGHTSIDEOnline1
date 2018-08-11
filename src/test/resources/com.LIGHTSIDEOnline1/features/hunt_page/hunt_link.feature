@test
Feature: hunt page 

Background: 
	Given I open the sign in page with valid "jalabaster7f@drupal.org" and "terimapam"
	

Scenario: Booking an available room
	When user get hunt for spot page 
	Then subtitle should be displayed 
	And user select valid date and time 
	Then user should be able to click on enabled search button
	Then subtitle should be displayed for free spot page
	

Scenario: Schedule an available room
	When user get free spot page 
	Then user should be able to select an available room
	And user should be able to click confirm button
	Then user should see schedule page
