package hW_15_03152022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_15_03152022_01a {
WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ruhul\\git\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ebay.com/");
	}
	@Test(enabled = false, priority = 01)
	public void buttonTest() throws InterruptedException {
		driver.findElement(By.id("gh-as-a")).click();
		Thread.sleep(5000); 
	}
	@Test(enabled = false, priority = 02)
	public void SearchButtonTest() throws InterruptedException {
		driver.findElement(By.cssSelector("input.btn.btn-prim.gh-spr")).click();
		Thread.sleep(5000);
	}
	@Test(enabled = false, priority = 03)
	public void partialLinkText() throws InterruptedException {
		driver.findElement(By.partialLinkText("Registra")).click();
		Thread.sleep(5000);
	}
	@Test(enabled= true, priority = 4)
	public void linkText() throws InterruptedException {
		driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(5000); 
	}
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
