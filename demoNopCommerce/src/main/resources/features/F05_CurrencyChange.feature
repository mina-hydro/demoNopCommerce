Feature: user should be able to change currency

  Background: user should navigate to web page

    Scenario: user changes currency to euro
      When user select euro from currency dropdown

      Then the currency should be changed to euro