package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckoutPage {
	private static Logger log = LoggerFactory.getLogger(CheckoutPage.class);
	private static WebElement element = null;
	private Select select;
	public WebDriver driver;

	public static WebElement email(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return element;

	}

	public static WebElement name(WebDriver driver) {
		element = driver.findElement(By.id("name"));
		return element;

	}

	public static WebElement address(WebDriver driver) {
		element = driver.findElement(By.id("address"));
		return element;

	}

	public static WebElement cardType(WebDriver driver) {
		element = driver.findElement(By.id("card_type"));
		return element;

	}

	public static WebElement cardNumber(WebDriver driver) {
		element = driver.findElement(By.id("card_number"));
		return element;

	}

	public static WebElement cardHolderName(WebDriver driver) {
		element = driver.findElement(By.id("cardholder_name"));
		return element;

	}

	public static WebElement verificationCode(WebDriver driver) {
		element = driver.findElement(By.id("verification_code"));
		return element;

	}

	public static WebElement placeOrderButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".btn-primary"));
		return element;

	}

	public static WebElement cancel(WebDriver driver) {
		element = driver.findElement(By.linkText("Cancel"));
		return element;

	}

	public void customerInfo(WebDriver driver, String email, String name, String address) {
		log.info("start filling customer information");
		email(driver).sendKeys(email);
		name(driver).sendKeys(name);
		address(driver).sendKeys(address);
		log.info("customer information filled successfully");

	}

	public void paymentInfo(WebDriver driver, String cardType, String cardNumber, String cardHolderName,
			String verificationCode) {
		log.info("start filling payment information");
		select = new Select(cardType(driver));
		select.selectByVisibleText(cardType);
		cardNumber(driver).sendKeys(cardNumber);
		cardHolderName(driver).sendKeys(cardHolderName);
		verificationCode(driver).sendKeys(verificationCode);
		log.info("payment information filled successgully");

	}

	public void placeOrder(WebDriver driver) {
		placeOrderButton(driver).click();

	}

	public void cancelOrder(WebDriver driver) {
		cancel(driver).click();

	}
}
