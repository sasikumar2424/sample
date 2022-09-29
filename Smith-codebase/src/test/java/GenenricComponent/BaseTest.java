package GenenricComponent;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utilscomponent.uiutils;

public class BaseTest extends uiutils{

	@BeforeMethod
	public void beforeMethod() {
		browserlaunch("chrome");

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@BeforeSuite
	public void beforeSuite() {
		extentreportinitiate();
	}

	@AfterSuite
	public void afterSuite() {
		extentreportfinisher();
	}
}
