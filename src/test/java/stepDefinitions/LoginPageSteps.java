package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.BankGuruPageManagerDriver;
import pageObjects.LoginPagePO;
import cucumber.api.java.en.Given;
import cucumberConfig.Hooks;

public class LoginPageSteps {
	WebDriver driver;
	private LoginPagePO loginPage;
	
	public LoginPageSteps() {
		driver = Hooks.openBrowser();
		loginPage = BankGuruPageManagerDriver.getLoginPage(driver);
	}

	@Given("^I input to username \"(.*?)\"$")
	public void iInputToUsername(String username) {
		loginPage.inputUsername(username);
	}

	@Given("^I input to password \"(.*?)\"$")
	public void iInputToPassword(String pwd) {
		loginPage.inputPassword(pwd);
	}

	@Given("^I click to Login button$")
	public void iClickToLoginButton() {
		loginPage.loginToHomePage();
	}

}
