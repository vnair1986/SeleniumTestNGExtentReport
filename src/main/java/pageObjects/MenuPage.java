package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MenuPage {
	private static Logger log = LoggerFactory.getLogger(MenuPage.class);
	private static WebElement element = null;
	public WebDriver driver;
	
	public static WebElement menuHeading(WebDriver driver) {
		element = driver.findElement(By.cssSelector("h1"));
		return element;
	}
	
	public static WebElement greenTea(WebDriver driver) {
		element = driver.findElement(By.id("wsb-button-00000000-0000-0000-0000-000451955160"));
		return element;

	}

	public static WebElement redTea(WebDriver driver){
	     element = driver.findElement(By.id("wsb-button-00000000-0000-0000-0000-000451959280"));
	     return element;
	 
	         }

	public static WebElement oolongTea(WebDriver driver) {
		element = driver.findElement(By.id("wsb-button-00000000-0000-0000-0000-000451961556"));
		return element;

	}
	
	public void checkoutTea (WebDriver driver,String teaType) {
		log.info("selecting the type of Tea");
		if(teaType.equalsIgnoreCase("Green Tea")) {
			greenTea(driver).click();
			}else if(teaType.equalsIgnoreCase("Red Tea")) {
				redTea(driver).click();
				}else if(teaType.equalsIgnoreCase("Oolong Tea")) {
					oolongTea(driver).click();
		}
	}
	
	
}
