package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.BalanceEnquiryPageUI;

public class BalanceEnquiryPagePO extends AbstractPage {
	WebDriver driver;

	public BalanceEnquiryPagePO(WebDriver _driver) {
		driver = _driver;
	}
	
	public void inputDynamicLocatorWithText(String text, String value) {
		sendkeyToElement(driver, text, BalanceEnquiryPageUI.DYNAMIC_INPUT, value);
	}
	
	public BalanceEnquiryDetailPagePO clickToSubmit() {
		clickToElement(driver, BalanceEnquiryPageUI.SUBMIT_BUTTON);
		return (BalanceEnquiryDetailPagePO) BankGuruPageManagerDriver.getInstance(driver, "BalanceEnquiryDetailPage");
	}

}
