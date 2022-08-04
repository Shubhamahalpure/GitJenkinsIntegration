package TestNGListnerConcept;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerReport extends Base implements ITestListener {

	public ExtentSparkReporter spark;
	public ExtentReports extent;
	public ExtentTest test;

	public void onTestStart(ITestResult tr) {
		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/target/extentreport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);

		spark.config().setDocumentTitle("Sample Project");
		spark.config().setReportName("Functional Test Report");
		spark.config().setTheme(Theme.DARK);
		System.out.println("Test method is started");
	}

	public void onTestSuccess(ITestResult tr) {
		test = extent.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		System.out.println("Test method passed");
	}

	public void onTestFailure(ITestResult tr) {
		test = extent.createTest(tr.getName());
        test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		
		System.out.println("Test method failed");
		try {
			failed();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult tr) {
		test = extent.createTest(tr.getName());
        test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.BROWN));

		System.out.println("Test method skipped");
	}

	public void onFinish(ITestContext context) {
	     
		extent.flush();

	}

}
