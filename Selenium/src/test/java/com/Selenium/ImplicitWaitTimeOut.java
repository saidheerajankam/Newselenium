package com.Selenium;

import java.awt.Dimension;
import java.time.Duration;
import java.time.Instant;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//public String email = "Sai";

public class ImplicitWaitTimeOut {

	
	



	public void	MyFirstTest() throws InterruptedException { 
		WebDriverManager.chromedriver().setup(); // to open chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // to import
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize(); // to maximize chrome browser page
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html"); // link which we have to give
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("SAI");
	}
	
	

public void MySecondTest() throws Exception {
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);		
	driver.manage().window().maximize();
//	WebDriverWait wait = new WebDriverWait(driver,10);
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	wait.withTimeout(Duration.ofSeconds(4));
	driver.get("https://testproject.io/");
	String parentWindow = driver.getWindowHandle();
	driver.findElement(By.linkText("Login")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	for (String windowHandle : windowHandles) {
		if (!windowHandle.equals(parentWindow)) {
			driver.switchTo().window(windowHandle);
//			Function<WebDriver, Boolean> f = new Function<WebDriver, Boolean>() {
//				@Override
//				public Boolean apply(WebDriver WebDriver) {
//					return WebDriver.findElement(By.id("username")).isDisplayed();
//				}
//				};
				
			
		
	//		wait.until(f);
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
			
			driver.findElement(By.id("username")).sendKeys("SAI");
		}
	}
	}
}

	
		


