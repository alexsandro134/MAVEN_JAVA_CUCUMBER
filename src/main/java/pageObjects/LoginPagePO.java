package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.LoginPageUI;

public class LoginPagePO extends AbstractPage {
	WebDriver driver;

	public LoginPagePO(WebDriver _driver) {
		driver = _driver;
	}

	public String getLoginPageUrl() {
		return getCurrentUrl(driver);
	}

	public RegisterPagePO clickToRegisterPage() {
		waitForControlVisible(driver, LoginPageUI.HERE_LINK);
		clickToElement(driver, LoginPageUI.HERE_LINK);
		return BankGuruPageManagerDriver.getRegisterPage(driver);
	}

	public synchronized void inputUsername(String username) {
		waitForControlVisible(driver, LoginPageUI.USERNAME_TXT);
		sendkeyToElement(driver, LoginPageUI.USERNAME_TXT, username);
	}

	public synchronized void inputPassword(String pwd) {
		waitForControlVisible(driver, LoginPageUI.PASSWORD_TXT);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TXT, pwd);
	}

	public HomePagePO loginToHomePage() {
		waitForControlVisible(driver, LoginPageUI.SUBMIT_BTN);
		clickToElement(driver, LoginPageUI.SUBMIT_BTN);
		return BankGuruPageManagerDriver.getHomePage(driver);
	}
}
