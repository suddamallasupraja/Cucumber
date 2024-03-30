@tag
Feature: Testing the overall thing

  @tag1
  Scenario: Testing Everything
    Given user launches the browser
    And navigate to "https://blazedemo.com/"
    When user clicks on destination page
    And user naviagtes to respective page
    And revert back from that page
    And user choose the departure city as paris
    And user choose the destination city as london
    And click on find flights
    And click on choose the flight which has lowest price
    And click on purchase flight
    #Then user should navigate to purchase confirmation page
    #And store the id
