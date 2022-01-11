package nopCommerceTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NopCommerceSearchCustomer extends BaseClass {

	@Test(priority = 1)
	public void loginApp() throws Exception {

		lp.enterUserName(config.getUserName());
		log.info("Entered UserName");

		lp.enterPassword(config.getPassword());
		log.info("Entered Password");

		lp.clickLoginButton();
		log.info("Application Logged in....!!!");
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void searchCustomer() throws Exception {

		log.info("Enter Search Customer Details....!!!");
		sc.clickCustomerMenu();
		Thread.sleep(3000);
		sc.clickSubCustomerMenu();
		Thread.sleep(3000);
		sc.SearchEmail(config.getSearchEmail());
		sc.SearchFirstName(config.getSearchFirstName());
		sc.SearchLastName(config.getSearchLastName());
		sc.SearchCompany(config.getSearchCompany());
		Thread.sleep(3000);
		sc.clickSearchLogout();
		Thread.sleep(4000);

		log.info("Enter Search Customer Details Added....!!!");

	}
	
	@Test(priority=3)
	public void logout() throws Exception {
		
		ac.logout();       //Added Wrong Xpath for checking ReTry Logic
		Thread.sleep(3000);
		log.info("Successfully Logout....!!!");
		//Assert.assertTrue(false);
		
	}
	
	@Test
	public void verifyTitle() {
		
		String pgtitle = driver.getTitle();
	    System.out.println("Page Title of this Application is...!!!   "+pgtitle);
	    
	    log.info("Verification Done....!!!");

	}

}
