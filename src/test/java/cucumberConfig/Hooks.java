package cucumberConfig;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import cucumber.api.java.Before;

public class Hooks {
	private static WebDriver driver;
	private static final Logger log = Logger.getLogger(Hooks.class.getName());

	@Before
	public synchronized static WebDriver openBrowser() {
		String browser = System.getProperty("BROWSER");

		if (driver == null) {
			try {
				// Kiem tra BROWSER = null -> gan = chrome
				if (browser == null) {
					browser = System.getenv("BROWSER");
					if (browser == null) {
						browser = "chrome";
					}
				}

				switch (browser) {
				case "chrome":
					ChromeDriverManager.getInstance().setup();
					driver = new ChromeDriver();
					break;
				case "firefox":
					FirefoxDriverManager.getInstance().setup();
					driver = new FirefoxDriver();
					break;
				case "ie":
					InternetExplorerDriverManager.getInstance().setup();
					driver = new InternetExplorerDriver();
					break;
				default:
					ChromeDriverManager.getInstance().setup();
					driver = new ChromeDriver();
					break;
				}
			} catch (UnreachableBrowserException e) {
				driver = new ChromeDriver();
			} catch (WebDriverException e) {
				driver = new ChromeDriver();
			} finally {
				Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
			}

			driver.get("http://demo.guru99.com/v4/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			log.info("------------- Started the browser -------------");
		}
		return driver;
	}

	public static void close() {
		try {
			if (driver != null) {
				openBrowser().quit();
				log.info("------------- Closed the browser -------------");
			}
		} catch (UnreachableBrowserException e) {
			System.out.println("Can not close the browser");
		}
	}

	private static class BrowserCleanup implements Runnable {
		public void run() {
			close();
		}
	}
}
