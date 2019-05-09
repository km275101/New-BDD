package coreAction;


import org.testng.annotations.BeforeMethod;
import pageFunctions.LoginTestPF;

public class Initialize extends OpenAndCloseBrowser{

	public ActionDriver ad ;
	public LoginTestPF lpf ;
	
	@BeforeMethod
	public void initialize(){
		
		ad = new ActionDriver(driver);
		lpf = new LoginTestPF(driver);
		System.out.println("Initialize class :"+driver);
	}
	
}
