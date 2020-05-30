package defineStep1;



import coreAction.Initialize;
import cucumber.api.java.en.Given;


public class ScenarioOutline extends Initialize {

	@Given("^users is in login page validate \"([^\"]*)\" and \"([^\"]*)\" Scenario Outline$")
	public void users_is_in_login_page_validate_and_Scenario_Outline(String arg1, String arg2) throws Throwable {
		
		System.out.println(arg1);
		System.out.println(arg2);
		

	}
	
	@Given("^Test \"([^\"]*)\" test$")
	public void test_test(String arg1) throws Throwable {
	    System.out.println(arg1);
	}
}
