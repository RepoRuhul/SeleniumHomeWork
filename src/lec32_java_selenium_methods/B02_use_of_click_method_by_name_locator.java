package lec32_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B02_use_of_click_method_by_name_locator {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
	}
	
	@Test
	public void loginButtonTest() throws InterruptedException {
		driver.findElement(By.name("Submit Login")).click();
		Thread.sleep(5000); // this is not a part of testing, we used it to see the action is happened
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
