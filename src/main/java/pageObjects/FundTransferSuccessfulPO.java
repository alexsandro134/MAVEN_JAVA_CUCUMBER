package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.FundTransferSuccessfulUI;

public class FundTransferSuccessfulPO extends AbstractPage {
	WebDriver driver;

	public FundTransferSuccessfulPO(WebDriver _driver) {
		driver = _driver;
	}

	public String getCurrentBalance(){
		waitForControlVisible(driver, FundTransferSuccessfulUI.CURRENT_BALANCE);
		return getTextElement(driver, FundTransferSuccessfulUI.CURRENT_BALANCE);
	}
}
