package utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.OperatingSystem;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends ReportHelper {
	
	public static ChromeOptions chromeOptions = new ChromeOptions();
	public static FirefoxOptions firefoxOptions = new FirefoxOptions();
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	public static WebDriver setUp() {
		if(System.getProperty("os.name").toLowerCase().contains("windows")) {
			WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
			chromeOptions.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(chromeOptions);
		}
		else if(System.getProperty("os.name").toLowerCase().contains("linux")) {
			if(System.getProperty("os.arch").toLowerCase().contains("amd64")) {
				WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
				chromeOptions.setExperimentalOption("useAutomationExtension", false);
				driver = new ChromeDriver(chromeOptions);
			}
			else if(System.getProperty("os.name").toLowerCase().contains("windows")) {
				WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.WIN).setup();
				firefoxOptions.addPreference("useAutomationExtension", false);
				driver = new FirefoxDriver(firefoxOptions);
			}
		}
		driver.get(Constant.URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
	private String captureScreenShot(WebDriver driver,String screenShotName) throws IOException {
        final String dest = Constant.REPORT_PATH+screenShotName+ Constant.SCREENSHOT_EXTENTION;
        final TakesScreenshot screenshot = (TakesScreenshot) driver;
        final File source = screenshot.getScreenshotAs(OutputType.FILE);
        final File destination = new File(dest);
        FileUtils.copyFile(source,destination);
        return dest;
    }
    public void generateReprot(ITestResult testResult){
        if(testResult.getStatus()==ITestResult.FAILURE) {
            try {
                final String screenshot_path = captureScreenShot(driver, testResult.getName());
                final String screenImage = extentTestlogger.addScreenCapture(screenshot_path);
                extentTestlogger.log(LogStatus.FAIL,screenImage);
            } catch (IOException e) {
                extentTestlogger.log(LogStatus.ERROR,"Exception while takeing screenshot");
            }
        }
        extentReports.endTest(extentTestlogger);
      
        
    }
    
   
}
