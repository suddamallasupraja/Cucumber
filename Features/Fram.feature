@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given user launches the browser
    And open URL "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html"
    When user switch to frame and clicks on package
    And switch back from the frame
    And switch to another frame and clicks on class
    And switch back from the frame
    And switch to another frame and clicks on search button
    And enter the data
    Then user able to see the data accordingly which he entered

  @tag9
  Scenario: 
    Given user launches the browser
    And open URL "https://ui.vision/demo/webtest/frames/"
    When user switch to frame3
    And switch to inside frame
    And clicks on i am a human radio button

  @tag8
  Scenario: 
    Given user launches the browser
    And open URL "https://jqueryui.com/checkboxradio/"
    When user clicks on all checkboxes
