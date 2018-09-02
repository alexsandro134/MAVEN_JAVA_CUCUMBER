package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.CustomerRegisterSuccessfulUI;

public class CustomerRegisterSuccessfulPO extends AbstractPage {
	WebDriver driver;

	public CustomerRegisterSuccessfulPO(WebDriver _driver) {
		driver = _driver;
	}
	
	public boolean checkNewCustomerRegistered() {
		waitForControlVisible(driver, CustomerRegisterSuccessfulUI.SUCCESSFUL_MESSAGE);
		return isControlDisplayed(driver, CustomerRegisterSuccessfulUI.SUCCESSFUL_MESSAGE);
	}
	
	public String getCustomerId() {
		return getTextElement(driver, CustomerRegisterSuccessfulUI.CUSTOMER_ID);
	}
}
