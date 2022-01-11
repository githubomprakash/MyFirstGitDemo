package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;
	 public  ConfigReader() throws Exception {              //Creating one constructor name should be same as class name
	
	  FileInputStream fis= new FileInputStream(".\\testData\\testData.properties");
	  prop = new Properties();
	  prop.load(fis);

	 	 
	 }
	
	 public String getAppUrl() {
		return  prop.getProperty("url");

		 
	 }
	 
	 public String getUserName() {
			return prop.getProperty("username");
			 
		 }
	 
	 public String getPassword() {
			return prop.getProperty("password");
			 
		 }

	 // -----------------------------Add Customer Details Pages----------------------------------------------------->
	 public String email1() {
		 return prop.getProperty("email");
		 
	 }
	 
	 public String passwords1() {

		 return prop.getProperty("pwd");
	 }
	 
	 public String first_Name(){

		 return prop.getProperty("fname");
	 }

	 public String last_Name(){

		 return prop.getProperty("lname");
	 }
	 
	 public String companyName(){

		 return prop.getProperty("company");
	 }
	 
	 public String getAdminComment(){

		 return prop.getProperty("admincomment");
	 }
	 
	// -----------------------------Search Customer Details Pages----------------------------------------------------->
	 
	 public String getSearchEmail(){

		 return prop.getProperty("semail");
	 }
	 
	 public String getSearchFirstName(){

		 return prop.getProperty("sfname");
	 }
	 
	 public String getSearchLastName(){

		 return prop.getProperty("slname");
	 }
	 
	 public String getSearchCompany(){

		 return prop.getProperty("scompany");
	 }
	 
	 

}
