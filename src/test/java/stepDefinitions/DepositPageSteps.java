package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import cucumberConfig.Hooks;
import pageObjects.BankGuruPageManagerDriver;
import pageObjects.DepositPagePO;

public class DepositPageSteps {
	WebDriver driver;
	private DepositPagePO depositPage;
	private ShareData shareData;

	public DepositPageSteps(ShareData shareData) {
		driver = Hooks.openBrowser();
		this.shareData = shareData;
		depositPage = (DepositPagePO) BankGuruPageManagerDriver.getInstance(driver, "DepositPage");
	}

	@When("^I input to first account number$")
	public void iInputToFirstAccountNumber() {
		depositPage.inputDynamicLocatorWithText(shareData.accountID_1, "accountno");
	}
}
