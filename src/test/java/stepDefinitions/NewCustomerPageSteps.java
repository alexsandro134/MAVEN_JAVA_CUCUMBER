package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.BankGuruPageManagerDriver;
import pageObjects.NewCustomerPagePO;
import cucumber.api.java.en.When;
import cucumberConfig.Hooks;

public class NewCustomerPageSteps {
	WebDriver driver;
	private NewCustomerPagePO newCustomerPage;

	public NewCustomerPageSteps() {
		driver = Hooks.openBrowser();
		newCustomerPage = BankGuruPageManagerDriver.getNewCustomerPage(driver);
	}

	@When("^I click to Edit Customer page$")
	public void iClickToEditCustomerPage() {
		newCustomerPage.openEditCustomerPage(driver);
	}
	
//	@When("^I input all information to New Customer form$")
//	public void iInputAllInformationToNewCustomerForm() {
//
//	}
//
//	@When("^I click to Submit button$")
//	public void iClickToSubmitButton() {
//		newCustomerPage.clickToSubmit();
//	}

}
