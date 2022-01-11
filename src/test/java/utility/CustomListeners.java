package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

	public void onStart(ITestContext arg) {

		System.out.println("Start Test Execution...!!!" + arg.getName());
	}

	public void onFinish(ITestContext arg) {

		System.out.println("Finish Test Execution...!!!" + arg.getName());
	}

	public void onTestStart(ITestResult arg0) {

		System.out.println("Start Test...!!!" + arg0.getName());
	}

	public void onTestSkipped(ITestResult arg0) {

		System.out.println("Skipped Test...!!!" + arg0.getName());
	}
	
	public void onTestSuccess(ITestResult arg0) {

		System.out.println("Successed Test...!!!" + arg0.getName());
	}
	
	public void onTestFailure(ITestResult arg0) {

		System.out.println("Failed Test...!!!" + arg0.getName());
	}

}
