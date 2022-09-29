package TestComponent;

import org.testng.annotations.Test;

import GenenricComponent.BaseTest;
import PagesComponent.Deletecustomer;
import PagesComponent.Editcustomerpage;
import PagesComponent.Loginpage;
import PagesComponent.NewCustomerpage;
import utilscomponent.uiutils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BDDDemo99 extends BaseTest {

	@Test
	public static void Testcaseone() throws Exception {


		test = extent.createTest("TC 1 - Verify EditBL ");
		launchurl(getpropvalue("GURUWEB"));
		Loginpage lp=new Loginpage();
		lp.dologin();	
	
				
	}	
	
	
	@Test
	public static void Testcasetwo() throws Exception {


		test =extent.createTest("TC 2 - Verify Newcustomer page");
		launchurl(getpropvalue("GURUWEB"));
		Loginpage lp=new Loginpage();
		lp.dologin();	
		
		
		NewCustomerpage ncp=new NewCustomerpage();
		ncp.donewcustomerregister();
				
	}
	
	@Test
	public static void Testcasethree() throws Exception {


		test=extent.createTest("TC 3 - Verify Editcustomer page");
		launchurl(getpropvalue("GURUWEB"));
		Loginpage lp=new Loginpage();
		lp.dologin();	
		Editcustomerpage Ec = new Editcustomerpage () ;
		Ec.doeditcustomer();
				
	}
	

	@Test
	public static void Testcasefour() throws Exception {


		test=extent.createTest("TC 4 - Verify DeleteCustomer page");
		launchurl(getpropvalue("GURUWEB"));
		Loginpage lp=new Loginpage();
		lp.dologin();	
		
		
		Deletecustomer Dlc = new Deletecustomer ();
		Dlc.Deletelogin();
				
	}

	
	
	
	
	/*@Test
	public static void Testcasetwo() throws Exception {


		test = extent.createTest("TC 1 - Verify Edit customer ");
		launchurl(getpropvalue("GURUWEB"));
		Loginpage lp=new Loginpage();
		lp.dologin();		
		
		DeleteCustomerpage ncp=new DeleteCustomerpage();
		ncp.dodeletecustomerregister();
	}	
	
	
	@Test
	public static void Testcasethree() throws Exception {


		test = extent.createTest("TC 1 - Verify Edit customer ");
		launchurl(getpropvalue("GURUWEB"));
		Loginpage lp=new Loginpage();
		lp.dologin();		
		
		Logoutpage ncp=new Logoutpage();
		ncp.dologout();
	}	
	

//		launchurl(getpropvalue("GURUWEB"));
//		test = extent.createTest("TC 4 - Verify Edit customer ");
//		click("//a[contains(text(),'Bank Project')]");
//		typetext("//input[@type='text']", getExceldata("Loginpage", 2, 0));
//
//		click("//input[@type='submit']");
//		Thread.sleep(3000);

//		launchurl(getpropvalue("GURUWEB"));
//		test = extent.createTest("TC 5 - Verify Delete customer ");
//		click("//a[contains(text(),'Bank Project')]");
//		click("(//a[contains(text(),'Delete Customer')])[1]");
//		typetext("//input[@type='text']", getExceldata("Loginpage", 2, 0));
//
//		click("//input[@type='submit']");
//		Thread.sleep(3000);
*/


	
}
