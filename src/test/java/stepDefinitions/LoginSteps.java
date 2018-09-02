package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	WebDriver driver;
	WebDriverWait wait;

	@Given("^I open application$")
	public void iOpenApplication() {
		driver = new FirefoxDriver();
		driver.get("http://live.guru99.com");
		wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("^I open My Account page$")
	public void iOpenMyAccountPage() {
		driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
	}

	@Then("^The My Account page should be show$")
	public void theMyAccountPageShouldBeShow() {
		Assert.assertTrue(driver.findElement(By.xpath("//form[@id='login-form']")).isDisplayed());
	}

	@When("^I input email \"(.*?)\" and password \"(.*?)\"$")
	public void iInputEmailAndPassword(String username, String pwd) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
	}

	@When("^I click LOGIN button$")
	public void iClickLOGINButton() {
		driver.findElement(By.xpath("//button[@id='send2']")).click();
	}

	@When("^The error message \"(.*?)\" displayed at email field$")
	public void theErrorMessageDisplayedAtEmailField(String emailMessageExpected) {
		String emailMessageActual = driver.findElement(By.xpath("//div[@id='advice-required-entry-email']")).getText();
		Assert.assertEquals(emailMessageExpected, emailMessageActual);
	}

	@When("^The error message \"(.*?)\" displayed at password field$")
	public void theErrorMessageDisplayedAtPasswordField(String passwordMessageExpected) {
		String passwordlMessageActual = driver.findElement(By.xpath("//div[@id='advice-required-entry-pass']")).getText();
		Assert.assertEquals(passwordMessageExpected, passwordlMessageActual);
	}
}
