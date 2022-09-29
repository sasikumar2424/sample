package TestComponent;

import utilscomponent.uiutils;

public class SanityTest extends uiutils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extentreportinitiate();
		test=extent.createTest("Verify Registration page");
		browserlaunch("chrome");
		launchurl("http://demo.automationtesting.in/Register.html");
		typetext("//input[@placeholder='First Name']", "Logan");

		
		typetext("//input[@placeholder='Last Name']", "SD");
		typetext("//textarea[@rows='3']", "17 ba/Washington DC USA");
		typetext("//input[@type='email']", "logan@gamil");
		typetext("//input[@type='tel']", "0987609796");
		click("//input[@value='Male']");
		click("//input[@value='Cricket']");
		click("//input[@value='Movies']");
		click("//input[@value='Hockey']");
		// click("//div[@id='msdd']");
		click("//label[contains(text(),'Languages')]//following::div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']");

		dropdownvalue(
				"//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']//following::ul[@style='list-style:none;max-height: 230px;overflow: scroll;']",
				"Arabic");
		click("//a[contains(text(),'Croatian')]");
		click("//label[contains(text(),'Skills')]");

		// click("//label[contains(text(),'Skills')]");
		dropdownvalue("//select[@id='Skills']", "AutoCAD");
		click("//option[contains(text(),'AutoCAD')]");

		click("//select[@type='text'and@ng-model='country']");
		click("//select[@type='text'and@ng-model='country']");
		click("//span[@role='combobox']");
		
		dropdownvalue("//span[@class='select2-selection__rendered'and@title='Denmark']", "Denmark");
		click("//span[@dir='ltr']//following::li[contains(text(),'Denmark')]");
		
		click("//select[@placeholder='Year']//following::option[contains(text(),'1916')]");
		click("//select[@placeholder='Month']//following::option[contains(text(),'January')]");
		click("//select[@placeholder='Day']//following::option[contains(text(),'31')]");
		
		typetext("(//input[@type='password'])[1]", "logann");
		typetext("(//input[@type='password'])[2]", "logann");
		click("//button[contains(text(),'Submit')]");
		//click("//button[contains(text(),'Refresh')]");
	
		extentreportfinisher();

	}

}
