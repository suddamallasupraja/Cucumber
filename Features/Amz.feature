@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given user launches the browser
    And navigate to "https://www.amazon.in/"
    When user search for facewash
    And user should be able to see the face wash page
    And user clicks on "cetaphil rice face wash"
    And user should be able to see the face wash
    And set the quantity to "2"
    And click on buy now
    And choose the payment method as other upi apps
    And place the order
    Then order should be placed
