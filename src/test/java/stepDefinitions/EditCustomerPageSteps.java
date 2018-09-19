package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.BankGuruPageManagerDriver;
import pageObjects.EditCustomerPO;
import cucumber.api.java.en.When;
import cucumberConfig.Hooks;

public class EditCustomerPageSteps {
	WebDriver driver;
	private EditCustomerPO editCustomerPage;

	public EditCustomerPageSteps() {
		driver = Hooks.openBrowser();
		editCustomerPage = (EditCustomerPO) BankGuruPageManagerDriver.getInstance(driver, "EditCustomerPage");
	}
	
	@When("^I input to Customer ID$")
	public void iInputToCustomerID() {
		editCustomerPage.inputCustomerID(ShareData.customerID);
	}
}
