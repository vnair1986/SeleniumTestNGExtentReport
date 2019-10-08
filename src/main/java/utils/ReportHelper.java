package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ReportHelper {
	public static  ExtentReports extentReports;
	public static  ExtentTest extentTestlogger;
	
	@BeforeSuite
	public static void setUpReport() {
		extentReports = new ExtentReports(Constant.REPORT_PATH+Constant.REPORT_NAME);
	}
	
	
	@AfterSuite
	public void publishReport() {
		  extentReports.flush();
	}

}
