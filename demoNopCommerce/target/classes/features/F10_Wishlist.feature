Feature: logged user can add products to wishlist
  Background: user should navigates to the web page
    And user go to login page
    And user enter "smelly.cat.00c@gmail.com" and "P@ssw0rd"
    And hit the login button

  Scenario: user adds product to wishlist with no need to open the product's page
    When user click on the heart icon below the product to add it to wishlist

    Then "the product has been added successfully" message appear
    And the product should be added to the wishlist

  Scenario: user adds product to wishlist with need to open the product's page
    When user click on the heart icon below the product to add it to wishlist with need to go to product's page
    And click on it again in the product's page

    Then "the product has been added successfully" message appear
    And the product chosen should be added to the wishlist