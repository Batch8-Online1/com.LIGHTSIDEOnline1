Feature: Error message on the sign in page 

Background: 
	Given I open the sign in page 
	
Scenario: Sign in button 
	When User enter an email without password 
		|online1@gmail.com|
		|cybertek@gmail.com|
		|jalabaster7f@drupal.org|
		|teacherva6@gmail.com|
	Then verify the sign in button is not enable 
	

Scenario: Invalid email 
	When User try to sign in using invalid email "online1@gmail.com" and password "abcd" 
	Then the error message should be displayed 
	
	
Scenario: Invalid password 
	When User try to sign in using valid email "jalabaster7f@drupal.org" and invalid password "abcd" 
	Then the error message should be displayed 
@ert 	
Scenario Outline: Valid singin
	When User login with valid "<email>" and "<password>"
	Then Home page should be displayed 

	Examples:
	|email                      |password        |role			|
	|jalabaster7f@drupal.org    |terimapam       |team-leader	|
	|vtugman7k@joomla.org       |daryledikles    |student		|
	|sutting7v@liveinternet.ru  |leonardwarfield |Lead			|
	|teacherva5@gmail.com       |maxpayne        |teacher		|
	|gmcalister7n@google.nl     |arluenereolfo   |team-leader	|