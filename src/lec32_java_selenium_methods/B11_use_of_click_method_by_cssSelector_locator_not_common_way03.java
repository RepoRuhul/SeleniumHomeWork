package lec32_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B11_use_of_click_method_by_cssSelector_locator_not_common_way03 {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
	}
	
	// cssSelector by another attribute
		// --> first html tag then [attribute name='value'] inside the string
	@Test
	public void loginButtonTest() throws InterruptedException {
		driver.findElement(By.cssSelector("button#cms-login-submit[name='Submit Login']")).click();
		Thread.sleep(5000); 
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
	/*
	SUB-STRING MATCHES:
    CSS in Selenium has an interesting feature of allowing partial string matches using ^, $, and *.
    https://www.softwaretestingmaterial.com/css-selector-selenium-webdriver-tutorial/
	 */
	
}
