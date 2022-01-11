package stepDefinition;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pages.AddCustomer;
import pages.LoginPage;
import pages.SearchCustomer;
import utility.ConfigReader;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public ConfigReader config;
	public AddCustomer ac;
	public SearchCustomer sc;
	public static Logger log;
	
	//Creating method for Generating the Random value for Email
		public static String randomestring(){
			String generatedString1 = RandomStringUtils.randomAlphabetic(5);
			return (generatedString1);
			}

}
