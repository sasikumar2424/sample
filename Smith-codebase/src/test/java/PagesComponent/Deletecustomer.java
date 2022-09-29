package PagesComponent;

import utilscomponent.uiutils;

public class Deletecustomer extends uiutils {
	
	String Deletecustomer ="(//a [contains(text(),'Delete Customer')])[1]";
	String Textfield ="//input[@type='text']";
	String SubmitButton="//input [@type='submit']";

	public void Deletelogin() throws InterruptedException {
		
		click(Deletecustomer);
		Thread.sleep(3000);
		
		typetext(Textfield, "12334");
		Thread.sleep(3000);
		click(SubmitButton);
		
	}
		
		

	}


