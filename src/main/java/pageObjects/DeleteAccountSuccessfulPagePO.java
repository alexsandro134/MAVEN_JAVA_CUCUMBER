package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class DeleteAccountSuccessfulPagePO extends AbstractPage {
	WebDriver driver;

	public DeleteAccountSuccessfulPagePO(WebDriver _driver) {
		driver = _driver;
	}

	public HomePagePO acceptAlertToVerifyAccountDeleted(){
		acceptAlert(driver);
		return (HomePagePO) BankGuruPageManagerDriver.getInstance(driver, "HomePage");
	}
	
	public String getAlertText(){
		waitForAlertPresence(driver);
		return getTextAlert(driver);
	}
}
