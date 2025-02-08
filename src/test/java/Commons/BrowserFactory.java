package Commons;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	private static WebDriver driver;
	private static Properties prop = new Properties();
	WebDriver driverinstance;
	private static String browserType = null;
	
	public static void setBrowserType(String browser) {
		browserType = browser;
	}
	
	public static String browserfromconfigfile() throws IOException {
		prop.load(BrowserFactory.class.getClassLoader().getResourceAsStream("configuration.properties"));
		browserType = prop.getProperty("browser");
		return browserType;
	}
	
	public static String getBrowserType() throws IOException {
		if (browserType == null)
		{
			browserType=browserfromconfigfile();
		}
		return browserType;
	}
	
	public WebDriver browsersetup(String browsername) 
	{
		if(browsername.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			}
		else if(browsername.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			}
		else if(browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			}
		driverinstance = driver;
		return driverinstance;
	} 
	
	public static WebDriver getdriverinstance() {
		return driver;
	}
	}
