@tempp	
Feature: myself information 

Scenario: my self 
	Given user logs in using "jalabaster7f@drupal.org" "terimapam" 
	When the user go to the my self page 
	Then the user verify all information 
	
	
Scenario Outline: Teacher accessing test 
	Given user logs in using "<email>" "<password>" 
	When the user go to the my self page 
	Then user verify user is "teacher" 
	Then user should see dark-side on the menu page 
	
	Examples: 
		|email                       	| password  	|
		|teacherva4@gmail.com			|markwohlberg	|		
		|teacherva5@gmail.com			|maxpayne		|
		|teacherva6@gmail.com			|sergeybrin		|	
 
Scenario Outline: Student accessing test 
	Given user logs in using "<email>" "<password>" 
	When the user go to the my self page 
	Then user verify user is "student-team-member" 
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
		When the user go to the team page
		Then user should verify all members have same "<group>" 
		Examples: 
			|   email                         	| password  		|group		|
			|jalabaster7f@drupal.org			|terimapam			|TheCrew	|	
			|daldie7l@seattletimes.com			|ruthannjohnes		|CodeHunters|
			|gmcalister7n@google.nl				|arluenereolfo		|Spark		|
			|apobred@hotmailmail.com			|bredpenhalurick	|Django		|
			|sutting7v@liveinternet.ru			|leonardwarfield	|Nukes		|
			|finkles7z@studiopress.com			|hadleyclimer		|Microsoft	|
			|strayford84@e-recht24.de			|carlosmichie		|Frostbite	|
			|cbrose86@cbslocal.com				|garrikheis			|Bugbusters	|
			
