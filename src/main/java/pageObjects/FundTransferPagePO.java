package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.FundTransferPageUI;

public class FundTransferPagePO extends AbstractPage {
	WebDriver driver;

	public FundTransferPagePO(WebDriver _driver) {
		driver = _driver;
	}
	
	public void inputDynamicLocatorWithText(String text, String value) {
		sendkeyToElement(driver, text, FundTransferPageUI.DYNAMIC_INPUT, value);
	}

	public FundTransferSuccessfulPO clickToSubmit() {
		clickToElement(driver, FundTransferPageUI.SUBMIT_BUTTON);
		return (FundTransferSuccessfulPO) BankGuruPageManagerDriver.getInstance(driver, "FundTransferSuccessfulPage");
	}
}
