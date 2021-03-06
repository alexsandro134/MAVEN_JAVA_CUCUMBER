package commons;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;

public class AbstractTest {
	WebDriver driver;
	private final String workingDir = System.getProperty("user.dir");

	protected final Log log;

	public AbstractTest() {
		log = LogFactory.getLog(getClass());
	}

//	@SuppressWarnings("deprecation")
	protected WebDriver openMultiBrowser(String browser, String browserVersion, String url) {
		if (browser.equals("chrome")) {
			ChromeDriverManager.getInstance().version(browserVersion).setup();
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("disable-infobars");
			options.addArguments("start-maximized");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);
		} else if (browser.equals("firefox")) {
			FirefoxDriverManager.getInstance().version(browserVersion).setup();
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, workingDir + "\\FirefoxLog.txt");
			FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver(options);
		} else if (browser.equals("firefox_headless")) {
			FirefoxDriverManager.getInstance().version(browserVersion).setup();
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, workingDir + "\\FirefoxLog.txt");
			FirefoxBinary firefoxBinary = new FirefoxBinary();
			firefoxBinary.addCommandLineOptions("--headless");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setBinary(firefoxBinary);
			driver = new FirefoxDriver(firefoxOptions);
		} else if (browser.equals("chrome_headless")) {
			ChromeDriverManager.getInstance().version(browserVersion).setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("window-size=1920x1080");
			driver = new ChromeDriver(options);
		} else if (browser.equals("ie")) {
			InternetExplorerDriverManager.getInstance().version(browserVersion).setup();
			DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capability.setCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR, true);
			capability.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);

			capability.setCapability("ignoreProtectedModeSettings", true);
			capability.setCapability("ignoreZoomSetting", true);
			capability.setCapability("requireWindowFocus", true);
			capability.setJavascriptEnabled(true);

			capability.setCapability("enableElementCacheCleanup", true);
			capability.setPlatform(org.openqa.selenium.Platform.ANY);

			driver = new InternetExplorerDriver(capability);
		} else {
			System.out.println("Can't init browser!");
		}
		log.info("Before Class: Open Url of Login Page");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public String generateEmail() {
		StringBuilder randomEmail = new StringBuilder();
		randomEmail.append(RandomStringUtils.random(10, "abcdefghijklmnopqrstuvxyz1234567890")).append("@gmail.com");
		return randomEmail.toString();
	}

	private boolean checkPassed(boolean condition) {
		boolean pass = true;
		try {
			Assert.assertTrue(condition);
			log.info("----------------- PASSED -----------------");
		} catch (Throwable e) {
			log.info("----------------- FAILED -----------------");
			pass = false;
			// Attach exception to ReportNG
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	public boolean verifyTrue(boolean condition) {
		return checkPassed(condition);
	}

	private boolean checkFailed(boolean condition) {
		boolean pass = true;
		try {
			Assert.assertFalse(condition);
			log.info("----------------- PASSED -----------------");
		} catch (Throwable e) {
			log.info("----------------- FAILED -----------------");
			pass = false;
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	public boolean verifyFalse(boolean condition) {
		return checkFailed(condition);
	}

	private boolean checkEquals(Object actual, Object expected) {
		boolean pass = true;
		try {
			Assert.assertEquals(actual, expected);
			log.info(actual + " is equals " + expected);
			log.info("----------------- PASSED -----------------");
		} catch (Throwable e) {
			log.info(actual + " is not equals " + expected);
			log.info("----------------- FAILED -----------------");
			pass = false;
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	public boolean verifyEquals(Object actual, Object expected) {
		return checkEquals(actual, expected);
	}

	protected void closeBrowser(WebDriver driver) {
		try {
			String osName = System.getProperty("os.name").toLowerCase();
			String cmd = "";
			driver.quit();
			if (driver.toString().toLowerCase().contains("chrome")) {
				if (osName.toLowerCase().contains("mac")) {
					cmd = "pkill chromedriver";
				} else {
					cmd = "taskkill /F /FI \"IMAGENAME eq chromedriver.exe*\"";
				}
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}
			if (driver.toString().toLowerCase().contains("internetexplorer")) {
				cmd = "taskkill /F /FI \"IMAGENAME eq IEDriverServer*\"";
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}
			if (driver.toString().toLowerCase().contains("gecko")) {
				cmd = "taskkill /F /FI \"IMAGENAME eq geckodriver.exe*\"";
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}
			log.info("---------- QUIT BROWSER SUCCESS ----------");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
