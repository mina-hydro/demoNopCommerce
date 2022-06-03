Feature: user should be able to login

  Background: user navigate to the website
    And user go to login page

  Scenario: user enter valid user name and valid password

    When user enter "smelly.cat.000c@gmail.com" and "P@ssw0rd"
    And hit the login button

    Then user should be logged in successfully
    And user should be directed to home page