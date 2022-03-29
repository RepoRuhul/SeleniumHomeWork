package lec32_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B06_use_of_click_method_by_cssSelector_locator_using_class {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
	}
	
	// cssSelector is very important for interview
	// cssSelector by class --> first html tag, then dot, then write class name inside the string
	@Test (enabled = true, priority = 1)
	public void newUserRegistrationButtonTest() throws InterruptedException {
		driver.findElement(By.cssSelector("a.cms-newuser-reg")).click();
		Thread.sleep(5000); 
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
