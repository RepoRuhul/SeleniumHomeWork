package lec35_java_selenium_methods;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class F06_use_of_webdrivermanager {
	// Important interview question
	WebDriver driver; 

	// incomplete but the complete message is in line 22
	@BeforeTest
	public void setUp() {
		// if you choose version, then it will use that specific version
		// if you don't use driverVersion() method, it will open the most updated version
		// WebDriverManager.chromedriver().driverVersion("96").setup();
		// WebDrivermanager.chromedriver.setUp();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // for Page
		driver.get("https://portal.cms.gov/portal/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // for webElements
	}
	
	@Test(enabled = true, priority = 1)
	public void loginButtonTest() throws InterruptedException{
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(3000); 
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
