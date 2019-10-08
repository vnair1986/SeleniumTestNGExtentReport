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

public class OrderFlavoredTeaTest extends BaseTest{
	
	private static Logger log = LoggerFactory.getLogger(OrderFlavoredTeaTest.class);
	private HomePage homePage;
	private OrderHelper orderHelper;
	
	public OrderFlavoredTeaTest() {
		this.homePage = new HomePage();
		this.orderHelper = new OrderHelper();
	}
	
	  @BeforeClass(alwaysRun = true) 
	  public void innilizeDriver() {
	  log.info("driver initialization started"); setUpReport(); setUp();
	  homePage.clickOnTeaCategory(driver, "Flavored Tea");
	  log.info("Flavoured tea selected and now test case will start executing");
	  }
	 
	
	@Test(groups = "Flavourd-Tea")
	public void orderFlavoredGreenTeaVisaCard() {
		extentTestlogger = extentReports.startTest("Order Flavored Green Tea through Visa Card");
		try {
			orderHelper.orderTea("Green Tea","tom@xyz.com","Tom","5th Avenue High Street London" ,"Visa","Tom","4564526489657456","12365");
			extentTestlogger.log(LogStatus.PASS,"Order Flavored Green Tea through Visa Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Flavored green tea with Visa card -> " + e.getMessage());
		}
		
	}

	@Test(groups = "Flavourd-Tea")
	public void orderFlavoredGreenTeaMasterCard() {
		extentTestlogger = extentReports.startTest("Order Flavored Green Tea through  Master Card");
		try {
			orderHelper.orderTea("Green Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Mastercard","Tom","4564526489657456","12365");
			extentTestlogger.log(LogStatus.PASS,"Order Flavored Green Tea through  Master Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Flavored green tea with Master card -> " + e.getMessage());
		}
		
	}

	@Test(description = "Flavourd-Tea" )
	public void orderFlavoredGreenTeaAMEXCard() {
		extentTestlogger = extentReports.startTest("Order Flavored Green Tea through  American Express Card");
		try {
			orderHelper.orderTea("Green Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "American Express", "Tom","4564526489657456","12365");
			extentTestlogger.log(LogStatus.PASS,"Order Flavored Green Tea through  American Express Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Flavored green tea with American Express card -> " + e.getMessage());
		}
		
	}

	@Test(groups = "Flavourd-Tea")
	public void orderFlavoredGreenTeaDinersCard() {
		extentTestlogger = extentReports.startTest("Order Flavored Green Tea through  Diners Club Card");
		try {
			orderHelper.orderTea("Green Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Diners Club", "Tom","4564526489657456","12365");
			extentTestlogger.log(LogStatus.PASS,"Order Flavored Green Tea through  Diners Club Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Flavored green tea with Diners club card -> " + e.getMessage());
		}
		
	}
	
	@Test(groups = "Flavourd-Tea")
	public void orderFlavoredRedTeaVisaCard() {
		extentTestlogger = extentReports.startTest("Order Flavored Red Tea through  Visa Card");
		try {
			orderHelper.orderTea("Red Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Visa", "Tom","4564526489657456","12365");
			extentTestlogger.log(LogStatus.PASS,"Order Flavored Red Tea through  Visa Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Flavored Red tea with Visa card -> " + e.getMessage());
		}
		
	}

	@Test(groups = "Flavourd-Tea")
	public void orderFlavoredRedTeaMasterCard() {
		extentTestlogger = extentReports.startTest("Order Flavored Red Tea through  Master Card");
		try {
			orderHelper.orderTea("Red Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Mastercard","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS,"Order Flavored Red Tea through  Master Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Flavored Red tea with Master card -> " + e.getMessage());
		}
		
	}

	@Test(groups = "Flavourd-Tea")
	public void orderFlavoredRedTeaAMEXCard() {
		extentTestlogger = extentReports.startTest("Order Flavored Red Tea through  American Express Card");
		try {
			orderHelper.orderTea("Red Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "American Express","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS,"Order Flavored Red Tea through  American Express Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Flavored Red tea with American Express card -> " + e.getMessage());
		}
		
	}

	@Test(groups = "Flavourd-Tea")
	public void orderFlavoredRedTeaDinersCard() {
		extentTestlogger = extentReports.startTest("Order Flavored Red Tea through  Diners Club Card");
		try {
			orderHelper.orderTea("Red Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Diners Club","Tom","4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS,"Order Flavored Red Tea through  Diners Club Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Flavored Red tea with Diners club card -> " + e.getMessage());
		}
		
	}
	
	@Test(groups = "Flavourd-Tea")
	public void orderFlavoredOolongTeaVisaCard() {
		extentTestlogger = extentReports.startTest("Order Flavored Oolong Tea through  Visa Card");
		try {
			orderHelper.orderTea("Oolong Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Visa","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS,"Order Flavored Oolong Tea through  Visa Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Flavored Oolong tea with Visa card -> " + e.getMessage());
		}
		
	}

	@Test(groups = "Flavourd-Tea")
	public void orderFlavoredOolongTeaMasterCard() {
		extentTestlogger = extentReports.startTest("Order Flavored Oolong Tea through  Master Card");
		try {
			orderHelper.orderTea("Oolong Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Mastercard","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS,"Order Flavored Oolong Tea through  Master Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Flavored Oolong tea with Master card -> " + e.getMessage());
		}
		
	}

	@Test(groups = "Flavourd-Tea")
	public void orderFlavoredOolongTeaAMEXCard() {
		extentTestlogger = extentReports.startTest("Order Flavored Oolong Tea through  American Express Card");
		try {
			orderHelper.orderTea("Oolong Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "American Express","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS, "Order Flavored Oolong Tea through  American Express Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Flavored Oolong tea with American Express card -> " + e.getMessage());
		}
		
	}

	@Test(groups = "Flavourd-Tea")
	public void orderFlavoredOolongTeaDinersCard() {
		extentTestlogger = extentReports.startTest("Order Flavored Oolong Tea through  Diners Club Card");
		try {
			orderHelper.orderTea("Oolong Tea","tom@xyz.com","Tom","5th Avenue High Street London" , "Diners Club","Tom", "4564526489657456", "12365");
			extentTestlogger.log(LogStatus.PASS,"Order Flavored Oolong Tea through  Diners Club Card");
		} catch (Exception e) {
			extentTestlogger.log(LogStatus.FAIL, "Fail to order Flavored Oolong tea with Diners club card -> " + e.getMessage());
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
