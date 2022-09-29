package utilscomponent;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uiutils extends commonutils{

	public static WebDriver driver;
	public static ExtentHtmlReporter html;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	
	public static void extentreportinitiate()
	{
		
		 html = new ExtentHtmlReporter("./TestReport.html");
		extent = new ExtentReports();
		extent.attachReporter(html);
	}

	public static void extentreportfinisher()
	{
		extent.flush();
	}
	
	
 
 public static boolean browserlaunch(String browsername) {
		boolean flag = false;
		try {
			if(browsername.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
			}
			else if(browsername.equals("edge"))
			{
				WebDriverManager.edgedriver().setup();
				 driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			flag = true;

		} catch (Exception e) {
			//test.log(Status.FAIL + e.getMessage());
		}

		return flag;
	}

	public static boolean launchurl(String url) {
		boolean flag = false;
		try {
			driver.get(url);
			flag = true;

		} catch (Exception e) {
		 e.getMessage();
		}

		return flag;
	}

	public static boolean click(String loc) {
		boolean flag = false;
		try {
			driver.findElement(By.xpath(loc)).click();
			test.log(Status.PASS,"Element clicked successfully : "+loc);
			System.out.println(loc);			
			flag = true;
			
			

		}

		catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());

			System.out.println("Element is not clicked  :" + e.getMessage());

		}
		return flag;
	}

	public static boolean typetext(String loc, String value) {
		boolean flag = false;
		try {
			driver.findElement(By.xpath(loc)).sendKeys(value);
			flag = true;
			test.log(Status.PASS, value+" is typed in "+loc);
			
		}

		catch (Exception e) {

			test.log(Status.FAIL, e.getMessage());
			//System.out.println("Element is not typed  :" + e.getMessage());

		}
		return flag;
	}
	
	public static boolean typenumber(String loc, String b) {
		boolean flag = false;
		try {
			Integer.parseInt(b);
			driver.findElement(By.xpath(loc)).sendKeys(b);
			
			flag = true;
			test.log(Status.PASS, b+" is typed in "+loc);
			
		}

		catch (Exception e) {

			test.log(Status.FAIL, e.getMessage());
			//System.out.println("Element is not typed  :" + e.getMessage());

		}
		return flag;
	}
	public static boolean fileupload(String loc, String path) {
		boolean flag = false;
		try {
			driver.findElement(By.xpath(loc)).sendKeys(path);
			 test.log(Status.PASS, path + "File Upload successfully" + loc );
			flag = true;
			//System.out.println("File Upload successfully :");

		}

		catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());

			//System.out.println("File Upload  :" + e.getMessage());

		}
		return flag;
	}

	public static boolean dropdownvalue(String path, String value) {
		boolean flag = false;
		try {

			WebElement ddnl = driver.findElement(By.xpath(path));
			Select se = new Select(ddnl);
			se.selectByValue(value);
			flag = true;
			test.log(Status.PASS, "Select the Value");
			System.out.println(se);
		} catch (Exception e) {

			test.log(Status.FAIL, e.getMessage());
		}

		return flag;

	}

	public static boolean dropdownindex(String path, int a) {
		boolean flag = false;
		try {

			WebElement ddnl = driver.findElement(By.xpath(path));
			Select se = new Select(ddnl);
			se.selectByIndex(a);
			flag = true;
			test.log(Status.PASS, "Select the value ");
			
		} catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}

		return flag;
	}

	public static boolean dropdownvisibletext(String loc, String value) {
		boolean flag = false;
		try {

			WebElement element = driver.findElement(By.xpath(loc));
			Select s = new Select(element);
			s.selectByVisibleText(value);
			test.log(Status.PASS, "Selected Value");
			
		} catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}

		return flag;
	}

	public static boolean jsClick(String path) {
		boolean flag = false;

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			flag = true;
			WebElement element = driver.findElement(By.xpath(path));
			js.executeScript("arguments[0].click()", element);
			test.log(Status.PASS, "Element is clicked");

		} catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
		return flag;
	}

	public static boolean jstypetext(String path, String value) {
		boolean flag = false;

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			flag = true;
			WebElement element = driver.findElement(By.xpath(path));
			js.executeScript("arguments[0].value='" + value + "'", element);
			test.log(Status.PASS," Element is typed");
			

		} catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
		return flag;
	}
	
	public static boolean jenumvalue(String loc , int num) {
		boolean flag = false ;
		try {
			
			JavascriptExecutor je =(JavascriptExecutor)driver;
			flag = true ;
			
			WebElement ele = driver.findElement(By.xpath(loc));
			je.executeScript("arguments[0].num='" + num  + "'", ele);
			test.log(Status.PASS," Element is typed");
		}	
		catch (Exception e) {
			
			test.log(Status.FAIL,e.getMessage());
		}
		return flag;
		
	}

	public static boolean swicthtoframebyindex(int index) {
		boolean flag = false;
		try {
			driver.switchTo().frame(index);
			flag = true;
			test.log(Status.PASS, "Switched to frame");
			
		} catch (Exception e) {
			
			test.log(Status.FAIL, e.getMessage());
		}
		return flag;
	}



  public static boolean doubleclick(String path) { action boolean flag = false;
  try {
  
 driver.findElement(By.xpath(path)).doubleClick().perform(); flag = true;
  System.out.println("element is click:"); }catch (Exception e) {
  System.out.println("element is not click:" +e.getMessage()); }
 


 /* boolean Rightclick(String path1) { boolean flag1 = false; try {
  
  driver.findElement(By.xpath(path1)).contextClick().perform(); flag1 = true;
  System.out.println("element is click:"); }catch (Exception e) {
  System.out.println("element is not click:" +e.getMessage()); }
  */
  
  } 
  
  boolean fileupload(String loc) { 
  boolean flag1 = false;
  try {
  driver.findElement(By.xpath(loc)).click();
  flag1 = true;
  test.log(Status.PASS, "File UPloaded");
  
  } catch (Exception e) {
	  test.log(Status.FAIL, e.getMessage());
	  
  }
  return flag1; }
  
  public static void  sheet ()
  {
	//Sheet S = new Sheet();
	  
	  
  }
  
  }
  
 