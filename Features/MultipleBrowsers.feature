@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given user launches the browser
    And open URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When switch to another tab and open URL "https://www.amazon.in/"
    And switch to another tab and open URL "https://www.flipkart.com/"
    And switch to another tab and open URL "https://demo.opencart.com/"
    Then capture all windowsids and switch back to amazon
