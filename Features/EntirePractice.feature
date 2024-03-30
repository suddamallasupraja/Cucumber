@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given user launches the browser
    And navigate to "https://blazedemo.com/"
    When user clicks on destination of the week
    And user navigate to previous page
    And user chooses the departure city as "Mexico City"
    And user chooses the destination city as "London"
    And clicks on find flights
    And choose the flight which has lowest price

	@without
	Scenario:
		Given user launches the browser
		And navigate to "https://blazedemo.com/"
		When user choose the departure city as "Mexico City" 
			
