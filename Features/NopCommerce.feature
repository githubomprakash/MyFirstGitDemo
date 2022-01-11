Feature: Login

  @Smoke
	Scenario: Add New Customer Details
    Given User Launch Chrome Browser
    When User Open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User Enter Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login button
    Then Page Title Should be "DashBoard / nopCommerce administration"
    Then Click on Customer Menu
    Then Click on Customer SubMenu
    Then Click on Add Customer
    And  Add Customer Details
    Then Saved the CUstomer Details
    And Verify Text
    When User Click on Logout button
    Then Page Title Should be "Your store. Login"
    And Close browser
    
    @Sanity
    Scenario Outline: Add New Customer Details :By Scenario Outline
    Given User Launch Chrome Browser
    When User Open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User Enter Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login button
    Then Page Title Should be "DashBoard / nopCommerce administration"
    Then Click on Customer Menu
    Then Click on Customer SubMenu
    Then Click on Add Customer
    And  Add Customer Details
    Then Saved the CUstomer Details
    And Verify Text
    When User Click on Logout button
    Then Page Title Should be "Your store. Login"
    And Close browser
    
    Examples:
||
  