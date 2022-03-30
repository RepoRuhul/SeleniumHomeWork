package lec36_java_selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// This code is the explanation of the interview question
public class I02_FastestWebDriver {
	// clicking New User Registration button
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\January2022CoreJava\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); // FirefoxOptions for Firefox headless
		options.addArguments("--headless");	// also we can run in incognito	
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://portaldev.cms.gov/portal/");
		System.out.println("The Current URL is: "+driver.getCurrentUrl());	
		System.out.println("Test execution completed");
		driver.quit();
	}
}
