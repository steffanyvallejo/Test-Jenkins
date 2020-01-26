Feature: Suma
	Calculate the suma value from customer
	
	Scenario: Suma two numbers -5 & -5
		Given I have a suma with -5 and -5
		When I add
		Then the result is -10
		
	Scenario: Suma two numbers 10 & 10
		Given I have a suma with 10 and 10
		When I add
		Then the result is 20
		
	Scenario: Suma two numbers 10 & -10
		Given I have a suma with 10 and -10
		When I add
		Then the result is 0
		
	