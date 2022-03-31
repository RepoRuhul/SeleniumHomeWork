package hW_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_15_03152022_01b {
WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ruhul\\eclipse-workspace\\SeleniumHomeWork\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void linkText() throws InterruptedException {
		driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(5000); 
	}
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
