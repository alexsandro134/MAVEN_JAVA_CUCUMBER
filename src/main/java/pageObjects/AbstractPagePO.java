package pageObjects;

import interfaces.BankGuruAbstractPageUI;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class AbstractPagePO extends AbstractPage {
	WebDriver driver;

	public AbstractPagePO(WebDriver _driver) {
		driver = _driver;
	}

	public void inputToDynamicTextbox(String textboxName, String value) {
		waitForControlVisible(driver, BankGuruAbstractPageUI.DYNAMIC_TEXTBOX, textboxName);
		sendkeyToElement(driver, value, BankGuruAbstractPageUI.DYNAMIC_TEXTBOX, textboxName);
	}

	public void clickToDynamicButton(String textboxName) {
		waitForControlVisible(driver, BankGuruAbstractPageUI.DYNAMIC_BUTTON, textboxName);
		clickToElement(driver, BankGuruAbstractPageUI.DYNAMIC_BUTTON, textboxName);
	}

	public void inputToDynamicTextarea(String textareaName, String value) {
		waitForControlVisible(driver, BankGuruAbstractPageUI.DYNAMIC_TEXTAREA, textareaName);
		sendkeyToElement(driver, value, BankGuruAbstractPageUI.DYNAMIC_TEXTAREA, textareaName);
	}

	public void clickToDynamicRadioButton(String radioButtonName) {
		waitForControlVisible(driver, BankGuruAbstractPageUI.DYNAMIC_RADIO_BUTTON, radioButtonName);
		clickToElement(driver, BankGuruAbstractPageUI.DYNAMIC_RADIO_BUTTON, radioButtonName);
	}

	public boolean isDynamicSuccessMessageDisplayed(String message) {
		waitForControlVisible(driver, BankGuruAbstractPageUI.DYNAMIC_SUCCESS_MSG, message);
		return isControlDisplayed(driver, BankGuruAbstractPageUI.DYNAMIC_SUCCESS_MSG, message);
	}

	public String getDataDynamicLabelInTable(String labelName) {
		waitForControlVisible(driver, BankGuruAbstractPageUI.DYNAMIC_LABEL_RESULT, labelName);
		return getTextElement(driver, BankGuruAbstractPageUI.DYNAMIC_LABEL_RESULT, labelName);
	}
}
