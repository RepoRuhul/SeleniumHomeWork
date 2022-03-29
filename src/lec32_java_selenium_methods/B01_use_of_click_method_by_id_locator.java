package lec32_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B01_use_of_click_method_by_id_locator {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ruhul\\eclipse-workspace\\SeleniumHomeWork\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		
		//driver.findElement(By.id("//a[@id='']")).click();
		driver.findElement(By.id("nav-logo-sprites")).click();
		Thread.sleep(5000); // this is not a part of testing, we used it to see the action is happened
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
