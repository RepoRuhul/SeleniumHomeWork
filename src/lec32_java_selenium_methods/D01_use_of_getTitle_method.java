package lec32_java_selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D01_use_of_getTitle_method {
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
	
	// how can you find the title of the page?
	// right click on an empty place of any page -- click "view page source" -- ctrl+f (to find) -- Type title
	@Test(enabled = true, priority = 1)
	public void titleTest() {
		System.out.println("The Title of the page is: " + driver.getTitle());	
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
