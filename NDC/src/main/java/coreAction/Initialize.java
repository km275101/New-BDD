package coreAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import pageElements.LoginTestPE;
import pageFunctions.LoginTestPF;

public class Initialize extends OpenAndCloseBrowser{

	protected ActionDriver ad;
	protected LoginTestPE lpf;

	@BeforeMethod 
	public void initialize(){
	 
	  ad = new ActionDriver(driver); 
	  lpf = new LoginTestPF(driver);
	  System.out.println("Initialize class :"+driver); }
	 

}
