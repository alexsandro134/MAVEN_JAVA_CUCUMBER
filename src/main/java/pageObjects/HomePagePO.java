package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.HomePageUI;

public class HomePagePO extends AbstractPage {
	WebDriver driver;

	public HomePagePO(WebDriver _driver) {
		driver = _driver;
	}

	public boolean checkWelcomeMessageDisplayed() {
		waitForControlVisible(driver, HomePageUI.WELCOME_MESSAGE);
		return isControlDisplayed(driver, HomePageUI.WELCOME_MESSAGE);
	}

	public boolean checkUsernameDisplayed(String userId) {
		waitForControlVisible(driver, String.format(HomePageUI.USER_DISPLAY, userId));
		return isControlDisplayed(driver, String.format(HomePageUI.USER_DISPLAY, userId));
	}
}
