Feature: user should be able to add products to shopping cart
   Background: user navigate to web page
     And user go to login page
     And user enter "smelly.cat.00c@gmail.com" and "P@ssw0rd"
     And hit the login button

  Scenario: user adds products to shopping cart with no need to go to product's page
    When user add any product to cart
    Then the item is added successfully message should appear
    And the item is added successfully to user's shopping cart

  Scenario: user adds products to shopping cart with need to go to product's page
    When user add any product to cart and go to product's page
    And click on add to cart
    Then the item is added successfully message should appear
    And the product is added successfully to user's shopping cart
