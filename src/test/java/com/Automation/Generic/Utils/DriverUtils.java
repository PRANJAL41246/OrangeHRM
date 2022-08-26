package com.Automation.Generic.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	static WebDriver driver;
	public static void createDriver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pranjal.kumar\\eclipse-workspace\\Travel_Sigma\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	public static WebDriver getDriver() {
		if(driver==null) {
			createDriver();
		}
		return driver;
	}
}
