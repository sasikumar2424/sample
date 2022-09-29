package TestComponent;

import org.testng.annotations.Test;

import GenenricComponent.BaseTest;
import utilscomponent.uiutils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SanityTests extends BaseTest {



	@Test
	public void Testcaseone() throws Exception {
		launchurl(getpropvalue("DEMOURL"));
		test = extent.createTest("TC 1 - Verify Registration page");
		typetext("//input[@placeholder='First Name']", getExceldata("Loginpage", 0, 0));
		typetext("//input[@placeholder='Last Name']", "SD");
	}

	@Test
	public void Testcasetwo() throws InterruptedException {
		launchurl("GURUWEB");
		test = extent.createTest("TC 2 - Verify login Page ");
		click("//a[contains(text(),'Bank Project')]");
		typetext("//input[@maxlength='10']", "mngr394840");
		typetext("//input[@onkeyup='validatepassword();']", "pemEteb");
		click("//input[@value='LOGIN']");
		Thread.sleep(3000);

	}

	@Test
	public void Testcasethree() throws InterruptedException {

		launchurl("GURUWEB");
		test = extent.createTest("TC 3 - Navigate to telecom ");
		click("//a[contains(text(),'Telecom Project')]");
		click("//a[contains(text(),'Add Customer')]");
		Thread.sleep(3000);

	}

	@Test
	public void Testcasefour() throws InterruptedException {
		launchurl("GURUWEB");
		test = extent.createTest("TC 4 - Navigate to security login page ");
		click("//a[contains(text(),'Security Project')]");
		driver.switchTo();
	}



}
