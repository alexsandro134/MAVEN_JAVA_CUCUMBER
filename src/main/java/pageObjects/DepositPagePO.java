package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.DepositPageUI;

public class DepositPagePO extends AbstractPage {
	WebDriver driver;

	public DepositPagePO(WebDriver _driver) {
		driver = _driver;
	}

	public void inputDynamicLocatorWithText(String text, String value) {
		sendkeyToElement(driver, text, DepositPageUI.DYNAMIC_INPUT, value);
	}

	public DepositSuccessfulPagePO clickToSubmit() {
		waitForControlVisible(driver, DepositPageUI.SUBMIT_BUTTON);
		clickToElement(driver, DepositPageUI.SUBMIT_BUTTON);
		return (DepositSuccessfulPagePO) BankGuruPageManagerDriver.getInstance(driver, "DepositSuccessfulPage");
	}
}
