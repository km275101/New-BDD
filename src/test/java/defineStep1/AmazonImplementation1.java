package defineStep1;


import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import coreAction.Initialize;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.LoginDataProvider;
public class AmazonImplementation1 extends Initialize{
	
	//LoginTestPF login = new LoginTestPF(driver);
	LoginDataProvider ldp = new LoginDataProvider();
	/*@Before
	public void start() throws InvalidFormatException, InterruptedException {
		setup("chrome");
		initialize();
	}*/
	@Given("^users open login page$")
	public void users_open_login_page() throws Throwable {
		
		System.out.println("Opening amazon URL");
		
		
		
		}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_credentials(DataTable table) throws Throwable {
		
		Map<String, String> map = table.asMap(String.class, String.class);
		
		
		
		List<List<String>> l = table.raw();
		String user = l.get(0).get(0).toString();
		String pass = l.get(0).get(1).toString();
		login.clickYourOrders();
		/*List<String> l = ldp.getUserDetails();
		String userName = l.get(0);
		String pass = l.get(1);*/
		login.setUsername(user);
		login.clickLogin();
		login.setPass(pass);
		login.clickLogin();
		
	}

	@And("^click submit button$")
	public void click_submit_button() throws Throwable {
		login.clickLogin();
		
	}

	@Then("^user sees the login page$")
	public void user_sees_the_login_page() throws Throwable {
	    System.out.println("Successful login");
	}

}
