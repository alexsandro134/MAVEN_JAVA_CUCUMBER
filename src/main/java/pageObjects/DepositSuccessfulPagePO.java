package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.DepositSuccessfulUI;

public class DepositSuccessfulPagePO extends AbstractPage {
	WebDriver driver;

	public DepositSuccessfulPagePO(WebDriver _driver) {
		driver = _driver;
	}

	public boolean checkDepositToAccount(String accountId) {
		waitForControlVisible(driver, String.format(DepositSuccessfulUI.SUCCESSFUL_MESSAGE, accountId));
		return isControlDisplayed(driver, String.format(DepositSuccessfulUI.SUCCESSFUL_MESSAGE, accountId));
	}
	
	public String getCurrentBalance(){
		return getTextElement(driver, DepositSuccessfulUI.CURRENT_BALANCE);
	}
}
