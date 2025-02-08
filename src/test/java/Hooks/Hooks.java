package Hooks;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Commons.BrowserFactory;
import Commons.LoggerLoad;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {
	
	public BrowserFactory bf=new BrowserFactory();
	public WebDriver driver;
	private String appurl;
	private Properties prop = new Properties();
	

	@Before
	public void homepage() throws Throwable {
		String browser = bf.getBrowserType();
		driver =bf.browsersetup(browser);
		try {
			prop.load(BrowserFactory.class.getClassLoader().getResourceAsStream("configuration.properties"));
			appurl = prop.getProperty("appurl");
			driver.get(appurl);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			LoggerLoad.error("Take failed scenario screenshot");
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.addAttachment("Myscreenshot",
					new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		
		}
	}

	@After
	public void closebrowser() {
		driver.quit();
	}
}
