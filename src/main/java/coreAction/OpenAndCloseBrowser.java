package coreAction;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import cucumber.api.java.Before;
import dataProvider.LoginDataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenAndCloseBrowser {

	public static WebDriver driver;
	
		
		public void setup(String browser) throws InterruptedException, InvalidFormatException {
			browser ="chrome";
			if (browser.equalsIgnoreCase("CHROME")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("FireFox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			LoginDataProvider ldp = new LoginDataProvider();
			String url = ldp.getUrlDetails(1,1);
			driver.get(url);
		
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
