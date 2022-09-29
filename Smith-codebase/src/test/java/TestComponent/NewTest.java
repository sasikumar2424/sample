package TestComponent;

import org.testng.annotations.Test;

import utilscomponent.uiutils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import java.util.List;
import java.util.concurrent.TimeUnit;



public class NewTest extends uiutils  {
	
  @Test
  public void Testcase1() throws InterruptedException {
	  test=extent.createTest("TC 1 - Verify login Page ");
	
	//  WebElement ref = driver.findElement(By.xpath("(//a[@class='dropdown-toggle' or @data-toggle='dropdown'] )[1]"));
	 driver.findElement(By.xpath("//div[@style='width: 100%;']//following::div[@class='ui-dropdown-label-container ng-tns-c66-11']")).click();
	  
	  WebElement ref =driver.findElement(By.xpath("//div[@class='ui-dropdown-items-wrapper ng-tns-c66-11']"));
	 
	//  dropdownvalue("\"(//a[@class='dropdown-toggle' or @data-toggle='dropdown'] )[1]\")","Table Demo" );
	  	
	  Select Z = new Select (ref);
	  
	  List <WebElement> L = Z.getOptions();
	  for (WebElement x : L) {
		  
		  System.out.println(x.getText());
		
	}
	  
	  
	  
	System.out.println(  ref.getText());
	 
	  
  }
  
  
  @BeforeMethod
  public void Launchbrowser() {
	  browserlaunch("chrome");
		launchurl("https://www.irctc.co.in/nget/train-search");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void BrowserClose() {
	  
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
