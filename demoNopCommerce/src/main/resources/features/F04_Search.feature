Feature: user should be able to search on the products

  Background: user navigate to the web page

  Scenario: Logged User search for any product by name
    When user search with a product name like "apple" in search bar

    Then results related to the name searched should appear

    Scenario: user search by sku
      When user search using sku like "AP_MBP_13"
      Then a product related to the sku searched should appear
