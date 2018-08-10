Feature: Error message on the sign in page 

Background: 
	Given I open the sign in page 

Scenario: Invalid email 
	When I try to sign in using "<invalid email>" 
	Then the error message should be display 
	
Scenario: Invalid password 
	When I try to sign in using "valid email" 
	And I try to sign in using "invalid password" 
	Then the error message should be display "invalid password." 
	
