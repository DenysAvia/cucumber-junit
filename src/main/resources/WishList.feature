Feature: WishList
  As a user
  I want to test wish list site functionality
  So that I can be sure that wish list works correctly

  Scenario Outline: Check add product to wishlist
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks wish list on first product
    Then User checks that wish list is not empty

    Examples:
    | homePage                                 | keyword    |
    | https://zooleader.com.ua                 | main coon  |