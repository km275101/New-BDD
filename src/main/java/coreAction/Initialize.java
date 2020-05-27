package coreAction;


import pageFunctions.LoginTestPF;

import org.testng.annotations.BeforeMethod;

import cucumber.api.java.Before;



public class Initialize extends OpenAndCloseBrowser{
	
	//protected LoginDataProvider ldp = new LoginDataProvider();
	
	// PageFunctions Class
	protected LoginTestPF login ;
	
	
	public void initialize() {
		login = new LoginTestPF(driver);
		
		
	}

}
