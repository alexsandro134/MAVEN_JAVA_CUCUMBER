package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.AbstractPagePO;
import pageObjects.BankGuruPageManagerDriver;

import commons.AbstractTest;

import cucumber.api.java.en.When;
import cucumberConfig.Hooks;

public class AbstractPageSteps {
	WebDriver driver;
	private AbstractPagePO abtractPage;
	private AbstractTest abstractTest;
	
	public AbstractPageSteps() {
		driver = Hooks.openBrowser();
		abtractPage = (AbstractPagePO) BankGuruPageManagerDriver.getInstance(driver, "AbstractPage");
		abstractTest = new AbstractTest();
	}

	@When("^I input to \"(.*?)\" textbox with data \"(.*?)\"$")
	public void iInputToDynamicTextboxWithDynamicData(String textboxName, String value) {
		abtractPage.inputToDynamicTextbox(textboxName, value);
	}

	@When("^I input to \"(.*?)\" textarea with data \"(.*?)\"$")
	public void iInputToDynamicTextareaWithDynamicData(String textareName, String value) {
		abtractPage.inputToDynamicTextbox(textareName, value);
	}

	@When("^I input to \"(.*?)\" textbox with random data \"(.*?)\"$")
	public void iInputToDynamicTextboxWithRandomData(String textboxName, String value) {
		value = value + abstractTest.generateEmail();
		abtractPage.inputToDynamicTextbox(textboxName, value);
	}

	@When("^I input to \"(.*?)\" textarea with random data \"(.*?)\"$")
	public void iInputToDynamicTextareaWithRandomData(String textareName, String value) {
		value = value + abstractTest.generateEmail();
		abtractPage.inputToDynamicTextbox(textareName, value);
	}
	
	@When("^I click to \"(.*?)\" button$")
	public void iClickToDynamicButton(String buttonName) {
		abtractPage.clickToDynamicButton(buttonName);
	}

	@When("^I click to \"(.*?)\" radio button$")
	public void iClickToDynamicRadioButton(String radiobuttonName) {
		abtractPage.clickToDynamicRadioButton(radiobuttonName);
	}
	
	@When("^I open \"(.*?)\" page$")
	public void iOpenDymanicPage(String pageName) {
	}
}
