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


public class OrderHerbalTeaTest extends BaseTest {
	private static Logger log = LoggerFactory.getLogger(OrderHerbalTeaTest.class);
	private HomePage homePage;
	private OrderHelper orderHelper;
	
	public OrderHerbalTeaTest() {
		this.homePage = new HomePage();
		this.orderHelper = new OrderHelper();
	}
	
	
	
	 @BeforeClass(alwaysRun = true) 
	  public void innilizeDriver() {
	  log.info("driver initialization started"); 
	  setUp();
	  homePage.clickOnTeaCategory(driver, "Herbal Tea");
	  log.info("Flavoured tea selected and now test case will start executing");
	  }
	
	@Test(groups = {"Herbal-tea"})
	public void orderHerbalGreenTeaVisaCard() {
		extentTestlogger = extentReports.startTest("Order Herbal Green Tea through  Visa Card");
		try {
			orderHelper.orderTea("Green Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Visa","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Herbal Green Tea through  Visa Card");
		}catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order herbal green tea with visa card -> " + e.getMessage());
		}
	
		;
	}

	@Test(groups = {"Herbal-tea"})
	public void orderHerbalGreenTeaMasterCard()  {
		extentTestlogger = extentReports.startTest("Order Herbal Green Tea through  Master Card");
		try {
			orderHelper.orderTea("Green Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Mastercard","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Herbal Green Tea through  Master Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order herbal green tea with Master card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Herbal-tea"})
	public void orderHerbalGreenTeaAMEXCard()  {
		extentTestlogger = extentReports.startTest("Order Herbal Green Tea through  American Express Card");
		try {
			orderHelper.orderTea("Green Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "American Express","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Herbal Green Tea through  American Express Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order herbal green tea with American Express card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Herbal-tea"})
	public void orderHerbalGreenTeaDinersCard()  {
		extentTestlogger = extentReports.startTest("Order Herbal Green Tea through  Diners Club Card");
		try {
			orderHelper.orderTea("Green Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Diners Club","Tom" ,"4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Herbal Green Tea through  Diners Club Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order herbal green tea with Diners Club  card -> " + e.getMessage());
		}
		
	}
	
	
	@Test(groups = {"Herbal-tea"})
	public void orderHerbalRedTeaVisaCard()  {
		extentTestlogger = extentReports.startTest("Order Herbal Red Tea through  Visa Card");
		try {
			orderHelper.orderTea("Red Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Visa","Tom" ,"4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Herbal Red Tea through  Visa Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order herbal Red tea with Visa card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Herbal-tea"})
	public void orderHerbalRedTeaMasterCard()  {
		extentTestlogger = extentReports.startTest("Order Herbal Red Tea through  Master Card");
		try {
			orderHelper.orderTea("Red Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Mastercard","Tom" ,"4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Herbal Red Tea through  Master Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order herbal Red tea with Master card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Herbal-tea"})
	public void orderHerbalRedTeaAMEXCard()  {
		extentTestlogger = extentReports.startTest("Order Herbal Red Tea through  American Express Card");
		try {
			orderHelper.orderTea("Red Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "American Express","Tom" ,"4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Herbal Red Tea through  American Express Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order herbal Red tea with American Express card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Herbal-tea"})
	public void orderHerbalRedTeaDinersCard()  {
		extentTestlogger = extentReports.startTest("Order Herbal Red Tea through  Diners Club Card");
		try {
			orderHelper.orderTea("Red Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Diners Club","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Herbal Red Tea through  Diners Club Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order herbal Red tea with Diners club card -> " + e.getMessage());
		}
		
	}
	
	@Test(groups = {"Herbal-tea"})
	public void orderHerbalOolongTeaVisaCard()  {
		extentTestlogger = extentReports.startTest("Order Herbal Oolong Tea through  Visa Card");
		try {
			orderHelper.orderTea("Oolong Tea", "tom@xyz.com","Tom","5th Avenue High Street London" ,"Visa", "Tom","4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Herbal Oolong Tea through  Visa Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Oolong tea with Visa card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Herbal-tea"})
	public void orderHerbalOolongTeaMasterCard()  {
		extentTestlogger = extentReports.startTest("Order Herbal Oolong Tea through  Master Card");
		try {
			orderHelper.orderTea("Oolong Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Mastercard","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Herbal Oolong Tea through  Master Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Oolong tea with Master card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Herbal-tea"})
	public void orderHerbalOolongTeaAMEXCard()  {
		extentTestlogger = extentReports.startTest("Order Herbal Oolong Tea through  American Express Card");
		try {
			orderHelper.orderTea("Oolong Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "American Express","Tom" ,"4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Herbal Oolong Tea through  American Express Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Oolong tea with American Express card -> " + e.getMessage());
		}
		
	}

	@Test(groups = {"Herbal-tea"})
	public void orderHerbalOolongTeaDinersCard()  {
		extentTestlogger = extentReports.startTest("Order Herbal Oolong Tea through  Diners Club Card");
		try {
			orderHelper.orderTea("Oolong Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Diners Club","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Herbal Oolong Tea through  Diners Club Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Oolong tea with Diners club card -> " + e.getMessage());
		}
		
		
	}
	
	
	@AfterMethod
	public void onCompletion(ITestResult iTestResult) {
		generateReprot(iTestResult);
	}
	
	 @AfterClass(alwaysRun = true) 
	  public void quitDriver() {
	  log.info("closing the driver"); 
	  closeBrowser(); 
	 }

	

	
	
}
