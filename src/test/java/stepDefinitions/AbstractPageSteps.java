package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberConfig.Hooks;
import pageObjects.AbstractPagePO;
import pageObjects.BankGuruPageManagerDriver;
import pageObjects.DepositPagePO;
import pageObjects.EditCustomerPO;
import pageObjects.HomePagePO;
import pageObjects.NewAccountPO;
import pageObjects.NewCustomerPagePO;

public class AbstractPageSteps {
	WebDriver driver;
	private AbstractPagePO abstractPage;
	private AbstractTest abstractTest;
	private NewCustomerPagePO newCustomerPage;
	private EditCustomerPO editCustomerPage;
	private HomePagePO homePage;
	private NewAccountPO newAccountPage;
	private DepositPagePO depositPage;

	public AbstractPageSteps() {
		driver = Hooks.openBrowser();
		abstractPage = (AbstractPagePO) BankGuruPageManagerDriver.getInstance(driver, "AbstractPage");
		abstractTest = new AbstractTest();
	}
	

	@When("^I input to \"(.*?)\" textbox with data \"(.*?)\"$")
	public void iInputToDynamicTextboxWithDynamicData(String textboxName, String value) {
		abstractPage.inputToDynamicTextbox(textboxName, value);
	}

	@When("^I input to \"(.*?)\" textarea with data \"(.*?)\"$")
	public void iInputToDynamicTextareaWithDynamicData(String textareName, String value) {
		abstractPage.inputToDynamicTextarea(textareName, value);
	}

	@When("^I input to \"(.*?)\" textbox with random data \"(.*?)\"$")
	public void iInputToDynamicTextboxWithRandomData(String textboxName, String value) {
		value = value + abstractTest.generateEmail();
		abstractPage.inputToDynamicTextbox(textboxName, value);
	}

	@When("^I input to \"(.*?)\" textarea with random data \"(.*?)\"$")
	public void iInputToDynamicTextareaWithRandomData(String textareName, String value) {
		value = value + abstractTest.generateEmail();
		abstractPage.inputToDynamicTextarea(textareName, value);
	}

	@When("^I click to \"(.*?)\" button$")
	public void iClickToDynamicButton(String buttonName) {
		abstractPage.clickToDynamicButton(buttonName);
	}

	@When("^I click to \"(.*?)\" radio button$")
	public void iClickToDynamicRadioButton(String radiobuttonName) {
		abstractPage.clickToDynamicRadioButton(radiobuttonName);
	}

	@When("^I open \"(.*?)\" page$")
	public void iOpenDynamicPage(String pageName) {
		switch (pageName) {
		case "New Customer":
			newCustomerPage = abstractPage.openNewCustomerPage(driver);
			break;
		case "Edit Customer":
			editCustomerPage = abstractPage.openEditCustomerPage(driver);
			break;
		case "New Account":
			newAccountPage = abstractPage.openNewAccountPage(driver);
			break;
		case "Deposit":
			depositPage = abstractPage.openDepositPage(driver);
			break;
		default:
			homePage = abstractPage.openHomePage(driver);
			break;
		}
	}
	
	@Then("^I verify success message displayed with \"(.*?)\"$")
	public void iVerifyDynamicSuccessMessageDisplayed(String message) {
		abstractTest.verifyTrue(abstractPage.isDynamicSuccessMessageDisplayed(message));
	}
	
	@Then("^I verify success message displayed with data \"(.*?)\"$")
	public void iVerifyDynamicSuccessMessageDisplayedWithData(String message) {
		message = message + " " + ShareData.accountID_1;
		abstractTest.verifyTrue(abstractPage.isDynamicSuccessMessageDisplayed(message));
	}
	
	
	@Then("^I verify expected data at \"(.*?)\" label equal actual data \"(.*?)\"$")
	public void iVerifyExpectedDataAtLabelEqualActualData(String labelName, String actualData) throws Throwable {
		abstractTest.verifyEquals(actualData, abstractPage.getDataDynamicLabelInTable(labelName));
	}
	// update test hook
}
