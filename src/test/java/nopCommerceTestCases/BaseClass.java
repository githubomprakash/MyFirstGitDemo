package nopCommerceTestCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.core.gherkin.Step;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AddCustomer;
import pages.LoginPage;
import pages.SearchCustomer;
import utility.ConfigReader;

public class BaseClass {

	WebDriver driver;
	LoginPage lp;
	AddCustomer ac;
	SearchCustomer sc;
	ConfigReader config;
	Logger log;
	

	@BeforeClass
	public void setup() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		ac = new AddCustomer(driver);
		sc = new SearchCustomer(driver);
		

		// For Log Information
		log = Logger.getLogger("LT_Logger");
		PropertyConfigurator.configure("./log4j.properties");

		// For Properties file to provide Test Data
		config = new ConfigReader();
		driver.get(config.getAppUrl());

		log.info("******************************");
		driver.manage().window().maximize();

		log.info("HRM Application launched.");

	}

	@AfterClass
	public void closingApp() throws InterruptedException {

		System.out.println("Application Closing...!!!");
		Thread.sleep(3000);
		driver.close();

	}
	//Creating method for Generating the Random value for Email
	public static String randomestring(){
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
		}

}
