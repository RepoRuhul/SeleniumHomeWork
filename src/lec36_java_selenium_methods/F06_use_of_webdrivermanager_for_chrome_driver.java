package lec36_java_selenium_methods;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F06_use_of_webdrivermanager_for_chrome_driver {
	// Important interview question
	WebDriver driver; 

	@BeforeTest
	public void setUp() {
		// if you choose version, then it will use that specific version
		// if you don't use driverVersion() method, it will open the most updated version
		WebDriverManager.chromedriver().driverVersion("98.0.4758.102").setup();
		// https://chromedriver.chromium.org/downloads -- to get some older version, see below
		// 97.0.4692.71, 96.0.4664.45, 95.0.4638.69, 94.0.4606.113
		// if no version is used, please follow below line
		// WebDriverManager.chromedriver().setup();
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
