package hW_16_03152022.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_16_03152022_01a {
WebDriver driver;

@BeforeTest
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ruhul\\git\\January2022CoreJava\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.bestbuy.com/");
}

@Test (enabled = true, priority = 1)
public void loginButtonTest() throws InterruptedException {
	boolean elementDisplayed =driver.findElement(By.xpath("//img[@class='block']")).isDisplayed();
	System.out.println("Is the logo displayed? Ans: "+ elementDisplayed);
	Thread.sleep(5000); 
}
@Test (enabled = true, priority = 2)
public void logoTest() throws InterruptedException {
	boolean elementDisplayed =driver.findElement(By.xpath("//button[@class='c-button c-button-secondary c-button-sm email-signup-button']")).isDisplayed();
	System.out.println("Is the login button enable? Ans: "+ elementDisplayed);
	Thread.sleep(5000); 
}

@Test (enabled = true, priority = 3)
public void currentUrlTest() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='Sign in or Create Account']")).click();
	System.out.println("The current url is: "+ driver.getCurrentUrl());
	Thread.sleep(5000); 
}

@Test (enabled = false, priority = 4)
public void checkBoxEnabledTest() throws InterruptedException {
	driver.findElement(By.cssSelector("c-checkbox-input appearance-none border-25 rounded-25 ")).click();
	boolean checkBoxEnabled=driver.findElement(By.cssSelector("c-checkbox-input appearance-none border-25 rounded-25 ")).isSelected();
	System.out.println("Is the check box selected? Ans: "+ checkBoxEnabled);
	Thread.sleep(5000); 
	}
	
@Test(enabled =true, priority = 5 )
public void titleTest() {
	System.out.println("The title of the page is:" + driver.getTitle());
}

@Test(enabled =false, priority = 6 )
public void getTheTextTest() {
	WebElement sca =driver.findElement(By.xpath("//a[text()='Sign in or Create Account']"));
	System.out.println("The text for the webElement is: " +sca.getText());
}

@Test(enabled =false, priority = 7)
public void getAttributeTest() {
	String value =driver.findElement(By.xpath("//a[text()='Sign in or Create Account']")).getAttribute("class");
	System.out.println("The value of the class attribute is: " +value);
}

@Test(enabled =false, priority = 8)
public void searchFieldTest() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='gh-search-input']")).sendKeys("iphone 13");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@class='header-search-icon']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='gh-search-input']")).clear();
}
@AfterTest
public void tearUp() {
	driver.quit();
}

}
