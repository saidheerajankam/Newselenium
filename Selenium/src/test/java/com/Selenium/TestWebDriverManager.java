package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebDriverManager {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver= new ChromeDriver(options);
		
	//	options.setExperimentalOption("excludesSwitches", new String[] { "enable-automation" });
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://github.com/login");

	}

}
