package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomer {

	WebDriver driver;
	public SearchCustomer(WebDriver rdriver) {
		
		 this.driver = rdriver;
	        PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath = "(//p[contains(text(),'Customers')])[1]")
	 WebElement customer;
	
	@FindBy(xpath = "(//p[contains(text(),'Customers')])[2]")
	 WebElement subcustomer;
	
	@FindBy (id = "SearchEmail")
	WebElement textemail;
	
	@FindBy (id = "SearchFirstName")
	WebElement textfname;
	
	@FindBy (id = "SearchLastName")
	WebElement textlname;
	
	@FindBy (id = "SearchCompany")
	WebElement textcompany;
	
	@FindBy(id = "search-customers")
	WebElement search;
	
	
	 public void clickCustomerMenu() {

		 customer.click();
	   
	    }
	 
	 public void clickSubCustomerMenu() {

		 subcustomer.click();
	        
	    }
	 
	 public void SearchEmail(String semail) {

		 textemail.sendKeys(semail);
	 }
	 
	
	 public void SearchFirstName(String sfname) {

		 textfname.sendKeys(sfname);
	 }
	 
	 public void SearchLastName(String slname) {

		 textlname.sendKeys(slname);
	 }
	 
	 public void SearchCompany(String scompany) {

		 textcompany.sendKeys(scompany);
	 }
	 
	 public void clickSearchLogout() {

		 search.click();
	   
	    }
	 
	

}
