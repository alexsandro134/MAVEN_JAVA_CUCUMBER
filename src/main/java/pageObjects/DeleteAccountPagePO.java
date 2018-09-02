package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.DeleteAccountPageUI;

public class DeleteAccountPagePO extends AbstractPage {
	WebDriver driver;

	public DeleteAccountPagePO(WebDriver _driver) {
		driver = _driver;
	}

	public void inputAccountNumber(String text) {
		sendkeyToElement(driver, DeleteAccountPageUI.ACCOUNT_NUMBER, text);
	}

	public void clickToSubmit() {
		clickToElement(driver, DeleteAccountPageUI.SUBMIT_BUTTON);
	}

	public DeleteAccountSuccessfulPagePO acceptAlertToDeleteAccount() {
		waitForAlertPresence(driver);
		acceptAlert(driver);
		return BankGuruPageManagerDriver.getDeteleAccountSuccessfulPage(driver);
	}
}
