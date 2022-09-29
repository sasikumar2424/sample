package TestComponent;

import org.testng.annotations.Test;

import utilscomponent.uiutils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demoguru99 extends uiutils {
	
  @Test
  public void Testcase1 () throws InterruptedException {
	   
	  test=extent.createTest("TC 1 - Verify login Page ");
	  click("//a[contains(text(),'Bank Project')]");		
	  typetext("//input[@maxlength='10']", "mngr394840");
	  typetext("//input[@onkeyup='validatepassword();']", "pemEteb");
	  click("//input[@value='LOGIN']");
	  Thread.sleep(3000);
	  
  }
  
  @Test
   public static void Testcase2 () throws InterruptedException { 
   test=extent.createTest("TC 2 - Navigate to telecom ");
   click("//a[contains(text(),'Telecom Project')]");
   click("//a[contains(text(),'Add Customer')]");
      Thread.sleep(3000);
  
  }
  
  @Test
  public static void Testcase3 () throws InterruptedException { 
  test=extent.createTest("TC 3 - Navigate to security login page ");
  click("//a[contains(text(),'New Customer')]");
 // click("//a[contains(text(),'Add Customer')]");
  
  }
  
  @BeforeMethod
  public void LaunchBrowser() throws InterruptedException {
	  browserlaunch("chrome");
		launchurl("https://demo.guru99.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
  }

  @AfterMethod
  public void CloseBrowser() {
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
