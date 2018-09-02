package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.WithdrawSuccessfulUI;

public class WithdrawSuccessfulPagePO extends AbstractPage {
	WebDriver driver;

	public WithdrawSuccessfulPagePO(WebDriver _driver) {
		driver = _driver;
	}

	public boolean checkWithdrawFromAccount(String accountId) {
		waitForControlVisible(driver, String.format(WithdrawSuccessfulUI.SUCCESSFUL_MESSAGE, accountId));
		return isControlDisplayed(driver, String.format(WithdrawSuccessfulUI.SUCCESSFUL_MESSAGE, accountId));
	}
	
	public String getCurrentBalance(){
		return getTextElement(driver, WithdrawSuccessfulUI.CURRENT_BALANCE);
	}
}
