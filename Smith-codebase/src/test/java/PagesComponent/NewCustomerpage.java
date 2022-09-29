package PagesComponent;

import utilscomponent.uiutils;

public class NewCustomerpage extends uiutils{
	
	String Newcustomer="//a[contains(text(),'New Customer')]";
	String textfield="(//input[@type=\"text\"])[1]";
	String radiobutton="(//input[@name='rad1'])[1]";
	String DF="//input[@type='date' ]";
	String DOB = ("//input[@type='date' and @name='dob']");
	
	public void donewcustomerregister() throws InterruptedException {
	click(Newcustomer);
	// typetext("(//input[@type=\"text\"])[1]", getExceldata("Loginpage", 4, 0));
	typetext(textfield, "log");
	click(radiobutton);
	Thread.sleep(3000);
	click(DF);	
//	Thread.sleep(2000);
	
jenumvalue(DOB,12041797);
	}


}
