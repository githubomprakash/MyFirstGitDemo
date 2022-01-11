Feature: Login





Background: Below are common steps for each sceanrio

		Given User Launch Chrome Browser
    When User Open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User Enter Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login button
    Then Page Title Should be "DashBoard / nopCommerce administration"
    Then Click on Customer Menu
    Then Click on Customer SubMenu



  @Smoke
	Scenario: Add New Customer Details
    
    Then Click on Add Customer
    And  Add Customer Details
    Then Saved the CUstomer Details
    And Verify Text
    When User Click on Logout button
    Then Page Title Should be "Your store. Login"
    And Close browser
    
   
   
  @Sanity 
  Scenario: Search Customer by EmailID
   
   	And Enter customer Email
   	When Click on search button
   	Then user should found email in the search Table    
    And Close browser
    
  