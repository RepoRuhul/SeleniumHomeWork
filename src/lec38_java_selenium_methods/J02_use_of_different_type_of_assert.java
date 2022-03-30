package lec38_java_selenium_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// high level
// alternative of click()
public class J02_use_of_different_type_of_assert {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tofael\\eclipse-workspace\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.mountsinai.org/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
	}
	
	@Test (enabled = false, priority = 1)
	public void logoTest01() {	
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Mount Sinai']"));
		boolean flag = logo.isDisplayed();
		System.out.println("Is the logo displayed? Ans: "+flag);
		Assert.assertTrue(true, "The logo is not present in the Application");
		
	}
	
	@Test (enabled = false, priority = 2)
	public void logoTest02() {	
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Mount Sinai']"));
		boolean flag = logo.isDisplayed();
		System.out.println("Is the logo displayed? Ans: "+flag);
		Assert.assertTrue(true, "The logo is not present in the Application");
		// TODO Why line 55 is not printing
	}
	
	@Test (enabled = true, priority = 3)
	public void titleTest() {	
		String expected = "Mount Sinai Health System - New York City | Mount Sinai - New York";
		String actual = driver.getTitle();
		System.out.println("Home Page Title is: "+actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match ...");	
		// we used below code just to show that in hard assert, the code execution doesn't proceed after line 66
		WebElement language = driver.findElement(By.className("goog-te-combo"));
		Select select = new Select(language);
		select.selectByIndex(10000000);
	}
	
	//TODO need to find good explanation
	
	@Test (enabled = false, priority = 4)
	public void contactNumberTest() {	
		driver.findElement(By.xpath("(//span[text()='1-807-MD-SINAI'])[1]")).isDisplayed();
		SoftAssert st = new SoftAssert();
		st.assertTrue(true);
		// we used below code just to show that in soft assert, the code execution proceed to that
		WebElement language = driver.findElement(By.className("goog-te-combo"));
		Select select = new Select(language);
		select.selectByIndex(100000);
		st.assertAll(); // interview question
	}		
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
