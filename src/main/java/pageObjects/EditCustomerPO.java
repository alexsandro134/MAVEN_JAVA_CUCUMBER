package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.EditCustomerUI;

public class EditCustomerPO extends AbstractPage {
	WebDriver driver;

	public EditCustomerPO(WebDriver _driver) {
		driver = _driver;
	}

	public void inputCustomerID(String value) {
		sendkeyToElement(driver, EditCustomerUI.CUSTOMER_ID, value);
	}

	public void pressTabKey() {
		keyPress(driver, EditCustomerUI.CUSTOMER_ID, Keys.TAB);
	}

	public boolean isErrorMessageDisplayed(String errorMessage) {
		waitForControlVisible(driver, String.format(EditCustomerUI.ERROR_MSG_NAME, errorMessage));
		return isControlDisplayed(driver, String.format(EditCustomerUI.ERROR_MSG_NAME, errorMessage));
	}

	public EditCustomerDetailPO submitCustomerId() {
		waitForControlVisible(driver, EditCustomerUI.SUBMIT_BUTTON);
		clickToElement(driver, EditCustomerUI.SUBMIT_BUTTON);
		return (EditCustomerDetailPO) BankGuruPageManagerDriver.getInstance(driver, "EditCustomerDetailPage");
	}
}
