package PagesComponent;

import utilscomponent.uiutils;

public class Editcustomerpage extends uiutils {
	
	
String Editcustomer ="//a[contains(text(),'Edit Customer')]";
String Textfield ="//input [@type='text']";
String SubmitButton="//input[@type='submit']";

public void doeditcustomer () throws InterruptedException {
	
	
	click(Editcustomer);
	Thread.sleep(3000);
	
	typetext(Textfield, "12334");
	Thread.sleep(3000);
	click(SubmitButton);
	
}

//	typetext("//input[@type='text']", getExceldata("Loginpage", 2, 0));
//

//	click("//input[@type='submit']");
//	Thread.sleep(3000);


}
