package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.BankGuruPageManagerDriver;
import pageObjects.HomePagePO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumberConfig.Hooks;

public class HomePageSteps {
	WebDriver driver;
	private HomePagePO homePage;

	public HomePageSteps() {
		driver = Hooks.openBrowser();
		homePage = BankGuruPageManagerDriver.getHomePage(driver);
	}

	@Then("^I verify Homepage displayed$")
	public void iVerifyHomepageDisplayed() {
		Assert.assertTrue(homePage.checkWelcomeMessageDisplayed());
	}

	@Given("^I click to New Customer page$")
	public void iClickToNewCustomerPage() {
		homePage.openNewCustomerPage(driver);
	}
}
