package Runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Commons.BrowserFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = { "pretty", "html:Reports/cucumber-reports.html",
				"json:Reports/cucumber-reports.json",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
		monochrome=false, 
		tags = "@cross",
		features = {"src/test/resources/features"}, 
		glue= {"StepDefinition","Hooks"}) 

public class TestRunnerCrossBrowserTesting extends AbstractTestNGCucumberTests{
	@BeforeTest
    @Parameters({"browser"})
	public void defineBrowser(String browser)  {
		BrowserFactory.setBrowserType(browser);
	}
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
				
		return super.scenarios();
	}
	
}
