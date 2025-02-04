package Commons;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedListHelper {
	private static Logger log = LogManager.getLogger(LinkedListHelper.class);
	private static WebDriver driver;
	public final static int TIMEOUT = 2;

	public static void setupDriver() {
		log.info("setting up driver....");
		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
			driver.manage().window().maximize();
		}
	}

	public static void openPage(String url) {
		driver.get(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void closeDriver() {
		/*
		 * String window = driver.getWindowHandle(); driver.switchTo().window(window);
		 * driver.close();
		 */
		driver.quit();
	}

}