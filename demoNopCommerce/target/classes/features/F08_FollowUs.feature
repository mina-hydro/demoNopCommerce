Feature: users could open followUs links

  Background: user go to web page

    Scenario: user opens facebook link
      When user click on "facebook" icon
      Then user should be redirected to "https://www.facebook.com/nopCommerce" in new tap


    Scenario: user opens twitter link
      When user click on "twitter" icon
      Then user should be redirected to "https://twitter.com/nopCommerce" in new tap


  Scenario: user opens rss link
    When user click on "rss" icon
    Then user should be redirected to "https://demo.nopcommerce.com/new-online-store-is-open" in new tap


  Scenario: user opens youtube link
    When user click on "youtube" icon
    Then user should be redirected to "https://www.youtube.com/user/nopCommerce" in new tap
