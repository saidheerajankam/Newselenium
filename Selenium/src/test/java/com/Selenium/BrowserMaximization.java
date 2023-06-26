package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMaximization {

	public static void main(String[] args) throws Exception {
		//Way 1-Chrome (after opening browser window will maximize)
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options); 	
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
		
		
		
		//Way 2-Chrome (it will open browser in maximized view only)
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options); 	
		driver.get("https://www.google.com/");
	}
}
