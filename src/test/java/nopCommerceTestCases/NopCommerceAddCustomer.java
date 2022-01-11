package nopCommerceTestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



//@Listeners(nopCommerceTestCases.CustomListeners.class)  //commenting this for using on all class level and will add in TestNG.xml file
public class NopCommerceAddCustomer extends BaseClass {
	
	
	@Test(priority=1)
	public void loginApp() throws Exception {
		
		
		lp.enterUserName(config.getUserName());
		log.info("Entered UserName");
		
	
		lp.enterPassword(config.getPassword());
		log.info("Entered Password");
		
		lp.clickLoginButton();
		log.info("Application Logged in....!!!");
		
		}  
	
	
	@Test(priority=2)
	public void addCustomer() throws Exception {
		
		        ac.clickCustomerMenu();
		        ac.clickSubCustomerMenu();
		        ac.clickCustomerlist();
		      //i[@class='toggle-icon fa fa-plus']
		        Thread.sleep(3000);
		        ac.addCustomer();
		        log.info("Enter Customer Details....!!!");
		        Thread.sleep(5000);
		        //ac.username(config.email1());
		        //For generating the Random value for Email calling the methods from the base class
		        String email = randomestring()+ "@gmail.com";
		        ac.username(email);
		       
		        ac.passwords(config.passwords1());
		        ac.firstName(config.first_Name());
		        ac.lastName(config.last_Name());
		        ac.gender();
		        ac.company(config.companyName());
		        ac.taxExempt();
		        ac.adminComment(config.getAdminComment());
		        Thread.sleep(3000);
		        ac.saveDetails();
		        Thread.sleep(3000);
		        log.info("Details Are Added....!!!");
		        
		        
		
	}
	
	//@Test(priority=3, retryAnalyzer = retryLogic.RetryLogic.class)   //added this on class level in TestNg.XML file
	@Test(priority=3)
	public void logout() throws Exception {
		
		ac.logout();
		//driver.findElement(By.linkText("Logout")).click();
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
	
	@AfterMethod
	public void fullScreenShot() throws IOException {

		TakesScreenshot	    ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshots\\Failed.png");
		FileUtils.copyFile(src, trg);
		
	}

}
	