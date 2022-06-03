Feature: user should be able to select different categories

  Background: user navigate to the web page

  Scenario: user could select different Categories
    When user hover on any category
    And select an subcategory

    Then user should be directed to that sub category