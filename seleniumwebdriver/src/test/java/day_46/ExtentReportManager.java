package day_46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

    public ExtentSparkReporter sparkReporter; // UI of the report
    public ExtentReports extent; // Populate common info on the report
    public ExtentTest test; // Create test case entries in the report and update the status of the test methods

    @Override
    public void onStart(ITestContext context) {
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myReport.html");

        sparkReporter.config().setDocumentTitle("Automation Report"); // Title of report
        sparkReporter.config().setReportName("Functional Testing"); // Name of report
        sparkReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Computer Name", "Localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester Name", "Tarun");
        extent.setSystemInfo("OS", "Windows 10");
        extent.setSystemInfo("Browser Name", "Chrome");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getName()); // Create a new entry in the report
        test.log(Status.PASS, "Test Case Passed: " + result.getName()); // Update status
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getName()); // Create a new entry in the report
        test.log(Status.FAIL, "Test Case Failed: " + result.getName()); // Update status
        test.log(Status.FAIL, "Failure Cause: " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName()); // Create a new entry in the report
        test.log(Status.SKIP, "Test Case Skipped: " + result.getName()); // Update status
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush(); // Finalize the report
    }
}
