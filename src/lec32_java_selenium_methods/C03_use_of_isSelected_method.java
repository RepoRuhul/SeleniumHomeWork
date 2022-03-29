package lec32_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lec04_01_java_variables_initialized.MyInfo;

// isEnabled() is the method used to verify if the web element is enabled or
// disabled within the web page. isEnabled() is primarily used with buttons.
// Use of isEnabled(), a boolean type method

public class C03_use_of_isSelected_method {
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
	
	//TODO Nasir
	@Test(enabled = true, priority = 1)
	public void checkBoxEnabledTest01() throws InterruptedException {
		driver.findElement(By.cssSelector("label#cms-label-tc")).click(); // it will click the check box
		//Thread.sleep(5000); // Then wait
		boolean checkBoxEnabled = driver.findElement(By.cssSelector("label#cms-label-tc")).isSelected(); // Evaluate selected or not
		System.out.println("Is the Check Box Selected? Ans: " + checkBoxEnabled);
		Thread.sleep(5000);
	}
	//My ANSWER: by default check box is not selected, that's why showing false
	@Test(enabled = false, priority = 2)
	public void checkBoxEnabledTest02() throws InterruptedException {
		//Thread.sleep(5000);
		boolean checkBoxEnabled = driver.findElement(By.cssSelector("label#cms-label-tc")).isSelected(); // Evaluate selected or not
		System.out.println("Is the Check Box Selected? Ans: " + checkBoxEnabled);
		Thread.sleep(5000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
