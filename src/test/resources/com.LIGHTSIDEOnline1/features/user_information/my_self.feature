Feature: myself information 

Scenario: my self 
	Given user logs in using "jalabaster7f@drupal.org" "terimapam" 
	When the user is on the my self page 
	Then the user verify all information


Scenario Outline: Teacher accessing test
	Given user logs in using "<email>" "<password>" 
	When user hovers over "webelement my link" 
	Then user verify user is "a teacher"
	Then user should see dark-side on the menu page 
		
	Examples: 
	|email                       	| password  	|
	|teacherva4@gmail.com			|markwohlberg	|		
	|teacherva5@gmail.com			|maxpayne		|
	|teacherva6@gmail.com			|sergerbrin		|	
		
Scenario Outline: Student accessing test
	Given user logs in using "<email>" "<password>" 
	When user hovers over "webelement my link" 
	Then user verify user is "a student"
	Then user should NOT see dark-side on the menu page 
		
	Examples: 
	|email                       	| password  		|
	|sdarben7g@alibaba.com			|angiecoatham		|		
	|vtugman7k@joomla.org			|daryledikles		|
	|bczadla7p@uol.com.br			|humphreyalsop		|		
	|kodonnelly7t@bigcartel.com		|robertamurrison	|	
	|marblaster82@patch.com			|rosanneloadman		|	


Scenario Outline: TeamMembers test 
	Given user logs in using "<email>" "<password>" 
	When user hovers over "webelement my team" 
	Then user should verify all members have same group   
Examples: 
	|   email                         	| password  		|
	|jalabaster7f@drupal.org			|terimapam			|	
	|daldie7l@seattletimes.com			|ruthannjohnes		|
	|gmcalister7n@google.nl				|arluenereolfo		|
	|apobred@hotmailmail.com			|bredpenhalurick	|
	|sutting7v@liveinternet.ru			|leonardwarfield	|
	|finkles7z@studiopress.com			|hadleyclimer		|
	|strayford84@e-recht24.de			|carlosmichie		|
	|cbrose86@cbslocal.com				|garrikheis			|

