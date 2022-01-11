package stepDefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AddCustomer;
import pages.LoginPage;
import pages.SearchCustomer;
import utility.ConfigReader;

public class Step extends BaseClass {
	
//	 WebDriver driver;
//	 LoginPage lp;
//	 ConfigReader config;
//	 AddCustomer ac;
//	 SearchCustomer sc;
//	 Logger log;
	
	@Given("User Launch Chrome Browser")
	public void user_Launch_Chrome_Browser() throws Exception {
		
		// For Log Information
		log = Logger.getLogger("LT_Logger");
		PropertyConfigurator.configure("./log4j.properties");
		
		
		log.info("Driver Setup for Launching the application....!!!");
		WebDriverManager.chromedriver().setup(); 
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		log.info("This is Configuraton....!!!");
		config = new ConfigReader();
		
		lp =new LoginPage(driver);
		ac = new AddCustomer(driver);
		sc = new SearchCustomer(driver);
		
//		// For Log Information
//		log = Logger.getLogger("LT_Logger");
//		PropertyConfigurator.configure("./log4j.properties");
	   
	}

	@When("User Open URL {string}")
	public void user_Open_URL(String url) {
		
		log.info("Open Application....!!!");
		
		driver.get(config.getAppUrl());
		
	    
	}

	@When("User Enter Email as {string} and Password as {string}")
	public void user_Enter_Email_as_and_Password_as(String email, String pwd) {
		
		log.info("Enter Credentials....!!!");
		lp.enterUserName(config.getUserName());
		lp.enterPassword(config.getPassword());
	    
	}

	@When("Click on Login button")
	public void click_on_Login_button() throws Exception {
		
		log.info("Click on Login Button....!!!");
		lp.clickLoginButton();
		Thread.sleep(5000);
	   
	}

	@Then("Page Title Should be {string}")
	public void page_Title_Should_be(String expectedTitle) {
		
	  driver.getTitle().contains(expectedTitle);
	 
	   
	}
	
	@Then("Click on Customer Menu")
	public void click_on_Customer_Menu() {
		
		 ac.clickCustomerMenu();	
	   
	}

	@Then("Click on Customer SubMenu")
	public void click_on_Customer_SubMenu() {
		
	    ac.clickSubCustomerMenu();
	    
	}

	@Then("Click on Add Customer")
	public void click_on_Add_Customer() throws Exception {
		log.info("Click On Add Customer....!!!");
		ac.clickCustomerlist();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add new")).click();
		Thread.sleep(3000);
	   
	}
	
	@Then("Add Customer Details")
	public void customer_Details() throws Exception {
	    
		log.info("Enter Add Customer Details....!!!");
		Thread.sleep(5000);
		 String email = randomestring()+ "@gmail.com";
	     ac.username(email);
       // ac.username(config.email1());
        ac.passwords(config.passwords1());
        ac.firstName(config.first_Name());
        ac.lastName(config.last_Name());
        ac.gender();
        ac.company(config.companyName());
        ac.taxExempt();
        ac.adminComment(config.getAdminComment());
        Thread.sleep(3000);
      
	}
	
	@Then("Saved the CUstomer Details")
	public void saved_the_CUstomer_Details() throws Exception {
	   
		log.info("Save Customer Details....!!!");
		  ac.saveDetails();
	        Thread.sleep(3000);
	}
	
	@Then("Verify Text")
	public void verify_Text() {
		
		log.info("Verify Text Of Add Customer....!!!");
		
		
		WebElement text= driver.findElement(By.xpath("//div[contains(@class,'alert alert-success')]"));
		System.out.println("This is Success Message()" + text.getText());
		
	}

	@When("User Click on Logout button")
	public void user_Click_on_Logout_button() throws Exception {
		log.info("Logout from the Application....!!!");
				
		ac.logout();
		Thread.sleep(3000);
	  
	}

	@Then("Close browser")
	public void close_browser() throws Exception {
		log.info("Closed the Browser....!!!");
		
		System.out.println("Application Closing...!!!");
		Thread.sleep(3000);
		driver.close();
	   
	}
	
	
	
	
	//Search Customer Actions
	
	
	@Then("Enter customer Email")
	public void enter_customer_Email() throws Exception {
		
		log.info("Enter Search Customer Details....!!!");
		sc.clickSubCustomerMenu();
		Thread.sleep(3000);
		sc.SearchEmail(config.getSearchEmail());
		sc.SearchFirstName(config.getSearchFirstName());
		sc.SearchLastName(config.getSearchLastName());
		sc.SearchCompany(config.getSearchCompany());
		Thread.sleep(3000);
		
	    
	}

	@When("Click on search button")
	public void click_on_search_button() throws Exception {
		log.info("Logout From the Application....!!!");
		sc.clickSearchLogout();
		Thread.sleep(4000);
	   
	}

	@Then("user should found email in the search Table")
	public void user_should_found_email_in_the_search_Table() {
		
	   
	}
	
	
	
	

}
