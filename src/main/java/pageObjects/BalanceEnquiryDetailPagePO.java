package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.BalanceEnquiryDetailPageUI;

public class BalanceEnquiryDetailPagePO extends AbstractPage {
	WebDriver driver;

	public BalanceEnquiryDetailPagePO(WebDriver _driver) {
		driver = _driver;
	}

	public String getCurrentBalance(){
		waitForControlVisible(driver, BalanceEnquiryDetailPageUI.CURRENT_BALANCE);
		return getTextElement(driver, BalanceEnquiryDetailPageUI.CURRENT_BALANCE);
	}
}
