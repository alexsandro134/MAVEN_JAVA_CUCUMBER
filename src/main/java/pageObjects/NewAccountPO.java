package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.NewAccountUI;

public class NewAccountPO extends AbstractPage {
	WebDriver driver;

	public NewAccountPO(WebDriver _driver) {
		driver = _driver;
	}

	public void selectAccountType(String textItem) {
		selectItemInDropdown(driver, NewAccountUI.ACCOUNT_TYPE_SELECT, textItem);
	}

	public void clickToSubmit() {
		clickToElement(driver, NewAccountUI.SUBMIT_BUTTON);
	}

	public boolean checkNewAccountCreated() {
		return isControlDisplayed(driver, NewAccountUI.SUCCESSFUL_MESSAGE);
	}

	public String getCurrentAmount() {
		return getTextElement(driver, NewAccountUI.CURRENT_AMOUNT);
	}

	public String getAccountId() {
		return getTextElement(driver, NewAccountUI.ACCOUNT_ID);
	}
}
