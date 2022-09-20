Feature: Login
  As a user
  I want to test login functionality of site
  So that I can be sure that login correctly

  Scenario Outline: Check login functionality (incorrect e-mail)
    Given User opens '<homePage>' page
    And User checks login button visibility
    And User clicks on login button
    And User checks email and password fields visibility
    When User enter email by keyword '<incorrect email>'
    And User enter password by keyword '<password>'
    And User clicks on sign in button
    Then User checks that information about such user was not found is displayed

    Examples:
      | homePage                                 | incorrect email     | password |
      | https://zooleader.com.ua                 | maincoon@gmail.com  | cdds333  |
      | https://zooleader.com.ua                 | 12321@gmail.com     | 33323    |


  Scenario Outline: Check login functionality (incorrect password)
    Given User opens '<homePage>' page
    And User checks login button visibility
    And User clicks on login button
    And User checks email and password fields visibility
    When User enter email by keyword '<email>'
    And User enter password by keyword '<incorrect password>'
    And User clicks on sign in button
    Then User checks that information about such user was not found is displayed

    Examples:
      | homePage                                 | email             | incorrect password |
      | https://zooleader.com.ua                 | cat234@gmail.com  |cattycat            |
      | https://zooleader.com.ua                 | dog@gmail.com     |doggydog            |