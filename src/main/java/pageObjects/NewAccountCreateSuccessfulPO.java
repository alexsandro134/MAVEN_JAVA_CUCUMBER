package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.NewAccountCreateSuccessfulUI;

public class NewAccountCreateSuccessfulPO extends AbstractPage {
	WebDriver driver;

	public NewAccountCreateSuccessfulPO(WebDriver _driver) {
		driver = _driver;
	}
	
	public boolean checkNewAccountCreated() {
		return isControlDisplayed(driver, NewAccountCreateSuccessfulUI.SUCCESSFUL_MESSAGE);
	}
	
	public String getCurrentAmount() {
		return getTextElement(driver, NewAccountCreateSuccessfulUI.CURRENT_AMOUNT);
	}
	
	public String getAccountId() {
		return getTextElement(driver, NewAccountCreateSuccessfulUI.ACCOUNT_ID);
	}
}
