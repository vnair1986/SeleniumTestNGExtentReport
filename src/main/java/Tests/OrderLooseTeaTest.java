package Tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageObjects.HomePage;
import utils.BaseTest;
import utils.OrderHelper;

public class OrderLooseTeaTest extends BaseTest {
	private static Logger log = LoggerFactory.getLogger(OrderLooseTeaTest.class);
	private HomePage homePage;
	private OrderHelper orderHelper;
	
	public OrderLooseTeaTest() {
		this.homePage = new HomePage();
		this.orderHelper = new OrderHelper();
	}
	
	

	@BeforeClass
	public void innilizeDriver() {
		log.info("driver initialization started");
		setUp();
		homePage.clickOnTeaCategory(driver, "Loose Tea");
		log.info("Loose tea selected and now test case will start executing");
	}

	
	@Test(groups = {"Loose-Tea"})
	public void orderLooseGreenTeaVisaCard() {
		extentTestlogger = extentReports.startTest("Order Loose Green Tea through  Visa Card");
		try {
			orderHelper.orderTea("Green Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Visa","Tom" ,"4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Loose Green Tea through  Visa Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Loose green tea with Visa card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Loose-Tea"})
	public void orderLooseGreenTeaMasterCard() {
		extentTestlogger = extentReports.startTest("Order Loose Green Tea through  Master Card");
		try {
			orderHelper.orderTea("Green Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Mastercard","Tom","4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Loose Green Tea through  Master Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Loose green tea with Master card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Loose-Tea"})
	public void orderLooseGreenTeaAMEXCard() {
		extentTestlogger = extentReports.startTest("Order Loose Green Tea through  American Express Card");
		try {
			orderHelper.orderTea("Green Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "American Express","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Loose Green Tea through  American Express Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Loose green tea with American Express card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Loose-Tea"})
	public void orderLooseGreenTeaDinersCard() {
		extentTestlogger = extentReports.startTest("Order Loose Green Tea through  Diners Club Card");
		try {
			orderHelper.orderTea("Green Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Diners Club","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Loose Green Tea through  Diners Club Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Loose green tea with Diners club card -> " + e.getMessage());
		}
		
	}
	
	
	@Test(groups = {"Loose-Tea"})
	public void orderLooseRedTeaVisaCard() {
		extentTestlogger = extentReports.startTest("Order Loose Red Tea through  Visa Card");
		try {
			orderHelper.orderTea("Red Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Visa","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Loose Red Tea through  Visa Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Loose Red tea with Visa card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Loose-Tea"})
	public void orderLooseRedTeaMasterCard() {
		extentTestlogger = extentReports.startTest("Order Loose Red Tea through  Master Card");
		try {
			orderHelper.orderTea("Red Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Mastercard","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Loose Red Tea through  Master Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Loose red tea with Master card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Loose-Tea"})
	public void orderLooseRedTeaAMEXCard() {
		extentTestlogger = extentReports.startTest("Order Loose Red Tea through  American Express Card");
		try {
			orderHelper.orderTea("Red Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "American Express","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Loose Red Tea through  American Express Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Loose Red tea with American Express card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Loose-Tea"})
	public void orderLooseRedTeaDinersCard() {
		extentTestlogger = extentReports.startTest("Order Loose Red Tea through  Diners Club Card");
		try {
			orderHelper.orderTea("Red Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Diners Club","Tom","4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Loose Red Tea through  Diners Club Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Loose Red tea with Diners club card -> " + e.getMessage());
		}
		
	}
	
	@Test(groups = {"Loose-Tea"})
	public void orderLooseOolongTeaVisaCard() {
		extentTestlogger = extentReports.startTest("Order Loose Oolong Tea through  Visa Card");
		try {
			orderHelper.orderTea("Oolong Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Visa","Tom" ,"4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Loose Oolong Tea through  Visa Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Loose Oolong tea with Visa card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Loose-Tea"})
	public void orderLooseOolongTeaMasterCard() {
		extentTestlogger = extentReports.startTest("Order Loose Oolong Tea through  Master Card");
		try {
			orderHelper.orderTea("Oolong Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Mastercard","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Loose Oolong Tea through  Master Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Loose Oolong tea with Master card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Loose-Tea"})
	public void orderLooseOolongTeaAMEXCard() {
		extentTestlogger = extentReports.startTest("Order Loose Oolong Tea through  American Express Card");
		try {
			orderHelper.orderTea("Oolong Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "American Express","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Loose Oolong Tea through  American Express Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Loose Oolong tea with American Express card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Loose-Tea"})
	public void orderLooseOolongTeaDinersCard() {
		extentTestlogger = extentReports.startTest("Order Loose Oolong Tea through  Diners Club Card");
		try {
			orderHelper.orderTea("Oolong Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Diners Club", "Tom","4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Loose Oolong Tea through  Diners Club Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Loose Oolong tea with Dinner club card -> " + e.getMessage());
		}
		
	}
	
	@AfterMethod
	public void onCompletion(ITestResult iTestResult) {
		generateReprot(iTestResult);
	}
	
	
	  @AfterClass(alwaysRun = true)
	  public void quitDriver() {
	  log.info("closing the driver"); closeBrowser(); }
	 

}
