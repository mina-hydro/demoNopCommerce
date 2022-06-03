Feature: user should be able to rest his password

  Background: user navigate to web page
    And user go to login page

  Scenario:  User could reset his/her password successfully
    When user click on 'forgot password'
    And enter his valid email "smelly.cat.00c@gmail.com" and click on "recover" button

    Then email with instructions should be sent to him