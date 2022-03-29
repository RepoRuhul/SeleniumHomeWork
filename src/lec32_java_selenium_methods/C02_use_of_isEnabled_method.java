package lec32_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// isEnabled() is the method used to verify if the web element is enabled or
// disabled within the web page. isEnabled() is primarily used with buttons.
// Use of isEnabled(), a boolean type method

public class C02_use_of_isEnabled_method {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
	}
		
	@Test (enabled = true, priority = 2)
	public void loginButtonTest() throws InterruptedException {
		boolean loginButtonEnabled =	driver.findElement(By.xpath("//button[@id='cms-login-submit']")).isEnabled();
		System.out.println("Is the Login Button Enable? Ans: "+loginButtonEnabled);
		Thread.sleep(5000); 
	}
	

	// if there is a no priority, which one will run first? -- Alphabetically
	// nur = New user Registration
	@Test (enabled=true, priority = 1)
	 public void newUserRegistrationTest() {
		boolean nurButtonEnabled=driver.findElement(By.xpath("//a[text()='New User Registration']")).isEnabled();
		System.out.println("Is the New User Registration Button Enable? Ans: "+nurButtonEnabled);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
