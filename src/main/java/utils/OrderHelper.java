package utils;

import pageObjects.CheckoutPage;
import pageObjects.MenuPage;

public class OrderHelper extends BaseTest{
	private MenuPage menu;
	private CheckoutPage checkout;
	
	public OrderHelper() {
		this.menu = new MenuPage();
		this.checkout = new CheckoutPage();
	}
	
	public void orderTea(String teaType,String email, String name,String address, String cardType, String cardNumber, String nameOnCard, String verficationCode) throws InterruptedException {
		menu.checkoutTea(driver, teaType);
		checkout.customerInfo(driver, email, name, address);
		checkout.paymentInfo(driver, cardType, cardNumber, nameOnCard, verficationCode);
		checkout.placeOrder(driver);

	}
	

}
