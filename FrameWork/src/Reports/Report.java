package Reports;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Report {
	ExtentHtmlReporter reporter;
	ExtentTest test ;
	ExtentReports extents;
	
	public void onStart(ITestContext content)
	{
		String date = new SimpleDateFormat("yymmddmmss").format(new Date());
		String rep = "Test-Report"+date+".html";
		
		 reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/"+rep);
	      extents = new ExtentReports();
	      
	      extents.attachReporter(reporter);
	      
	      reporter.config().setDocumentTitle("MK Projects");
	      reporter.config().setReportName("Excecution of MK Project");
	      reporter.config().setTheme(Theme.STANDARD);
	      
	      extents.setSystemInfo("TE","Muneer");
	      extents.setSystemInfo("OS", "Windows10");
	      extents.setSystemInfo("Browser", "Chrome");
	      
	      
	}

	public void onFinish(ITestContext context)
	{
		extents.flush();
	}
	public void onTestStart(ITestResult rv)
	{
		test.log(Status.PASS, MarkupHelper.createLabel(rv.getName(), ExtentColor.GREEN));
	}
	public void onTestFailure(ITestResult rv)
	{
		test= extents.createTest(rv.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel(rv.getName(),ExtentColor.RED));
		
		String date = new SimpleDateFormat("yymmddhhmmss").format(new Date());
		EventFiringWebDriver efw = new EventFiringWebDriver(Browser.driver);
		File f1 = efw.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"//Screenshot//"+date+rv.getName()+".png";
		File f2 = new File(path);
		
		
	}
	public void onTestSkipp(ITestResult rv)
	{
		test.log(Status.SKIP,MarkupHelper.createLabel(rv.getName(),ExtentColor.GREY));
	}
	
}
