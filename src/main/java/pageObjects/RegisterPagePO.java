package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.RegisterPageUI;

public class RegisterPagePO extends AbstractPage {
	WebDriver driver;

	public RegisterPagePO(WebDriver _driver) {
		driver = _driver;
	}

	public void inputEmailID(String email) {
		waitForControlVisible(driver, RegisterPageUI.EMAIL_ID_TXT);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_ID_TXT, email);
	}

	public void submitEmail() {
		waitForControlVisible(driver, RegisterPageUI.SUBMIT_BTN);
		clickToElement(driver, RegisterPageUI.SUBMIT_BTN);
	}

	public String getUsername() {
		waitForControlVisible(driver, RegisterPageUI.USER_ID_TEXT);
		String username = getTextElement(driver, RegisterPageUI.USER_ID_TEXT);
		return username;
	}

	public String getPassword() {
		waitForControlVisible(driver, RegisterPageUI.PASSWORD_TEXT);
		String password = getTextElement(driver, RegisterPageUI.PASSWORD_TEXT);
		return password;
	}
	
	public LoginPagePO openUrl(String url){
		openAnyUrl(driver, url);
		return BankGuruPageManagerDriver.getLoginPage(driver);
	}
}
