package StepDefinitions;

import java.sql.SQLException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Factory.driverFactory;
import Util.configReader;
import Util.elementUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class appHooks {
	private driverFactory DriverFactory;
	private WebDriver driver;
	private configReader ConfigReader;
	Properties prop;
	private elementUtil util = new elementUtil(driverFactory.getDriver());

	@Before(order = 0)
	public void getProperty() {
		ConfigReader = new configReader();
		prop = ConfigReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("Browser");
		DriverFactory = new driverFactory();
		driver = DriverFactory.init_driver(browserName);	
	}

	@After(order = 0)
	public void quitBrowser() {
		if (driver != null) {
			  driver.close();
			  driver.quit(); 			 
		}
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			System.out.println(screenshotName);
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
}
