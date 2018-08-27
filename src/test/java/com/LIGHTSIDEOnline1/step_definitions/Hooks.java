package com.LIGHTSIDEOnline1.step_definitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.LIGHTSIDEOnline1.utilities.ConfigurationReader;
import com.LIGHTSIDEOnline1.utilities.DBUtils;
import com.LIGHTSIDEOnline1.utilities.Driver;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	WebDriver driver = Driver.getDriver();

	@Before
	public void setUp() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}
	@Before("@db")
	public void setUpDBConnection() {
		DBUtils.createConnection();
	}

	@After("@db")
	public void tearDownDBConnection() {
		DBUtils.destroy();
	}

	@After
	public void tearDown(Scenario scenario) {
		// only takes a screenshot if the scenario fails
		if (scenario.isFailed()) {
			// taking a screenshot
			final byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
					.getScreenshotAs(OutputType.BYTES);
			// adding the screenshot to the report
			scenario.embed(screenshot, "image/png");
		}
		Driver.closeDriver();
	}

}
