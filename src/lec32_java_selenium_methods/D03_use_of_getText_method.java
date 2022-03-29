package lec32_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03_use_of_getText_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tofael\\eclipse-workspace\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
	}
	
	@Test(enabled = true, priority = 1)
	public void getTextTest() {
		WebElement nur = driver.findElement(By.xpath("//a[text()='New User Registration']"));
		System.out.println("The text for the WebElement is: "+nur.getText());
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
