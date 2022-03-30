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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// high level
// alternative of click()
public class J01_use_of_explicitly_wait {
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
	public void requestAnAppointmentTest01() throws InterruptedException {		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Request an Appointment') and @class='hidden-xs dropdown']"))).click();
	 	driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
		Thread.sleep(2000);
	}
	// the below xpath was created for line 43, but not working, have to think about it
	//input[@name='name']//parent::div[@class='form-group form-inline']
	
	@Test (enabled = false, priority = 2)
	public void requestAnAppointmentTest02() throws InterruptedException {		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Request an Appointment') and @class='hidden-xs dropdown']")));
	 	driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
		Thread.sleep(2000);
	}
	
	@Test (enabled = true, priority = 3)
	public void requestAnAppointmentTest03() throws InterruptedException {	
		WebElement requestAnAppointment = driver.findElement(By.xpath("//a[contains(text(), 'Request an Appointment') and @class='hidden-xs dropdown']"));
		wait.until(ExpectedConditions.visibilityOf(requestAnAppointment)).click();
	 	driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
		Thread.sleep(2000);
	}
	
	@Test (enabled = false, priority = 4)
	public void requestAnAppointmentTest04() throws InterruptedException {		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(), 'Request an Appointment') and @class='hidden-xs dropdown']")));
	 	driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
		Thread.sleep(2000);
	}
	
	@Test (enabled = false, priority = 5)
	public void requestAnAppointmentTest05() throws InterruptedException {
		WebElement raa = driver.findElement(By.xpath("//a[contains(text(), 'Request an Appointment') and @class='hidden-xs dropdown']"));
		wait.until(ExpectedConditions.textToBePresentInElement(raa, "Request an Appointment"));
	 	driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
		Thread.sleep(2000);
	}
	
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
