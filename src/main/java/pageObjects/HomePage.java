package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class HomePage {

	private static Logger log = LoggerFactory.getLogger(HomePage.class);
	private static WebElement element = null;
	public WebDriver driver;
	
	public static WebElement herbalTea(WebDriver driver) {
		element = driver.findElement(By.id("wsb-button-00000000-0000-0000-0000-000450914890"));
		return element;

	}

	public static WebElement looseTea(WebDriver driver){
	     element = driver.findElement(By.id("wsb-button-00000000-0000-0000-0000-000450914897"));
	     return element;
	 
	}

	public static WebElement flavourdTea(WebDriver driver) {
		element = driver.findElement(By.id("wsb-button-00000000-0000-0000-0000-000450914899"));
		return element;

	}
	
	public void clickOnTeaCategory (WebDriver driver,String teaType) {
		log.info("selecting the category of Tea");
		if(teaType.equalsIgnoreCase("Herbal Tea")) {
			herbalTea(driver).click();
			}else if(teaType.equalsIgnoreCase("Loose Tea")) {
				looseTea(driver).click();
				}else if(teaType.equalsIgnoreCase("Flavored Tea")) {
					flavourdTea(driver).click();
					}else {
						Assert.fail("No Tea Category found");
						}
	}	

}
