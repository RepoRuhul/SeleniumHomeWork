package lec32_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B05_use_of_click_method_by_partialLinkText_locator {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000); 
	}
	
	// source: at the bottom of the page, first element from Sell column is 'Start Selling'
	// when there is no priority, then the test cases run alphabetically
	@Test (enabled = true, priority = 1)
	public void startSellingTest02() throws InterruptedException{
		driver.findElement(By.partialLinkText("Start se")).click();
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
