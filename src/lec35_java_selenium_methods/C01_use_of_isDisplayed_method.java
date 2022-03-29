package lec35_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//isDisplayed() is an alternate of click()method which is boolean type
//isDisplayed() is the method used to verify the presence of a web element
//within the web page.
//Use of isDisplayed()
// available- image, link, button, text field, check box etc.
public class C01_use_of_isDisplayed_method {
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

	// cssSelector by another attribute
	// --> first html tag then [attribute name='value'] inside the string
	@Test
	public void logoTest() throws InterruptedException {
		boolean elementDisplayed = driver
				.findElement(By.xpath(
						"//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']"))
				.isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + elementDisplayed);
		Thread.sleep(5000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
