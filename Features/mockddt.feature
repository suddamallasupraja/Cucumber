@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario outline
    Given user launches the browser
    And navigate to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When user enters "<user name>" and "<password>"
    And click on login
    Then user navigates to homepage

    Examples: 
      | user name | password |
      | Admin     | admin    |
      | Admin     | admin123 |
