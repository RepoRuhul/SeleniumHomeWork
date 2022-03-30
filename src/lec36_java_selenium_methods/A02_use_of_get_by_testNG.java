package lec36_java_selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A02_use_of_get_by_testNG {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		// 1st way, to show the location of chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\January2022CoreJava\\driver\\chromedriver.exe"); // absolute path
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void urlTest() {
		driver.get("https://www.amazon.com");
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	

}
