package lec36_java_selenium_methods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class I01_webBasedAlert {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tofael\\eclipse-workspace\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
	}
	
	@Test(enabled = true, priority = 1)
	public void acceptTheAlertFromWindow() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println("The text of the Alert is: "+alert.getText()); 
		// line 35-36, not part of the function, we just added to know about the text present in alert
		alert.accept(); // To accept the alert
	}
	
	@Test (enabled = true, priority = 2)
	public void dismissTheAlertFromWindow() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss(); // to cancel the Alert
	}
			
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
	
	
	
	

}
