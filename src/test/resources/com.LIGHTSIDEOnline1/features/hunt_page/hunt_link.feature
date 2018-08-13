Feature: hunt page 

Background: 
	Given I open the sign in page with valid username "jalabaster7f@drupal.org" and password "terimapam"
	
@smoke_test
Scenario: Booking an available room
	When user get hunt for spot page 
	Then subtitle should be displayed 
	And user select valid date and time 
	Then user should be able to click on enabled search button
	Then subtitle should be displayed for free spot page
	Then user should be able to confirm an available room
	Then user should see schedule page
