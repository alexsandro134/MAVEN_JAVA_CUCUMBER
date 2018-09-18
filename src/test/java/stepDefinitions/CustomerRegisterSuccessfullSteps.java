package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.BankGuruPageManagerDriver;
import pageObjects.CustomerRegisterSuccessfulPO;
import cucumber.api.java.en.When;
import cucumberConfig.Hooks;

public class CustomerRegisterSuccessfullSteps extends ShareData{
	WebDriver driver;
	private CustomerRegisterSuccessfulPO customerRegisterSuccessful;
	private ShareData shareData;

	public CustomerRegisterSuccessfullSteps(ShareData shareData) {
		driver = Hooks.openBrowser();
		this.shareData = shareData;
		customerRegisterSuccessful = (CustomerRegisterSuccessfulPO) BankGuruPageManagerDriver.getInstance(driver, "CustomerRegisterSuccessfulPage");
	}

	@When("^I get Customer ID$")
	public void iGetCustomerID() {
		shareData.customerID = customerRegisterSuccessful.getCustomerId();
	}
}
