@mock
Feature: mock test

  @orange
  Scenario Outline: Orange hrm
    Given user launches the browser
    And navigate to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When user enters user name and password
    And click on login
    Then user navigates to homepage
