@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario
    Given user launches the browser
    And open URL "https://jqueryui.com/datepicker/"
    When user clicks on datefield
    And choose the "<day>" and "<month>" and "<year>"

    Examples: 
      | day | month  | year |
      |  16 | August | 2023 |
