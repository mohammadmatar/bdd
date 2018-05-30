package runners;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests",
		glue= {"stepDefinitions"},
		plugin = { "pretty", "json:cucumber-reports/Cucumber.json",
				"junit:cucumber-reports/Cucumber.xml",
				"html:cucumber-reports",
				"com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/ExtentCucumberReport.html"},
		monochrome = true
		)
public class TestRunner {
	@AfterClass
	public static void teardown() {

		Reporter.loadXMLConfig(new File("configs/extent-config.xml"));
		Reporter.setSystemInfo("User", System.getProperty("user.name"));
		Reporter.setSystemInfo("OS", "Ubuntu 16.0");
		Reporter.setTestRunnerOutput("Test runner output message");
	}

}
