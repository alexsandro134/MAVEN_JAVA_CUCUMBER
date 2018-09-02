package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.DeleteCustomerPageUI;

public class DeleteCustomerPagePO extends AbstractPage {
	WebDriver driver;

	public DeleteCustomerPagePO(WebDriver _driver) {
		driver = _driver;
	}

	public void inputCustomerId(String text) {
		waitForControlVisible(driver, DeleteCustomerPageUI.CUSTOMER_ID);
		sendkeyToElement(driver, DeleteCustomerPageUI.CUSTOMER_ID, text);
	}

	public void clickToSubmit() {
		clickToElement(driver, DeleteCustomerPageUI.SUBMIT_BUTTON);
	}
	
	public DeleteCustomerSuccessfulPagePO acceptAlertToDeleteCustomer() {
		waitForAlertPresence(driver);
		acceptAlert(driver);
		return BankGuruPageManagerDriver.getDeteleCustomerSuccessfulPage(driver);
	}

}
