$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customer.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are common steps for each sceanrio",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.Step.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Open URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.Step.user_Open_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.Step.user_Enter_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.Step.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"DashBoard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.Step.page_Title_Should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Customer Menu",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.Step.click_on_Customer_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Customer SubMenu",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.Step.click_on_Customer_SubMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add New Customer Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Click on Add Customer",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.Step.click_on_Add_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add Customer Details",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.Step.customer_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Saved the CUstomer Details",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.Step.saved_the_CUstomer_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Text",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.Step.verify_Text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Logout button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.Step.user_Click_on_Logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.Step.page_Title_Should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.Step.close_browser()"
});
formatter.result({
  "status": "passed"
});
});