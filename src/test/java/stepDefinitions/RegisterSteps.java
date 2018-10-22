package stepDefinitions;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegisterSteps {
	WebDriver driver;

	@Given("^I open My Account page$")
	public void iOpenMyAccountPage() {
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		driver.get("http://live.guru99.com/index.php/customer/account/login/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^I input email \"(.*?)\" and password \"(.*?)\"$")
	public void iInputEmailAndPassword(String username, String password) {
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}

	@When("^I input email and password$")
	public void iInputEmailAndPassword(DataTable table) {
		// 01
		List<Map<String, String>> user = table.asMaps(String.class, String.class);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user.get(0).get("User"));
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(user.get(0).get("Password"));

		// 02
		for (Map<String, String> customer : table.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(customer.get("User"));
			driver.findElement(By.xpath("//input[@id='pass']")).clear();
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(customer.get("Password"));
		}
	}

	@When("^I input email (.*?) vs password (.*?)$")
	public void iInputEmailPassword(String username, String password) {
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}

	@When("^I click to login button$")
	public void iClickToLoginButton() {
		driver.findElement(By.xpath("//button[@id='send2']")).click();
	}

	@When("^I quit browser$")
	public void iQuitBrowser() {
		driver.quit();
	}
}
