package coreAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.testng.TestNGCucumberRunner;

public class OpenAndCloseBrowser {

	public static WebDriver driver;
	private TestNGCucumberRunner testRunner;
	

	public WebDriver setUp(WebDriver driver) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SW\\chromedriver.exe");
		System.out.println("Opening chrome browser");
		driver = new ChromeDriver();
		System.out.println();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("OCB");
		return driver;
		
	}

	// @BeforeClass(alwaysRun = true)
	public WebDriver openUrl(String url) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\kamlesh.maurya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// System.out.println("Opening chrome browser");
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(url);
		System.out.println("Open and close browser class method --> Open Url");
		Thread.sleep(5000);
		//return driver;
		return null;

	}

	//@AfterClass
	public void closeBrowser() throws InterruptedException {
		//driver.close();
		//driver.quit();
		System.out.println("Closed the browser");
	}

}
