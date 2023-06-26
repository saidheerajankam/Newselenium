package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestApplicationsProperties {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		
//		//URL
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println("Current URL - +currentUrl");
		
//		//Title
//		String title = driver.getTitle();
//		System.out.println("Titlr - +title");
//		
		//HTML page source
		String pagesource = driver.getPageSource();
		System.out.println("pagesource");
		driver.quit();
	}
}
