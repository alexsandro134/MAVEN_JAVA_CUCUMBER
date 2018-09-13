package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.EditCustomerDetailUI;

public class EditCustomerDetailPO extends AbstractPage {
	WebDriver driver;

	public EditCustomerDetailPO(WebDriver _driver) {
		driver = _driver;
	}

	public void inputCustomerAddress(String text) {
		sendkeyToElement(driver, EditCustomerDetailUI.CUSTOMER_ADDRESS, text);
	}
	
	public EditCustomerSuccessfulPO clickToSubmit() {
		waitForControlVisible(driver, EditCustomerDetailUI.SUBMIT_BUTTON);
		clickToElement(driver, EditCustomerDetailUI.SUBMIT_BUTTON);
		return (EditCustomerSuccessfulPO) BankGuruPageManagerDriver.getInstance(driver, "EditCustomerSuccessfulPage");
	}
}
