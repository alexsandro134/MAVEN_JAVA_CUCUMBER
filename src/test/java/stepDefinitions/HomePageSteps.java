package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumberConfig.Hooks;
import pageObjects.BankGuruPageManagerDriver;
import pageObjects.HomePagePO;

public class HomePageSteps {
	WebDriver driver;
	private HomePagePO homePage;

	public HomePageSteps() {
		driver = Hooks.openBrowser();
		homePage = (HomePagePO) BankGuruPageManagerDriver.getInstance(driver, "HomePage");
	}

	@Then("^I verify Homepage displayed$")
	public void iVerifyHomepageDisplayed() {
		Assert.assertTrue(homePage.checkWelcomeMessageDisplayed());
	}
}
