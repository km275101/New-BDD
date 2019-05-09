package defineStep;


import coreAction.Initialize;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junitRunner.Runner;
import pageFunctions.LoginTestPF;
public class AmazonImplementation extends Initialize{
	
	
	@Given("^users open login page$")
	public void users_open_login_page() throws Throwable {
		setUp();
		System.out.println("Opening amazon URL");
		System.out.println("Driver : "+driver);
		openUrl("http://www.amazon.in");
	}

	@When("^user enters credentials$")
	public void user_enters_credentials() throws Throwable {
		
		lpf = new LoginTestPF(driver);
		lpf.clickYourOrders();
		lpf.setUsername("km275101@gmail.com");
		lpf.clickLogin();
		lpf.setPass("");
		
	}

	@And("^click submit button$")
	public void click_submit_button() throws Throwable {
		/*lpe2 = new LoginTestPE2(driver);
		lpe2.submit.click();*/
		
	}

	@Then("^user sees the login page$")
	public void user_sees_the_login_page() throws Throwable {
	    System.out.println("Successful login");
	}

}
