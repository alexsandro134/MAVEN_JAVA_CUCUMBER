package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.WithdrawPageUI;

public class WithdrawPagePO extends AbstractPage {
	WebDriver driver;

	public WithdrawPagePO(WebDriver _driver) {
		driver = _driver;
	}
	
	public void inputDynamicLocatorWithText(String text, String value) {
		sendkeyToElement(driver, text, WithdrawPageUI.DYNAMIC_INPUT, value);
	}

	public WithdrawSuccessfulPagePO clickToSubmit() {
		waitForControlVisible(driver, WithdrawPageUI.SUBMIT_BUTTON);
		clickToElement(driver, WithdrawPageUI.SUBMIT_BUTTON);
		return BankGuruPageManagerDriver.getWithdrawSuccessfulPage(driver);
	}
}
