package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup(); // to open chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // to import
		driver.manage().window().maximize(); // to maximize chrome browser page
		driver.get("https://www.google.com/"); // link which we have to give
	    driver.findElement(By.name("q")).sendKeys("HYR Tutorials");
	    driver.findElement(By.name("q")).submit();
	    Thread.sleep(3000);
	    driver.navigate().to("https://www.redbus.in/");
	    Thread.sleep(3000);
	    driver.findElement(By.id("src")).sendKeys("Hyderabad");
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(3000);
	    driver.navigate().forward();
	    Thread.sleep(3000);	    
	    driver.quit();
	    
	}
}