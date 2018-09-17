package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.BankGuruPageManagerDriver;
import pageObjects.NewCustomerPagePO;
import cucumber.api.java.en.When;
import cucumberConfig.Hooks;
import interfaces.NewCustomerPageUI;

public class NewCustomerPageSteps {
	WebDriver driver;
	private NewCustomerPagePO newCustomerPage;

	public NewCustomerPageSteps() {
		driver = Hooks.openBrowser();
		newCustomerPage = (NewCustomerPagePO) BankGuruPageManagerDriver.getInstance(driver, "NewCustomerPage");
	}

	@When("^I click to Edit Customer page$")
	public void iClickToEditCustomerPage() {
		newCustomerPage.openEditCustomerPage(driver);
	}

	@When("^I input to dob textbox with data \"(.*?)\"$")
	public void iInputDob(String value) {
		newCustomerPage.removeAttributeOfElement(driver, NewCustomerPageUI.CUSTOMER_DOB, "type");
		newCustomerPage.sendkeyToElement(driver, NewCustomerPageUI.CUSTOMER_DOB, value);
	}
}
