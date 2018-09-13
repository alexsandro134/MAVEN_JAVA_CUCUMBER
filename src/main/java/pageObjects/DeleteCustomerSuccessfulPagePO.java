package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class DeleteCustomerSuccessfulPagePO extends AbstractPage {
	WebDriver driver;

	public DeleteCustomerSuccessfulPagePO(WebDriver _driver) {
		driver = _driver;
	}

	public HomePagePO acceptAlertToVerifyCustomerDeleted(){
		waitForAlertPresence(driver);
		acceptAlert(driver);
		return (HomePagePO) BankGuruPageManagerDriver.getInstance(driver, "HomePage");
	}
	
	public String getAlertText(){
		waitForAlertPresence(driver);
		return getTextAlert(driver);
	}
}
