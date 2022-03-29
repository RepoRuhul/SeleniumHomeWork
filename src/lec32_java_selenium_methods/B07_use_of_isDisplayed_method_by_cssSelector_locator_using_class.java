package lec32_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B07_use_of_isDisplayed_method_by_cssSelector_locator_using_class {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
	}
	
	// if the class contain separate words, they are actually different class, then
	// we have to close the gap between class by putting dot/period between them
	// cssSelector by class --> first html tag, then dot, then write class name inside the string, 
	// remove the space between class, and replace with dot or period
	// future reference: isDisplayed() should be used after explaining
	@Test (enabled = true, priority = 1)
	public void loginModalHeaderTest() throws InterruptedException {
		boolean flagElement= driver.findElement(By.cssSelector("em.cms-icon.cms-sprite-loggedout.mt-0.mb-0")).isDisplayed();
		Thread.sleep(5000); 
		System.out.println(flagElement); //true outcome created from this line
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
