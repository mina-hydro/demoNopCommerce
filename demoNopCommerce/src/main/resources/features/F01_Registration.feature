Feature: user should be able to register to the website

  Background: user open browser and navigate to web page
    And user go to registration page

  Scenario: User could register with valid data
    When user enter valid data
    And user click on register button
    Then user should be registered successfully

