@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given user launches the browser
    And navigate to "https://blazedemo.com/"
    When user chooses the departure city as "Mexico City"
    And user chooses the destination city as "London"
    And clicks on find flights
    And user navigates to particular page
    And user navigates to back page and to front page
    And choose the flight which has lowest price
    And check the field total cost 
    And clicks on purchase flight button
    Then user should navigate to purchase conformation page 
    And store the id
    
    
    
    

