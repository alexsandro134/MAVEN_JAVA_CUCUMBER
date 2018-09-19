package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberConfig.Hooks;
import pageObjects.BankGuruPageManagerDriver;
import pageObjects.NewAccountPO;

public class NewAccountPageSteps {
	WebDriver driver;
	private NewAccountPO newAccountPage;

	public NewAccountPageSteps() {
		driver = Hooks.openBrowser();
		newAccountPage = (NewAccountPO) BankGuruPageManagerDriver.getInstance(driver, "NewAccountPage");
	}

	@When("^I select value is \"(.*?)\" in dropdown list \"(.*?)\"$")
	public void iSelectValueIsSomethingInDropdownListSomething(String accounttype, String ddlName) {
		newAccountPage.selectAccountType(accounttype);
	}

	@Then("^I get infor of (first|second) account$")
	public void iGetInforOfFirstAccount(String account) {
		if (account.equalsIgnoreCase("first")) {
			ShareData.accountID_1 = newAccountPage.getAccountId();
		} else if (account.equalsIgnoreCase("second")) {
			ShareData.accountID_2 = newAccountPage.getAccountId();
		}
	}
}
