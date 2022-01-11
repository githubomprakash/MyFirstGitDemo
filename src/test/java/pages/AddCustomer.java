package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {

	WebDriver driver;
	public AddCustomer(WebDriver redriver) {
		
		 this.driver = redriver;
	        PageFactory.initElements(redriver, this);
		
	}
	
	@FindBy(xpath = "(//p[contains(text(),'Customers')])[1]")
	 WebElement customer;
	
	@FindBy(xpath = "(//p[contains(text(),'Customers')])[1]")
	 WebElement subcustomer;
	
	@FindBy(xpath = "//a[@href='/Admin/Customer/List'][1]")
	WebElement custlist;
	
	@FindBy(linkText = "Add new")
	WebElement addcust;
	
	@FindBy(id = "Email")
	WebElement emails;
	
	@FindBy(id = "Password")
	WebElement pwds;
	
	@FindBy(id = "FirstName")
	WebElement fnames;
	
	@FindBy(id = "LastName")
	WebElement lnames;
	
	@FindBy(id = "Gender_Male")
	WebElement gen;
	
	@FindBy(id = "Company")
	WebElement comp;
	
	@FindBy(id = "IsTaxExempt")
	WebElement tax;
	
	@FindBy(id = "AdminComment")
	WebElement admin;
	
	@FindBy(xpath = "//button[@name='save']")
	WebElement save;
	
	@FindBy(linkText = "Logout")
	WebElement lout;
	
	
	
	 public void clickCustomerMenu() {

		 customer.click();
	   
	    }
	 
	 public void clickSubCustomerMenu() {

		 subcustomer.click();
	        
	    }
	 
	 public void clickCustomerlist() {

		 custlist.click();
	        
	    }
	 public void addCustomer() {

		 addcust.click();
	 }
	 
	 public void username(String email) {

		 emails.sendKeys(email);
	 }
	 
	 public void passwords(String pwd) {

		 pwds.sendKeys(pwd);
	 }
	 
	 public void firstName(String fname) {

		 fnames.sendKeys(fname);
	 }
	 public void lastName(String lname) {

		 lnames.sendKeys(lname);
	 }
	 
	 public void gender() {

		 gen.click();
	 }
	 public void company(String company) {

		 comp.sendKeys(company);
	 }
	 
	 public void taxExempt() {

		 tax.click();
	 }
	 public void adminComment(String admincomment) {

		 admin.sendKeys(admincomment);
	 }
	 
	 public void saveDetails() {

		save.click();
	 }
	 
	 public void logout() {

		 lout.click();
		 }
	 
	
	 
		

	
	

	
}
