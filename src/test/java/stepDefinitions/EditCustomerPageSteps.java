package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.BankGuruPageManagerDriver;
import pageObjects.EditCustomerPO;
import cucumber.api.java.en.When;
import cucumberConfig.Hooks;

public class EditCustomerPageSteps {
	WebDriver driver;
	private EditCustomerPO editCustomerPage;
	private ShareData shareData;

	public EditCustomerPageSteps(ShareData shareData) {
		driver = Hooks.openBrowser();
		this.shareData = shareData;
		editCustomerPage = (EditCustomerPO) BankGuruPageManagerDriver.getInstance(driver, "EditCustomerPage");
	}
	
	@When("^I input to Customer ID$")
	public void iInputToCustomerID() {
		editCustomerPage.inputCustomerID(shareData.customerID);
	}

}
