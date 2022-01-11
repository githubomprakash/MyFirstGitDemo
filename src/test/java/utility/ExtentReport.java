package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport extends TestListenerAdapter {
	
	    public WebDriver driver;
	    public ExtentHtmlReporter htmlReporter;
	    public ExtentReports extent;
	    public ExtentTest logger;
	    
	    @BeforeTest
	    public void startReport() {
	       
	        String dateName_number = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	        htmlReporter = new ExtentHtmlReporter("./test-output/LT_NOPComm_ExtentReport"+dateName_number+".html");
	        // Create an object of Extent Reports
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	       
	        //for making Dark theme and adding some details
	        extent.setSystemInfo("Host Name", "Localhost");
	        extent.setSystemInfo("Environment", "Production");
	        extent.setSystemInfo("User Name", "Omprakash Sah");
	        htmlReporter.config().setDocumentTitle("Functional Automation/API Report");
	        // Name of the report
	        htmlReporter.config().setReportName("Regression Report");
	        // Dark Theme
	        htmlReporter.config().setTheme(Theme.DARK);
	        
	    }
	    
	    public static String getScreenShot(WebDriver driver, String screenshotName) throws IOException {
	        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        // after execution, you could see a folder "FailedTestsScreenshots" under src
	        // folder
	        String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
	        File finalDestination = new File(destination);
	        FileUtils.copyFile(source, finalDestination);
	        return destination;
	    }
	    
	    @AfterMethod
	    public void getResult(ITestResult result) throws Exception {
	        if (result.getStatus() == ITestResult.FAILURE) {
	            // MarkupHelper is used to display the output in different colors
	            logger.log(Status.FAIL,
	                    MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
	            logger.log(Status.FAIL,
	                    MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
	            String screenshotPath = getScreenShot(driver, result.getName());
	            // To add it in the extent report
	            logger.fail("Test Case Failed Snapshot is below " + logger.addScreenCaptureFromPath(screenshotPath));
	        } 
	        else if (result.getStatus() == ITestResult.SKIP) {
	            logger.log(Status.SKIP,
	                    MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
	        } 
	        else if (result.getStatus() == ITestResult.SUCCESS) {
	            logger.log(Status.PASS,
	                    MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
	        }
	        
	    }
	    
	    @AfterTest
	    public void endReport() {
	        extent.flush();
	    }



}
