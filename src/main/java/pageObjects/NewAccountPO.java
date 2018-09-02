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

	public NewAccountCreateSuccessfulPO clickToSubmit() {
		clickToElement(driver, NewAccountUI.SUBMIT_BUTTON);
		return BankGuruPageManagerDriver.getNewAccountCreateSuccessful(driver);
	}
}
