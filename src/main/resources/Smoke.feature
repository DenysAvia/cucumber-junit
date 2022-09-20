Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario: Check home page main functions
    Given User opens 'https://zooleader.com.ua' page
    And User checks search field visibility
    And User checks header visibility
    And User checks footer visibility
    And User checks cart visibility
    And User checks language switch visibility
    And User checks register button visibility
    And User checks login button visibility
    And User checks contact visibility
    And User checks shipping-payment visibility
    And User checks blog visibility
    And User checks feedback visibility
    When User clicks Sign in button
    And User checks email and password fields visibility
    Then User checks that Sign in page url contains word 'login'

  Scenario: Check product page main functions
    Given User opens 'https://zooleader.com.ua' page
    And User checks search field visibility
    When User makes search by keyword 'Royal Canin Urinary Care'
    And User clicks search button
    And User clicks on first product
    And User checks compare button visibility
    And User checks wish list button visibility
    And User checks product name visibility
    And User checks info button visibility
    And User checks product characteristics button visibility
    And User checks product feedback button visibility
    And User checks product buy button visibility
    And User clicks on buy product button
    Then User checks that cart is not empty

  Scenario: Check contacts page main functions
    Given User opens 'https://zooleader.com.ua' page
    When User clicks on contact page button
    And User checks facebook button visibility
    And User checks instagram button visibility
    And User checks name of store visibility
    And User checks address of store visibility
    And User checks phone info visibility
    And User checks e-mail info info visibility
    And User checks work hours info info visibility
    Then User checks that contacts page url contains word 'kontakty'

  Scenario: Check feedback page main functions
    Given User opens 'https://zooleader.com.ua' page
    When User clicks on feedback page button
    And User checks feedback page title visibility
    And User checks site rating indicator visibility
    And User checks feedbacks visibility
    Then User checks that feedback page url contains word 'otzyvy'

  Scenario: Check shipping-payment page main functions
    Given User opens 'https://zooleader.com.ua' page
    When User clicks on shipping-payment page button
    And User checks shipping-payment page title visibility
    And User checks return policy visibility
    Then User checks that shipping-payment page url contains word 'dostavka-oplata'

