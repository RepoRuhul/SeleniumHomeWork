package hW_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_15b {
WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ruhul\\git\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ebay.com/");
	}
	@Test(enabled = true, priority = 01)
	public void buttonTest01() throws InterruptedException {
		driver.findElement(By.id("gh-as-a")).click();
		Thread.sleep(5000); 
	}
	@Test(enabled = false, priority = 02)
	public void SearchButtonTest02() throws InterruptedException {
		driver.findElement(By.cssSelector("input.btn.btn-prim.gh-spr")).click();
		Thread.sleep(5000);
	}
	
	@Test(enabled = true, priority = 03)
	public void SearchFieldTest03() throws InterruptedException {
		driver.findElement(By.name("_nkw")).click();
		Thread.sleep(5000);
	}
	@Test(enabled = false, priority = 04)
	public void partialLinkText04() throws InterruptedException {
		driver.findElement(By.partialLinkText("Registra")).click();
		Thread.sleep(5000);
	}
	@Test(enabled= true, priority = 5)
	public void linkText05() throws InterruptedException {
		driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(5000); 
	}
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
