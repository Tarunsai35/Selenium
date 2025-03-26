package day_46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{

	public void onStart(ITestContext context) {
		System.out.println("Test execution is Stated....");
	}
	public void onTestStart(ITestResult result) {
		System.out.println("Test Stated....");
		  }
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success....");
		  }
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skiped....");
		  }
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed....");
		  }
	 
}
