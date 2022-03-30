package lec38_java_selenium_methods;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F08_use_of_webdrivermanager_for_firefox_driver {
	// Important interview question
	WebDriver driver; 

	@BeforeTest
	public void setUp() {
		// Mac user please try with Safari driver
		// WebDriverManager.safaridriver().setup();
		// driver = new SafariDriver();
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
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
