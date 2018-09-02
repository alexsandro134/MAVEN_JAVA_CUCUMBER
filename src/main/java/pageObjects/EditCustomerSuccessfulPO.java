package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.EditCustomerSuccessfulUI;

public class EditCustomerSuccessfulPO extends AbstractPage {
	WebDriver driver;

	public EditCustomerSuccessfulPO(WebDriver _driver) {
		driver = _driver;
	}
	
	public boolean checkEditCustomerInfo() {
		waitForControlVisible(driver, EditCustomerSuccessfulUI.SUCCESSFUL_MESSAGE);
		return isControlDisplayed(driver, EditCustomerSuccessfulUI.SUCCESSFUL_MESSAGE);
	}
}
