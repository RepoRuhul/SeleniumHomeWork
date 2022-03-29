package lec32_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B08_use_of_click_method_by_cssSelector_locator_using_id {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
	}
	
	// cssSelector by id 
	// --> first html tag, then # (hash), then write the value of id inside the string
	@Test
	public void loginButtonTest() throws InterruptedException {
		driver.findElement(By.cssSelector("button#cms-login-submit")).click();
		Thread.sleep(5000); 
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
