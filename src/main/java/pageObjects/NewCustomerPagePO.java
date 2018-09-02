package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.AbstractPage;
import interfaces.NewCustomerPageUI;

public class NewCustomerPagePO extends AbstractPage {
	WebDriver driver;

	public NewCustomerPagePO(WebDriver _driver) {
		driver = _driver;
	}

	public void inputCustomerDob(String value) {
		removeAttributeOfElement(driver, NewCustomerPageUI.CUSTOMER_DOB, "type");
		sendkeyToElement(driver, NewCustomerPageUI.CUSTOMER_DOB, value);
	}

	public void inputCustomerAddress(String text) {
		sendkeyToElement(driver, NewCustomerPageUI.CUSTOMER_ADDRESS, text);
	}

	public void pressTabKeyToDynamicLocator(String value) {
		keyPress(driver, Keys.TAB, NewCustomerPageUI.DYNAMIC_INPUT, value);
	}

	public void pressTabKeyToCustomerAddress() {
		keyPress(driver, Keys.TAB, NewCustomerPageUI.CUSTOMER_ADDRESS);
	}

	public boolean checkContentErrorMessage(String errorMessage) {
		waitForControlVisible(driver, String.format(NewCustomerPageUI.DYNAMIC_ERROR_MSG, errorMessage));
		return isControlDisplayed(driver, String.format(NewCustomerPageUI.DYNAMIC_ERROR_MSG, errorMessage));
	}

	public boolean isErrorMessageNotDisplayed(String errorMessage) {
		List<WebElement> elements = driver.findElements(By.xpath(NewCustomerPageUI.DYNAMIC_ERROR_MSG));
		if (elements.size() == 0) {
			return true;
		} else
			return false;
	}

	public CustomerRegisterSuccessfulPO clickToSubmit() {
		clickToElement(driver, NewCustomerPageUI.SUBMIT_BUTTON);
		return BankGuruPageManagerDriver.getCustomerRegisterSuccessfulPage(driver);
	}
}
