package com.Selenium;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPageLoadTimeout {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup(); // to open chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // to import
		driver.manage().window().maximize(); // to maximize chrome browser page

		Instant StartTime = Instant.now();
		System.out.println(StartTime.toString());

	 	driver.get("https://www.irctc.co.in/nget/train-search"); // link which we have to give
		
		
		Instant EndTime = Instant.now();
		System.out.println(EndTime.toString());
		Duration duration = Duration.between(StartTime, EndTime);
		System.out.println("pageLoad time: " + duration.toSeconds());
		System.out.println(driver.getTitle());
		driver.quit();

	}
}