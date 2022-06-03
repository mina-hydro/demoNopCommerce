Feature: users will be able to open sliders in home page
  Background: user navigates to web page

  Scenario: first slider is clickable on home page
    When user click on slider "1"
    Then user should be directed to page with relative products

  Scenario: second slider is clickable on home page
    When user click on slider "2"
    Then user should be directed to page with relative products to second slider