package PagesComponent;

import utilscomponent.uiutils;

public class Loginpage extends uiutils{
	
	
	String bankmodule="//a[contains(text(),'Bank Project')]";
	String username="//input[@maxlength='10']";
	String password="//input[@onkeyup='validatepassword();']";
	String loginbutton="//input[@value='LOGIN']";
	
	
	
	
	public void dologin() throws Exception
	{
		click(bankmodule);
		Thread.sleep(15000);
		typetext(username, getExceldata("Loginpage", 2, 0));
		typetext(password, getExceldata("Loginpage", 3, 0));
		click(loginbutton);
	}

}
